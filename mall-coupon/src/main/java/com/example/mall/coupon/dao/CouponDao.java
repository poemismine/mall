package com.example.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
