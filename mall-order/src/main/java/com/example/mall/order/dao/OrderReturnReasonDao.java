package com.example.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.order.entity.OrderReturnReasonEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {

}
