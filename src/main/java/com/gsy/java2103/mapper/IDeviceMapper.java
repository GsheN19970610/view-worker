package com.gsy.java2103.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gsy.java2103.pojo.Device;
import com.gsy.java2103.pojo.Place;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 13:37
 * @description:
 */
public interface IDeviceMapper extends BaseMapper<Device> {

    List<Device> findAll(Integer id);

//    @Select("SELECT device_id,device_name,device_info,device_status,device_price,place_name FROM device,place WHERE belong_place=place_id AND belong_user = #{id}")
    List<Map<String, Object>> findpage(Page<Map<String,Object>> page, Integer id);

//    @Select("SELECT device_id,device_name,device_info,device_status,device_price,place_name FROM device,place WHERE belong_place=place_id AND belong_user = #{id} AND device_name like concat('%',#{name},'%')")
    List<Map<String, Object>> searchpage(Page<Map<String,Object>> page,Integer id,String name);

}
