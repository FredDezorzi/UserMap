package com.usermap.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AddressDTO {

    private Long id;

    private String street;

    private String city;

    private String state;

    private String zipCode;
}
