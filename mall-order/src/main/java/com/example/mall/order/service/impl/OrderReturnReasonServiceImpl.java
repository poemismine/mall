package com.example.mall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mall.common.utils.PageUtils;
import com.example.mall.common.utils.Query;
import com.example.mall.order.dao.OrderReturnReasonDao;
import com.example.mall.order.entity.OrderReturnReasonEntity;
import com.example.mall.order.service.OrderReturnReasonService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnReasonEntity> page = this.page(
                new Query<OrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}