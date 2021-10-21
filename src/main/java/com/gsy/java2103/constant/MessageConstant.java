package com.gsy.java2103.constant;

/**
 * @author: GsheN丶
 * @date: 2021/8/3 9:08
 * @description:
 */
public interface MessageConstant {
    String REGISTER_SUCCESS = "注册成功";
    String REGISTER_FAIL = "注册失败";


    String LOGIN_FAIL = "登录失败";
    String LOGIN_SUCCESS = "登录成功";
    String LOGIN_UNACTIVATED = "对不起,用户未激活";
    String LOGIN_ERROR = "当前登录人数过多，请稍后再试！";
    String LOGIN_NOT_MATCH = "用户名或密码错误";
    String LOGIN_NOT_EXIST = "用户不存在";

    String SELECT_SUCCESS = "查询成功";
    String SELECT_FAIL = "查询失败";

    String UPDATE_SUCCESS = "修改成功";
    String UPDATE_FAIL = "修改失败";

    String INSERT_SUCCESS = "添加成功";
    String INSERT_FAIL = "添加失败";

    String DELETE_SUCCESS = "删除成功";
    String DELETE_FAIL = "删除失败";

}
