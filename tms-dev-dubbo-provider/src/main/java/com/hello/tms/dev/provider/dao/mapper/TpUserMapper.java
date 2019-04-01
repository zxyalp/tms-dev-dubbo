package com.hello.tms.dev.provider.dao.mapper;


import com.hello.tms.dev.provider.model.TpUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TpUserMapper {

    @Select("SELECT * FROM tp_user")
    List<TpUser> getAll();

    @Select("SELECT * FROM tp_user WHERE userId=#{userId}")
    TpUser getOne(@Param("userId") int userId);

    @Insert("INSERT INTO tp_user(userName, password, phone)VALUES(#{userName}, #{password}, #{phone})")
    void insert(TpUser tmUser);

    @Update("UPDATE tp_user SET userName=#{userName}, password=#{password}, phone=#{phone} WHERE userId=#{userId}")
    void update(TpUser tmUser);

    @Delete("DELETE FROM tp_user WHERE userId=#{userId}")
    void delete(@Param("userId") int userId);
}