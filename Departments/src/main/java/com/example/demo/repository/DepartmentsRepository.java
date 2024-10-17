package com.example.demo.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.DepartmentsEntity;

@Repository
@EntityScan(basePackages = "com.example.demo.entity")
public interface DepartmentsRepository extends JpaRepository<DepartmentsEntity, Long> {

}
