package com.gsy.java2103.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: GsheN丶
 * @date: 2021/8/3 2:01
 * @description:通用返回VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO implements Serializable {

    private Boolean success;
    private String message;
    private Object data;

    public static ResultVO ok(String message, Object data){
        ResultVO vo = new ResultVO();
        vo.setSuccess(true);
        vo.setMessage(message);
        vo.setData(data);
        return vo;
    }

    public static ResultVO ok(String message){
        ResultVO vo = new ResultVO();
        vo.setSuccess(true);
        vo.setMessage(message);
        return vo;
    }

    public static ResultVO error(String message, Object data){
        ResultVO vo = new ResultVO();
        vo.setSuccess(false);
        vo.setMessage(message);
        vo.setData(data);
        return vo;
    }

    public static ResultVO error(String message){
        ResultVO vo = new ResultVO();
        vo.setSuccess(false);
        vo.setMessage(message);
        return vo;
    }
}
