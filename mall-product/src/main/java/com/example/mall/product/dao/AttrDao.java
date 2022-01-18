package com.example.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {

}
