package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repo.IStudentRepo;

@Service("studentService")
public class StudentMgmtServiceImpl implements IStudentMgmtService {

	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public List<Student> getAllStudents() {
        // to get the Student details from database
		return studentRepo.findAll();
	}

	@Override
	public String registerStudent(Student stud) {
		 int idVal=studentRepo.save(stud).getStudentId();
		 return "Student is saved with the ID value::"+idVal;
	}

	@Override
	public String deleteStudent(int no) {
		 studentRepo.deleteById(no);
		 return no+" student no is deleted...!";
	}

	@Override
	public Student getStudentByNo(int no) {
		 Student stud = studentRepo.findById(no).get();
		 return stud;
	}

	@Override
	public String editStudent(Student stud) {
		 int idVal = studentRepo.save(stud).getStudentId();
		 return idVal+ " Student Record is Updated...!";
	}

}
