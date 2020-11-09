package com.vecverse.mao.service;

import com.github.pagehelper.PageInfo;
import com.vecverse.mao.form.ShippingForm;
import com.vecverse.mao.vo.ResponseVo;

import java.util.Map;


public interface IShippingService {

	ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form);

	ResponseVo delete(Integer uid, Integer shippingId);

	ResponseVo update(Integer uid, Integer shippingId, ShippingForm form);

	ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);
}
