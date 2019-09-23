package com.coolsen.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 吴雨森
 * @data 2019/9/23 21:44
 */
@Data
public class Users implements Serializable {

    private Integer userId;

    private String username;

    private String userAge;
}
