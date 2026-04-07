package com.loggingTest.userservice.Modal;

import com.loggingTest.userservice.Dto.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;
    private String name;
    private List<Order> orders;
}
