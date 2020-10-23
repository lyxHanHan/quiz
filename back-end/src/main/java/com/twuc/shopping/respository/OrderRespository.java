package com.twuc.shopping.respository;

import com.twuc.shopping.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order,String>{
}
