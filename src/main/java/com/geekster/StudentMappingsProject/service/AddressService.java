package com.geekster.StudentMappingsProject.service;

import com.geekster.StudentMappingsProject.model.Address;
import com.geekster.StudentMappingsProject.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "Address added!";
    }

    public List<Address> getAddresses() {
        return addressRepo.findAll();
    }

    public String updateAddressLandMarkById(Long id, String landmark) {
        Address address = addressRepo.findById(id).orElseThrow();
        address.setAddressLandMark(landmark);
        addressRepo.save(address);
        return "Address landmark updated!";
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Address deleted!";
    }
}
