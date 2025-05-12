package com.usermap.model.dto;

import com.usermap.model.entity.Address;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;

    private String username;

    private String email;

    private List<Address> addresses;
}
