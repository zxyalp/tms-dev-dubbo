package com.hello.tms.dev.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.tms.dev.provider.dao.mapper.TpUserMapper;
import com.hello.tms.dev.provider.model.TpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alp.zxy
 * @date 2019/3/31
 */
@Service("bpUserService")
public class TpUserServiceImp implements TpUserService {

    @Autowired
    private TpUserMapper tpUserMapper;

    @Override
    public void addUser(TpUser user) {
        tpUserMapper.insert(user);
    }

    @Override
    public PageInfo<TpUser> findAllUser(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<TpUser> bpUsers = tpUserMapper.getAll();
        PageInfo rs = new PageInfo(bpUsers);
        return rs;
    }
}
