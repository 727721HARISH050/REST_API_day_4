package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repositary.StudentRepo;

@Service
public class StudentService {
	@Autowired
 StudentRepo sr;
	
 public List<StudentEntity> save(List<StudentEntity> se)
 {
	 return (List<StudentEntity>)sr.saveAll(se);
 }
 public List<StudentEntity> show()
 {
	 return sr.findAll();
 }
 public StudentEntity update(StudentEntity se)
 {
	 return sr.saveAndFlush(se);
 }
 public void delete (StudentEntity se)
 {
	 sr.delete(se);
 }
 public void deleteid(int id)
 {
	 sr.deleteById(id);
 }
 public Optional<StudentEntity>getbyid(int id)
 {
	 return sr.findById(id);
 }
 
}
