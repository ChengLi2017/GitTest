package com.vecverse.mao.service;

import com.vecverse.mao.form.CartAddForm;
import com.vecverse.mao.form.CartUpdateForm;
import com.vecverse.mao.pojo.Cart;
import com.vecverse.mao.vo.CartVo;
import com.vecverse.mao.vo.ResponseVo;

import java.util.List;


public interface ICartService {

	ResponseVo<CartVo> add(Integer uid, CartAddForm form);

	ResponseVo<CartVo> list(Integer uid);

	ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form);

	ResponseVo<CartVo> delete(Integer uid, Integer productId);

	ResponseVo<CartVo> selectAll(Integer uid);

	ResponseVo<CartVo> unSelectAll(Integer uid);

	ResponseVo<Integer> sum(Integer uid);

	List<Cart> listForCart(Integer uid);
}
