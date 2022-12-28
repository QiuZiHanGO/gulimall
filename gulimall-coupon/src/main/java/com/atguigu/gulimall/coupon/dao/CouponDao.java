package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author qiuzihan
 * @email qzihan0313@gmail.com
 * @date 2022-12-28 11:03:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
