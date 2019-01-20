package com.zkz.dao;

import com.zkz.entity.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * 基础mapper，所有mapper均去继承
 * @param <T>
 */
public interface BaseMapper<T extends BaseEntity> extends Mapper<T>{

    default T get(T t) {
        return selectOne(t);
    }

    default int update(T t) {
        return updateByPrimaryKeySelective(t);
    }

    default int delete(T t) {
        return delete(t);
    }

    default int save(T t) {
        return insertSelective(t);
    }
}
