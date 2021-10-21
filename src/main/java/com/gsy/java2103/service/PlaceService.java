package com.gsy.java2103.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gsy.java2103.pojo.Place;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 1:17
 * @description:
 */
public interface PlaceService {

    List<Place> selectAll(Integer id);

    Place findById(Integer id);

    void updateById(Place place);

    Integer insertByCondition(Place place);

    Integer deleteById(Integer id);

    Page<Map<String,Object>> findPage(int current, int number,Integer id);

    Page<Map<String,Object>> search(int current, int number,Integer id,String name);


}
