package com.vecverse.mao.service;

import com.github.pagehelper.PageInfo;
import com.vecverse.mao.vo.ProductDetailVo;
import com.vecverse.mao.vo.ResponseVo;


public interface IProductService {

	ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

	ResponseVo<ProductDetailVo> detail(Integer productId);
}
