package com.gsy.java2103.project_spring;

import com.gsy.java2103.mapper.IDeviceMapper;
import com.gsy.java2103.mapper.IPlaceMapper;
import com.gsy.java2103.mapper.IUserMapper;
import com.gsy.java2103.pojo.Place;
import com.gsy.java2103.pojo.User;
import com.gsy.java2103.service.DeviceService;
import com.gsy.java2103.service.PlaceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProjectSpringApplicationTests {

    @Autowired
    private IUserMapper userMapper;
    @Autowired
    private IDeviceMapper deviceMapper;
    @Autowired
    private IPlaceMapper placeMapper;
    @Autowired
    private PlaceService placeService;
    @Autowired
    private DeviceService deviceService;


    public void print(List<User> users){
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }

    @Test
    public void test06() throws Exception {

    }

}
