package com.junayed.reactive_ecommerce.entity;

import lombok.*;

@Data
@AllArgsConstructor
public class Admin {
    private long id;
    private String name;
    private String password;
}
