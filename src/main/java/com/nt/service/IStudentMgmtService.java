package com.nt.service;

import java.util.List;

import com.nt.model.Student;

public interface IStudentMgmtService {
   public List<Student> getAllStudents();
   public String registerStudent(Student stud);
   public String deleteStudent(int no);
   public Student getStudentByNo(int no);
   public String editStudent(Student stud);
}
