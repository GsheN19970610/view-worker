package com.gsy.java2103.service.impl;

import com.gsy.java2103.constant.MessageConstant;
import com.gsy.java2103.mapper.IUserMapper;
import com.gsy.java2103.pojo.User;
import com.gsy.java2103.service.UserService;
import com.gsy.java2103.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author ghy
 * @version 1.0
 * @date 2021-07-30
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public ResultVO login(String username, String password){

        ResultVO resultVO = new ResultVO();
        User loginUser = userMapper.findByName(username);

        //1为未激活


        if (loginUser != null){
            try {
                if(password.equals(loginUser.getPassword())) {
                    return ResultVO.ok(MessageConstant.LOGIN_SUCCESS, loginUser);
                }
                return ResultVO.error(MessageConstant.LOGIN_NOT_MATCH);
            } catch (Exception e) {
                e.printStackTrace();
                return ResultVO.error(MessageConstant.REGISTER_FAIL, MessageConstant.LOGIN_ERROR);
            }
        } else {
            return ResultVO.error(MessageConstant.LOGIN_FAIL, MessageConstant.LOGIN_NOT_EXIST);
    }

    }
}
