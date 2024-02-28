package com.example.Student.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.management.system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}