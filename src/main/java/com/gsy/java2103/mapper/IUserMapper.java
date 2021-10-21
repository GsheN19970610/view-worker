package com.gsy.java2103.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gsy.java2103.pojo.User;


import java.util.List;

/**
 * @author ghy
 * @version 1.0
 * @date 2021-07-30
 **/
public interface IUserMapper extends BaseMapper<User> {



    User findByName(String name);

    Integer save(User user);
}
