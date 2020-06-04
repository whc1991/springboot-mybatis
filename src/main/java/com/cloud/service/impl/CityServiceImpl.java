package com.cloud.service.impl;

import com.cloud.dao.CityMapper;
import com.cloud.domain.City;
import com.cloud.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanghc on 2018/6/22.
 */
@Service
@Slf4j
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City findByName(String name) {
        return cityMapper.findByName(name);
    }


    @Override
    public List<City> findAll(int pageNum,int pageSize) {

        List<City> cityList = cityMapper.selectAllCitys();

        return cityList;
    }

}
