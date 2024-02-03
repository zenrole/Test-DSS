package com.example.dssproject.testbackend.service;

import com.example.dssproject.testbackend.entity.KaryawanEntity;

import java.util.List;

public interface KaryawanService {
    List<KaryawanEntity> getAllUser();

    KaryawanEntity getUserById(Integer userId);

    void saveUser(KaryawanEntity user);

}
