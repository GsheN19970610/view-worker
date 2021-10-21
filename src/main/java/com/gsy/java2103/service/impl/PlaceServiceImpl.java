package com.gsy.java2103.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gsy.java2103.mapper.IPlaceMapper;
import com.gsy.java2103.pojo.Place;
import com.gsy.java2103.service.PlaceService;
import com.gsy.java2103.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 1:17
 * @description:
 */

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private IPlaceMapper placeMapper;

    @Override
    public List<Place> selectAll(Integer id) {
        List<Place> places = placeMapper.findAll(id);
        return places;
    }

    @Override
    public Place findById(Integer id) {
        Place place = placeMapper.selectById(id);
        return place;
    }

    @Override
    public void updateById(Place place){
        placeMapper.updateById(place);
    }

    @Override
    public Integer insertByCondition(Place place){
        int i = placeMapper.insert(place);
        return i;
    }

    @Override
    public Integer deleteById(Integer id){
        int i = placeMapper.deleteById(id);
        return i;
    }



    @Override
    public Page<Map<String, Object>> findPage(int current, int number,Integer id) {
        // 新建分页
        Page<Map<String,Object>> page = new Page<Map<String,Object>>(current, number);

        return page.setRecords(placeMapper.findpage(page,id));
    }

    @Override
    public Page<Map<String, Object>> search(int current, int number, Integer id, String name) {
        // 新建分页
        Page<Map<String,Object>> page = new Page<Map<String,Object>>(current, number);
        return page.setRecords(placeMapper.searchpage(page,id,name));
    }
}
