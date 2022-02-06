package com.cnitv.trading.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String email;
    private Integer age;
}
