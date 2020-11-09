package com.vecverse.mao.service;

import com.vecverse.mao.vo.CategoryVo;
import com.vecverse.mao.vo.ResponseVo;

import java.util.List;
import java.util.Set;


public interface ICategoryService {

	ResponseVo<List<CategoryVo>> selectAll();

	void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
