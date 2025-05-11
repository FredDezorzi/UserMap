package com.usermap.dto;

import com.usermap.entity.Address;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;

    private String username;

    private String email;

    private List<Address> addresses;
}
