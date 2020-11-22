package com.youth.amount.controller;

import com.youth.amount.service.AccountService;
import io.seata.core.context.RootContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountController {


    @Resource
    private AccountService accountService;

    @GetMapping("/reducerAccountMoney")
    public boolean reducerAccountMoney(@RequestParam("userId") Integer userId,@RequestParam("money") Integer money) {

        return accountService.reducerAccountMoney(userId, money);
    }
}
