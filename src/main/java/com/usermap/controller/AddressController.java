package com.usermap.controller;

import com.usermap.model.dto.AddressDTO;
import com.usermap.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO){
        return ResponseEntity.ok(this.addressService.createAddress(addressDTO));
    }

    @GetMapping
    public ResponseEntity<List<AddressDTO>> getAllAddresses(){
        return ResponseEntity.ok(this.addressService.getAllAddresses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO> getAddressById(@PathVariable Long id){
        return ResponseEntity.ok(this.addressService.getAddressById(id));
    }
}
