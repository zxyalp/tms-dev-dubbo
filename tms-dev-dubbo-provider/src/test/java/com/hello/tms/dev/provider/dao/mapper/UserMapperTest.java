package com.hello.tms.dev.provider.dao.mapper;

import com.hello.tms.dev.provider.model.TpUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private TpUserMapper tpUserMapper;

    @Test
    public void testInsert(){
        TpUser tpUser = new TpUser();
        tpUser.setUserName("李浩东");
        tpUser.setPassword("123123");
        tpUser.setPhone("1320000000");
        tpUserMapper.insert(tpUser);
    }

    @Test
    public void testQuery(){
        List<TpUser> tpUsers = tpUserMapper.getAll();
        System.out.println(tpUsers.toString());
    }


}
