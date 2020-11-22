package com.youth.order.dao;

import org.apache.ibatis.annotations.Insert;

public interface OrderDao {

    @Insert("insert into `order`(user_id,commodity_code,count,money) values(#{userId},#{commodityCode},#{count},#{money})")
    Integer createOrder(Integer userId,Integer commodityCode,Integer count,Integer money);
}
