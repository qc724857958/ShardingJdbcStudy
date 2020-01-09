package com.shone.shardingjdbcdatabasestrategy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shone.shardingjdbcdatabasestrategy.entity.TOrder;
import com.shone.shardingjdbcdatabasestrategy.entity.TOrderItems;
import com.shone.shardingjdbcdatabasestrategy.mapper.TOrderItemsMapper;
import com.shone.shardingjdbcdatabasestrategy.mapper.TOrderMapper;
import com.shone.shardingjdbcdatabasestrategy.service.ITOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Shone
 * @since 2019-11-07
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements ITOrderService {

	@Autowired
	private TOrderMapper orderMapper;
	
	@Autowired
	private TOrderItemsMapper orderItemsMapper;
	
	@Transactional
	public void createOrder(TOrder order) {
		orderMapper.insert(order);
		if(order.getOrderItems() != null) {
			for(TOrderItems item : order.getOrderItems()) {
				item.setOrderId(order.getOrderId());
				item.setUserId(order.getUserId());
				orderItemsMapper.insert(item);
			}
		}
	}
}
