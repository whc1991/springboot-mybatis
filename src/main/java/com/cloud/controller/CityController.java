package com.cloud.controller;

import com.cloud.domain.City;
import com.cloud.service.CityService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanghc on 2018/6/22.
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/find")
    public Map<String,Object> findByName(String name){
        City city = cityService.findByName(name);
        HashMap<String,Object> map = new HashMap<>();
        map.put("city",city);
        return map;
    }

    @RequestMapping("/all/{pageNum}/{pageSize}")
    public List<City> selectAll(@PathVariable int pageNum,@PathVariable int pageSize){

        return cityService.findAll(pageNum,pageSize);
    }

    @RequestMapping("/alls/{pageNum}/{pageSize}")
    public PageInfo<City> selectAlls(@PathVariable int pageNum, @PathVariable int pageSize){
         List<City> citys = cityService.findAll(pageNum,pageSize);
         return new PageInfo<City>(citys);

    }
}
