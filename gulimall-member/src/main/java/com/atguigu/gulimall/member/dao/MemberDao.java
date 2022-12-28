package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author qiuzihan
 * @email qzihan0313@gmail.com
 * @date 2022-12-28 11:13:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
