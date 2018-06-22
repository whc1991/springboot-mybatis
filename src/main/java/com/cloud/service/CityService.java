package com.cloud.service;

import com.cloud.domain.City;

import java.util.List;

/**
 * Created by wanghc on 2018/6/22.
 */
public interface CityService {

    public City findByName(String name);

    public List<City> findAll(int pageNum,int pageSize);
}
