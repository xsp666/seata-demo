package com.youth.storage.service;

import com.youth.storage.UpdateDTO;
import com.youth.storage.dao.StorageDao;
import io.seata.core.context.RootContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageService {

    @Resource
    private StorageDao storageDao;

   // @Transactional(rollbackFor = Exception.class)
    public boolean updateStorage(UpdateDTO updateDTO){
        String xid = RootContext.getXID();
        System.out.println(xid);
        int i = storageDao.updateStorage(updateDTO.getCount(), updateDTO.getCommodityCode());
        return i>0;
    }
}
