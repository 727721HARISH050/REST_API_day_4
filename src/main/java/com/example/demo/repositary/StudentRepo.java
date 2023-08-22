package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
