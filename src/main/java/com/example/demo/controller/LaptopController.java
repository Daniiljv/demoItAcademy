package com.example.demo.controller;

import com.example.demo.dao.LaptopDao;
import com.example.demo.model.Laptop;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("laptops")

public class LaptopController {

    private final LaptopDao dao;



    @GetMapping("getAllLaptops")
    public List<Laptop> getAllLaptops(){
        return dao.getAllLaptops();
    }

    @PostMapping("/insertLaptop")
    public void insertLaptop(Laptop laptop){
        dao.insertLaptop(laptop);
    }

    @DeleteMapping("deleteLaptop/{laptopId}")
    public void deleteLaptop(@PathVariable int laptopId){
        dao.deleteLaptop(laptopId);
    }


}
