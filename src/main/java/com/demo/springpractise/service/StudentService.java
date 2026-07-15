package com.demo.springpractise.service;

import com.demo.springpractise.entity.student;

import java.util.List;

public interface StudentService {
    student saveStudent(student s);
    List<student> getAllStudents();
    void deleteStudentById(Long id);
    student updateName(Long id, String name);
    }


