package com.zhss.eshop.order.price;

import com.zhss.eshop.order.domain.OrderInfoDTO;
import com.zhss.eshop.promotion.domain.CouponDTO;
import org.springframework.stereotype.Component;

/**
 * 默认的优惠券计算组件
 * @author zhonghuashishan
 *
 */
@Component
public class DefaultCouponCalculator implements CouponCalculator {

	@Override
	public Double calculate(OrderInfoDTO order, CouponDTO coupon) {
		return 0.0;
	}

}
