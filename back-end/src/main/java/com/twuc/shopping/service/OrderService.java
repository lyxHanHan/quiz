package com.twuc.shopping.service;

import com.twuc.shopping.domain.Order;
import com.twuc.shopping.respository.GoodsRepository;
import com.twuc.shopping.respository.OrderRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {
    public static String createOrder;
    OrderRespository orderRespository;
    GoodsRepository goodsRepository;

    public OrderService (OrderRespository orderRespository,GoodsRepository goodsRepository){
        this.orderRespository = orderRespository;
        this.goodsRepository = goodsRepository;
    }

    public Order createOrder(){
        Order order = new Order();
        order.setOrderId(order.getOrderId());
        order.setOrderTime(order.getOrderTime());
        order.setGoods(order.getGoods());
        orderRespository.save(order);
        return order;
    }
}
