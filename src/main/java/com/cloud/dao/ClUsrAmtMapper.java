package com.cloud.dao;

import com.cloud.domain.ClUsrAmt;

public interface ClUsrAmtMapper {
    int deleteByPrimaryKey(Integer crdtextSeq);

    int insert(ClUsrAmt record);

    int insertSelective(ClUsrAmt record);

    ClUsrAmt selectByPrimaryKey(Integer crdtextSeq);

    int updateByPrimaryKeySelective(ClUsrAmt record);

    int updateByPrimaryKey(ClUsrAmt record);
}