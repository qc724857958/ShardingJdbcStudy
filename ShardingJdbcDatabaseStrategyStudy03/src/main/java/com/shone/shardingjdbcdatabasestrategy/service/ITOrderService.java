package com.shone.shardingjdbcdatabasestrategy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shone.shardingjdbcdatabasestrategy.entity.TOrder;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Shone
 * @since 2019-11-07
 */
public interface ITOrderService extends IService<TOrder> {

	public void createOrder(TOrder order);
}
