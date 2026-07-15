package com.demo.springpractise.controller;

import com.demo.springpractise.entity.student;
import com.demo.springpractise.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping
    public student addStudent(@RequestBody student student){
        return service.saveStudent(student);
    }

    @GetMapping
    public List<student> getStudent(){
        return service.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
        service.deleteStudentById(id);
        return "Student deleted with id "+id;
    }

    @PatchMapping("/{id}/name")
    public student updateStudentName(@PathVariable Long id,
                                     @RequestBody student s){
        return service.updateName(id, s.getName());
    }
}
