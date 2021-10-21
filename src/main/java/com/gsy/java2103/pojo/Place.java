package com.gsy.java2103.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 0:49
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("place")  //指定映射的表名
public class Place {

    @TableId
    private Integer placeId;


    private String placeName;
    private String placeInfo;

    private Integer placeNum;
    private String placeStatus;
    private Integer belongUser;

}
