package com.loggingTest.userservice.Controller;


import com.loggingTest.userservice.Dto.OrderMy;
import com.loggingTest.userservice.FeignClient.OrderClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final OrderClient orderClient;

    @GetMapping("/{orderId}")
    public OrderMy getUser(@PathVariable String orderId) {
        log.info("this is to get all users");
        OrderMy orders = orderClient.getOrderById(orderId);

        return orders;
    }
}
