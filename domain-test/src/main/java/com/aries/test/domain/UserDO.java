package com.aries.test.domain;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserDO implements Serializable {
    private String id;
    private String name;
    private Integer age;
}
