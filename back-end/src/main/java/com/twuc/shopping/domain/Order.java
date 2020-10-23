package com.twuc.shopping.domain;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Order {
    @Valid
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    @Size(min = 1)
    List<Goods> goods;

    @NotNull
    private int orderId;

    @NotNull
    private String orderTime;

}
