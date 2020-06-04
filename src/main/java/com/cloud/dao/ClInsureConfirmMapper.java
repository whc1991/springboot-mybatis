package com.cloud.dao;

import com.cloud.domain.ClInsureConfirm;

public interface ClInsureConfirmMapper {
    int deleteByPrimaryKey(Integer insureId);

    int insert(ClInsureConfirm record);

    int insertSelective(ClInsureConfirm record);

    ClInsureConfirm selectByPrimaryKey(Integer insureId);

    int updateByPrimaryKeySelective(ClInsureConfirm record);

    int updateByPrimaryKey(ClInsureConfirm record);
}