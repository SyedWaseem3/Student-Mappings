package com.geekster.StudentMappingsProject.controller;

import com.geekster.StudentMappingsProject.model.Address;
import com.geekster.StudentMappingsProject.model.Student;
import com.geekster.StudentMappingsProject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }

    @GetMapping("addresses")
    public List<Address> getAddresses(){
        return addressService.getAddresses();
    }

    @PutMapping("updateAddressLandMarkById/{id}/landmark/{landmark}")
    public String updateAddressLandMarkById(@PathVariable Long id, @PathVariable String landmark){
        return addressService.updateAddressLandMarkById(id,landmark);
    }

    @DeleteMapping("deleteAddressById/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}
