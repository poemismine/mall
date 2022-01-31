package com.example.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.order.entity.OrderReturnApplyEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {

}
