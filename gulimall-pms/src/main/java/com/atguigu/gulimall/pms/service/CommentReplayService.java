package com.atguigu.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.CommentReplayEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author tianbowen
 * @email 791725679@qq.com
 * @date 2019-08-01 19:59:55
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

