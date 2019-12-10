package com.cloud.dao;

import com.cloud.domain.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityMapper extends BaseMapper<City>{


    City findByName(@Param("name") String name);

    List<City> selectAllCitys();


}