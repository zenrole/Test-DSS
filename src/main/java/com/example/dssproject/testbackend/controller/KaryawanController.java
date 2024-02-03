package com.example.dssproject.testbackend.controller;


import com.example.dssproject.testbackend.entity.KaryawanEntity;
import com.example.dssproject.testbackend.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/karyawan")
public class KaryawanController {
    @Autowired
    private KaryawanService karyawanService;

    @GetMapping
    public List<KaryawanEntity> getAllUser(){
        List<KaryawanEntity> karyawan = karyawanService.getAllUser();
        System.out.println("users : "+karyawan);
        return karyawan;
    }

    @GetMapping("/{karyawanId}")
    public KaryawanEntity getUserById(@PathVariable Integer karyawanId){
        KaryawanEntity user = karyawanService.getUserById(karyawanId);
        System.out.println("userId : "+karyawanId+" : user : "+user);
        return user;
    }

    @PostMapping
    public String saveUser(@RequestBody KaryawanEntity user){
        karyawanService.saveUser(user);
        return "user saved successfuly.";
    }
}
