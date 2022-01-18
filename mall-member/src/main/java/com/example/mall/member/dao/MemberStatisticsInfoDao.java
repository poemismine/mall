package com.example.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.member.entity.MemberStatisticsInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员统计信息
 */
@Mapper
public interface MemberStatisticsInfoDao extends BaseMapper<MemberStatisticsInfoEntity> {

}
