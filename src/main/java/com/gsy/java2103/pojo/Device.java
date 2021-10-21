package com.gsy.java2103.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 0:45
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("device")  //指定映射的表名
public class Device implements Serializable {

    @TableId
    private Integer deviceId;

    private String deviceName;
    private String deviceInfo;
    private Integer belongPlace;
    private String deviceStatus;
    private Integer devicePrice;
}
