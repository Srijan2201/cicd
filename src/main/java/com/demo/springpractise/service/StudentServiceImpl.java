package com.demo.springpractise.service;

import com.demo.springpractise.entity.student;
import com.demo.springpractise.repository.studentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final studentRepo repository;

    public StudentServiceImpl(studentRepo repository){
        this.repository = repository;
    }

    @Override
    public student saveStudent(student student){
        return repository.save(student);
    }

    @Override
    public List<student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public void deleteStudentById(Long id) {
    repository.deleteById(id);
    }

    @Override
    public student updateName(Long id, String name) {
        student s = repository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        s.setName(name);
        return repository.save(s);

    }


}
