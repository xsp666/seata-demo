package com.youth.order.feign.storage;

import com.youth.order.dto.UpdateDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "storage-service")
public interface StorageService {

    @PostMapping("/updateStorage")
    boolean updateStorage(@RequestBody UpdateDTO updateDTO);
}
