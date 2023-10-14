package com.geekster.StudentMappingsProject.service;

import com.geekster.StudentMappingsProject.model.Laptop;
import com.geekster.StudentMappingsProject.repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop newlaptop) {
        laptopRepo.save(newlaptop);
        return newlaptop.getLaptopName()+ " laptop added!";
    }

    public List<Laptop> getLaptops() {
        return laptopRepo.findAll();
    }

    public String updateLaptopPriceById(Long id, Integer price) {
        Laptop laptop = laptopRepo.findById(id).orElseThrow();
        laptop.setLaptopPrice(price);
        laptopRepo.save(laptop);
        return "Laptop's price updated!";
    }

    public String deleteLaptopById(Long id) {
        laptopRepo.deleteById(id);
        return "Laptop deleted!";
    }
}
