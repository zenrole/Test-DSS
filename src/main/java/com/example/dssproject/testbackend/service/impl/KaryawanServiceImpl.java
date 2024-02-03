package com.example.dssproject.testbackend.service.impl;

import com.example.dssproject.testbackend.entity.KaryawanEntity;
import com.example.dssproject.testbackend.repository.KaryawanRepository;
import com.example.dssproject.testbackend.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class KaryawanServiceImpl implements KaryawanService {

    @Autowired
    private KaryawanRepository karyawanRepository;

    @Override
    public List<KaryawanEntity> getAllUser(){
        return karyawanRepository.findAll();
    }

    @Override
    public KaryawanEntity getUserById(Integer karyawanId) {
        Optional<KaryawanEntity> userOpt = karyawanRepository.findById(karyawanId);
        if(userOpt.isPresent())
            return userOpt.get();
        else
            throw new RuntimeException("user not found.");
    }

    @Override
    public void saveUser(KaryawanEntity user) {
        KaryawanEntity karyawanDetail = karyawanRepository.save(user);
        System.out.println("user saved to db with userId : " + karyawanDetail.getId());
    }

}
