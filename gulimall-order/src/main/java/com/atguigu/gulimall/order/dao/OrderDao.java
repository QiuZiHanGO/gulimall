package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author qiuzihan
 * @email qzihan0313@gmail.com
 * @date 2022-12-28 11:22:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
