package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
