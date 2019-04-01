package com.hello.tms.dev.provider.service;

import com.github.pagehelper.PageInfo;
import com.hello.tms.dev.provider.model.TpUser;

/**
 * @author alp.zxy
 * @date 2019/3/31
 */
public interface TpUserService {
    void addUser(TpUser user);

    PageInfo<TpUser> findAllUser(int pageNum, int pageSize);
}
