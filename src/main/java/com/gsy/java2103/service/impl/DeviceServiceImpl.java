package com.gsy.java2103.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gsy.java2103.mapper.IDeviceMapper;
import com.gsy.java2103.pojo.Device;
import com.gsy.java2103.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: GsheN丶
 * @date: 2021/8/5 13:40
 * @description:
 */
@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private IDeviceMapper deviceMapper;

    @Override
    public List<Device> selectAll() {
        List<Device> devices = deviceMapper.selectList(null);
        return devices;
    }

    @Override
    public Device findById(Integer id) {
        Device device = deviceMapper.selectById(id);
        return device;
    }



    @Override
    public void updateById(Device device){
        deviceMapper.updateById(device);
    }

    @Override
    public Integer insertByCondition(Device device){
        int i = deviceMapper.insert(device);
        return i;
    }

    @Override
    public Integer deleteById(Integer id){
        int i = deviceMapper.deleteById(id);
        return i;
    }

    @Override
    public Page<Map<String, Object>> findPage(int current, int number, Integer id) {
        // 新建分页
        Page<Map<String,Object>> page = new Page<Map<String,Object>>(current, number);

        return page.setRecords(deviceMapper.findpage(page,id));
    }

    @Override
    public Page<Map<String, Object>> searchpage(int current, int number, Integer id, String name) {
        Page<Map<String,Object>> page = new Page<Map<String,Object>>(current, number);
        return page.setRecords(deviceMapper.searchpage(page,id,name));
    }

}
