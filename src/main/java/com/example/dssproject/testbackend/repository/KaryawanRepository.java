package com.example.dssproject.testbackend.repository;

import com.example.dssproject.testbackend.entity.KaryawanEntity;
import com.example.dssproject.testbackend.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface KaryawanRepository extends JpaRepository<KaryawanEntity, Integer> {

}
