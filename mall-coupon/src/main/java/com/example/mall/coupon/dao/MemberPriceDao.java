package com.example.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.coupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
