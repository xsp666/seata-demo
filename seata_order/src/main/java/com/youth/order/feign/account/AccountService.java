package com.youth.order.feign.account;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "account-service")
public interface AccountService {

    @GetMapping("/reducerAccountMoney")
    boolean reducerAccountMoney(@RequestParam("userId") Integer userId, @RequestParam("money") Integer money);
}
