package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tianbowen
 * @email 791725679@qq.com
 * @date 2019-08-01 21:41:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
