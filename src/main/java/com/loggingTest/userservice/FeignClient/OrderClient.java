package com.loggingTest.userservice.FeignClient;



import com.loggingTest.userservice.Dto.OrderMy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:9090", name = "orderService")
public interface OrderClient {

    @GetMapping("/getOrders")
    public List<OrderMy> getAllOrders();

    @GetMapping("/getOrderById/{id}")
    public OrderMy getOrderById(@PathVariable String id);
}
