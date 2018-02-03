package org.saitechshoppingcart.dao;

import java.util.List;

import org.saitechshoppingcart.model.CartInfo;
import org.saitechshoppingcart.model.OrderDetailInfo;
import org.saitechshoppingcart.model.OrderInfo;
import org.saitechshoppingcart.model.PaginationResult;

public interface OrderDAO {

	public void saveOrder(CartInfo cartInfo);

	public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);

	public OrderInfo getOrderInfo(String orderId);

	public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}