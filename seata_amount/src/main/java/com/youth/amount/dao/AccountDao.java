package com.youth.amount.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountDao {

    @Update("update account set money=money-#{money} where user_id=#{userId} and money-#{money}")
    int updateAccountMoney(@Param("money") Integer money,@Param("userId") Integer userId);
}
