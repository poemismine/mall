package com.example.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.order.entity.OrderItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
