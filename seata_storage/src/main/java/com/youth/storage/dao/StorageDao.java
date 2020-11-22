package com.youth.storage.dao;

import org.apache.ibatis.annotations.Update;

public interface StorageDao {

    @Update("update storage set count=count-#{count} where commodity_code=#{commodityCode}")
    int updateStorage(Integer count,Integer commodityCode);
}
