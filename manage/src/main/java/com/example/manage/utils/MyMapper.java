package com.example.manage.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Auther: dwx
 * @Description:
 * @Date: 15:45 2019/5/8
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
