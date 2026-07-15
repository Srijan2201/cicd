package com.demo.springpractise.repository;

import com.demo.springpractise.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student,Long> {
}
