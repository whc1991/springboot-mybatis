package com.cloud.dto;


import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    private String name;

    private String address;

    private Date createTs;

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", createTs=" + createTs +
                '}';
    }
}
