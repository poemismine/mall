package com.example.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.member.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {

}
