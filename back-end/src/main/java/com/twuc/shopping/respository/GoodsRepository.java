package com.twuc.shopping.respository;

import com.twuc.shopping.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods,String> {
}
