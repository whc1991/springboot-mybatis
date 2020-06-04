package com.cloud.dao;

import com.cloud.domain.ClExamineLast;

public interface ClExamineLastMapper {
    int deleteByPrimaryKey(Integer examineSeq);

    int insert(ClExamineLast record);

    int insertSelective(ClExamineLast record);

    ClExamineLast selectByPrimaryKey(Integer examineSeq);

    int updateByPrimaryKeySelective(ClExamineLast record);

    int updateByPrimaryKey(ClExamineLast record);
}