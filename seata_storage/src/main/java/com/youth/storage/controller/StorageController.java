package com.youth.storage.controller;

import com.youth.storage.UpdateDTO;
import com.youth.storage.service.StorageService;
import io.seata.core.context.RootContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @PostMapping("/updateStorage")
    public boolean updateStorage(@RequestBody UpdateDTO updateDTO) {

        return storageService.updateStorage(updateDTO);
    }
}
