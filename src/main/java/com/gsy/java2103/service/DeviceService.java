package com.gsy.java2103.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gsy.java2103.pojo.Device;


import java.util.List;
import java.util.Map;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 13:39
 * @description:
 */
public interface DeviceService {

    List<Device> selectAll();

    Device findById(Integer id);

    void updateById(Device device);

    Integer insertByCondition(Device device);

    Integer deleteById(Integer id);

    Page<Map<String,Object>> findPage(int current, int number, Integer id);

    Page<Map<String,Object>> searchpage(int current, int number,Integer id,String name);


}
