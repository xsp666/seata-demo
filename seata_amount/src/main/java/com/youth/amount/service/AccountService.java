package com.youth.amount.service;

import com.youth.amount.dao.AccountDao;
import io.seata.core.context.RootContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountService {

    @Resource
    private AccountDao accountDao;

   // @Transactional(rollbackFor = Exception.class)
    public boolean reducerAccountMoney(Integer userId, Integer money) {
        String xid = RootContext.getXID();
        System.out.println(xid);
        return accountDao.updateAccountMoney(money,userId) > 0;
    }
}
