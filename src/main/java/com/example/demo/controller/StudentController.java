package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/v1/user")
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping("getinfo")
	public List<StudentEntity> addinfo (@RequestBody List<StudentEntity> se)
	{
		return ss.save(se);
	}
	@GetMapping("showinfo")
	public List<StudentEntity> showStudent ()
	{
		return ss.show();
	}
	@PutMapping("updateinfo")
	public StudentEntity updateStudent (@RequestBody StudentEntity se)
	{
		return ss.update(se);
	}
	@DeleteMapping("deleteinfo")
	public String deleteStudent (@RequestBody StudentEntity se)
	{
		 ss.delete(se);
		 return "Deleted";
	}
	@DeleteMapping("deleteid/{id}")
	public void deleteby(@PathVariable int id)
	{
		ss.deleteid(id);
	}
	@GetMapping("get/{id}")
	public Optional<StudentEntity> showid (@PathVariable int id)
	{
		return ss.getbyid(id);
	}
}
