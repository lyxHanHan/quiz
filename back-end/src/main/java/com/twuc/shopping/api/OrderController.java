package com.twuc.shopping.api;

import com.sun.javaws.exceptions.ErrorCodeResponseException;
import com.twuc.shopping.domain.Goods;
import com.twuc.shopping.domain.Order;
import com.twuc.shopping.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static java.lang.Object.*;
import static java.util.Objects.isNull;

@Slf4j
@RestController
@RequestMapping(value = "/order-api", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    OrderService orderService;
    private String InvalidRequest;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody @Valid Goods goods) throws ParseException{
       if(isNull(goods)) {
           throw new ParseException(InvalidRequest,400);
       }
        return OrderService.createOrder;
    }
}

//    @GetMapping(path = "/order/status/{orderId}")
//    @ResponseStatus(HttpStatus.OK)
//    public AcgCreateOrderResponse getStatus(@PathVariable String orderId) {
//        if (Objects.isNull(orderId)) {
//            throw new BadRequestException(ErrorCode.INVALID_REQUEST);
//        }
//        return acgOrderService.getStatus(orderId);
//    }
