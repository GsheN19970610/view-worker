package com.gsy.java2103.service;


import com.gsy.java2103.pojo.User;
import com.gsy.java2103.vo.ResultVO;

/**
 * @author ghy
 * @version 1.0
 * @date 2021-07-30
 **/
public interface UserService {
    void save(User user);

    ResultVO login(String username, String password);
}
