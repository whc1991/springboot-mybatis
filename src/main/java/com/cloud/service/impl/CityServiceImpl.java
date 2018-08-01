package com.cloud.service.impl;

import com.cloud.dao.CityMapper;
import com.cloud.domain.City;
import com.cloud.service.CityService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanghc on 2018/6/22.
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City findByName(String name) {
        return cityMapper.findByName(name);
    }


    @Override
    public List<City> findAll(int pageNum,int pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        return cityMapper.selectAllCitys();
    }

}
