package com.example.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.coupon.entity.CouponSpuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {

}
