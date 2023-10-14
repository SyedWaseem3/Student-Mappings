package com.geekster.StudentMappingsProject.controller;

import com.geekster.StudentMappingsProject.model.Laptop;
import com.geekster.StudentMappingsProject.model.Student;
import com.geekster.StudentMappingsProject.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop newlaptop){
        return laptopService.addLaptop(newlaptop);
    }

    @GetMapping("laptops")
    public List<Laptop> getLaptops(){
        return laptopService.getLaptops();
    }

    @PutMapping("updateLaptopPriceById/{id}/price/{price}")
    public String updateLaptopPriceById(@PathVariable Long id, @PathVariable Integer price){
        return laptopService.updateLaptopPriceById(id,price);
    }

    @DeleteMapping("deleteLaptopById/{id}")
    public String deleteLaptopById(@PathVariable Long id){
        return laptopService.deleteLaptopById(id);
    }
}
