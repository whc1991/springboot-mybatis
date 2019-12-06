package com.cloud.service.impl;

import com.cloud.common.RedisUtilService;
import com.cloud.dao.CityMapper;
import com.cloud.domain.City;
import com.cloud.service.CityService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by wanghc on 2018/6/22.
 */
//@Service
@Slf4j
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private RedisUtilService redisUtilService;

    @Override
    public City findByName(String name) {
        return cityMapper.findByName(name);
    }


    @Override
    public List<City> findAll(int pageNum,int pageSize) {
        String key = "CITY:FINDALL";

        List<City> cityList = (List<City>) redisUtilService.get(key);

        if (!CollectionUtils.isEmpty(cityList)){
            log.info("redis中已存在，直接返回数据");
            return cityList;
        }
        log.info("redis中不存在，从数据库中查询数据");
        PageHelper.startPage(pageNum,pageSize);

        cityList = cityMapper.selectAllCitys();

        log.info("redis中不存在，从数据库中查询数据后准备插入到redis中");
        redisUtilService.set(key, cityList);
        log.info("redis中不存在，从数据库中查询数据后插入到redis成功");

        return cityList;
    }

}
