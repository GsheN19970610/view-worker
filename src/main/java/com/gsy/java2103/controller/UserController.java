package com.gsy.java2103.controller;


import com.gsy.java2103.constant.MessageConstant;
import com.gsy.java2103.pojo.User;
import com.gsy.java2103.service.UserService;
import com.gsy.java2103.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: GsheN丶
 * @date: 2021/8/3 1:57
 * @description:
 */
@RestController
@RequestMapping("/user")
@Slf4j
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultVO login(@RequestBody User use){

        ResultVO resultVO = userService.login(use.getUserName(), use.getPassword());

        System.out.println("resultVO = " + resultVO);

        return resultVO;

    }
    @PostMapping("/save")
    public ResultVO save(@RequestBody User user){
        try {
            log.info("{}",user);

            userService.save(user);

            return ResultVO.ok(MessageConstant.REGISTER_SUCCESS);
        } catch (Exception e) {

            return ResultVO.error(MessageConstant.REGISTER_FAIL,e.getMessage());
        }

    }
}
