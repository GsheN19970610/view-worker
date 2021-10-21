package com.gsy.java2103.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gsy.java2103.constant.MessageConstant;
import com.gsy.java2103.pojo.Place;
import com.gsy.java2103.service.PlaceService;
import com.gsy.java2103.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author ghy
 * @version 1.0
 * @date 2021-08-03
 **/
@RestController
@RequestMapping("/place")
@Slf4j
@CrossOrigin
public class PlaceController {

    @Autowired
    private PlaceService placeService;

//    @RequestMapping("/list")
//    public ResultVO findAll(){
//        try{
//            List<Place> places = placeService.selectAll();
//            return ResultVO.ok(MessageConstant.SELECT_SUCCESS,places);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResultVO.error(MessageConstant.SELECT_FAIL, e.getMessage());
//        }
//    }

    @RequestMapping("/list/{pageNum}/{pageSize}/{id}")
    public ResultVO findPage(@PathVariable("pageNum") Integer pageNum,
                             @PathVariable("pageSize") Integer pageSize,
                             @PathVariable("id") Integer id){
        try {
            System.out.println("pageNum = " + pageNum);
            System.out.println("pageSize = " + pageSize);
            System.out.println("id = " + id);
            Page<Map<String, Object>> ipage = placeService.findPage(pageNum, pageSize,id);
            System.out.println("ipage = " + ipage.toString());
            return ResultVO.ok(MessageConstant.SELECT_SUCCESS,ipage);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.error(MessageConstant.SELECT_FAIL, e.getMessage());
        }
    }

    @RequestMapping("/list/{pageNum}/{pageSize}/{id}/{name}")
    public ResultVO searchpage(@PathVariable("pageNum") Integer pageNum,
                               @PathVariable("pageSize") Integer pageSize,
                               @PathVariable("id") Integer id,
                               @PathVariable("name") String name){
        try {
            System.out.println("pageNum = " + pageNum);
            System.out.println("pageSize = " + pageSize);
            System.out.println("id = " + id);
            Page<Map<String, Object>> ipage = placeService.search(pageNum, pageSize,id,name);
            return ResultVO.ok("查询成功",ipage);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.ok("查询成功",e.getMessage());
        }
    }



    @RequestMapping("/{id}")
    public ResultVO findById(@PathVariable("id") Integer id){
        try{
            log.info("id:{}", id);
            Place place = placeService.findById(id);
            System.out.println("place = " + place);
            return ResultVO.ok(MessageConstant.SELECT_SUCCESS, place);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.error(MessageConstant.SELECT_FAIL, e.getMessage());
        }
    }

    @RequestMapping("/update")
    public ResultVO updateById(@RequestBody Place place){
        try{
            log.info("place:{}", place);
            placeService.updateById(place);

            return ResultVO.ok(MessageConstant.UPDATE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.error(MessageConstant.UPDATE_FAIL,e.getMessage());
        }
    }

    @RequestMapping("/insert")
    public ResultVO insertByCondition(@RequestBody Place place){
        try {
            log.info("place:{}", place);
            placeService.insertByCondition(place);
            return ResultVO.ok(MessageConstant.INSERT_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.error(MessageConstant.INSERT_FAIL,e.getMessage());
        }
    }

    @RequestMapping("/delete/{id}")
    public ResultVO moveById(@PathVariable("id") Integer id){
        try {
            System.out.println("调用delete方法" + id);
            log.info("id:{}", id);
            placeService.deleteById(id);
            return ResultVO.ok(MessageConstant.DELETE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.error(MessageConstant.DELETE_FAIL,e.getMessage());
        }
    }





}
