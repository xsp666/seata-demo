package com.youth.order.service;

import com.youth.order.dao.OrderDao;
import com.youth.order.dto.UpdateDTO;
import com.youth.order.feign.account.AccountService;
import com.youth.order.feign.storage.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @GlobalTransactional(rollbackFor = Exception.class)
    public boolean createOrder(){
        Integer userId=1001;
        Integer money=5;
        Integer commodityCode=2001;
        Integer count=5;
        orderDao.createOrder(userId,commodityCode,count,money);
        accountService.reducerAccountMoney(userId,money);

        UpdateDTO updateDTO=new UpdateDTO();
        updateDTO.setCommodityCode(commodityCode);
        updateDTO.setCount(count);
        storageService.updateStorage(updateDTO);
        int a=10/0;
        return true;
    }
}
