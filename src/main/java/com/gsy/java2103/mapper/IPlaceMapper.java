package com.gsy.java2103.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gsy.java2103.pojo.Place;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 0:55
 * @description:
 */
public interface IPlaceMapper extends BaseMapper<Place> {

    List<Place> findAll(Integer id);

//    @Select("SELECT place_id,place_name,place_info,place_num,place_status,user_name FROM USER,place WHERE user_id=place.belong_user AND user_id = #{id}")
    List<Map<String, Object>> findpage(Page<Map<String,Object>> page, Integer id);


//    @Select("SELECT place_id,place_name,place_info,place_num,place_status,user_name FROM USER,place WHERE user_id=place.belong_user AND user_id = #{id} AND place_name like concat('%',#{name},'%')")
    List<Map<String, Object>> searchpage(Page<Map<String,Object>> page, Integer id,String name);

}
