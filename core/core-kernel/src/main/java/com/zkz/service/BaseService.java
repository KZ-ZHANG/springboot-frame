package com.zkz.service;

import com.zkz.dao.BaseMapper;
import com.zkz.entity.BaseEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * 基础业务方法定义，可自定义添加通用实现等等
 * 由于JDK1.8接口可以实现的特性，所以用抽象类代替骨架实现的方式已经过时
 *    骨架实现，目的->减少因为接口增加而增加其他业务实现类的改动
 * 使用模式：
 * 		模板模式
 */
public interface BaseService<T extends BaseEntity> {
	
	BaseMapper<T> getMapper();

	default T get(T t) {
		return getMapper().selectOne(t);
	}

	default T getById(Object id) {
		return getMapper().selectByPrimaryKey(id);
	}

	@Transactional
	default int update(T t) {
		return getMapper().updateByPrimaryKeySelective(t);
	}

	@Transactional
	default int delete(T t) {
		return getMapper().delete(t);
	}

	default int save(T t) {
		return getMapper().insertSelective(t);
	}
	
}
