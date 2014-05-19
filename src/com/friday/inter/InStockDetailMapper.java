package com.friday.inter;

import java.util.List;

import com.friday.model.InStockDetail;

public interface InStockDetailMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(InStockDetail record);

    int insertSelective(InStockDetail record);

    InStockDetail selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(InStockDetail record);

    int updateByPrimaryKey(InStockDetail record);
    
    List<InStockDetail> selectByInStockId(String inId);
}