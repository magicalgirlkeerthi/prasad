package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Student;
import com.nt.service.IStudentMgmtService;
@Controller
public class StudentOpertionsController {
	@Autowired
	private IStudentMgmtService studentService;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String showStudentReport(Map<String, Object> map) {
		// use service
		List<Student> list = studentService.getAllStudents();
		// put the results in model attributes
		map.put("studentsData", list);
		// return LVN
		return "students_report";
	}// method end

	@GetMapping("/add")
	public String showAddStudent(@ModelAttribute("stud") Student stud) {
		// return LVn
		return "student_register";
	}

	@PostMapping("/add")
	public String addStudent(Map<String, Object> map, @ModelAttribute("stud") Student stud) {
		// use service
		String result = studentService.registerStudent(stud);
		List<Student> list = studentService.getAllStudents();
		// keep results in model attributes
		map.put("resultMsg", result);
		map.put("studentsData", list);
		// return LVN
		return "students_report";
	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("no") int no, Map<String, Object> map) {
		// use service
		String msg = studentService.deleteStudent(no);
		List<Student> list = studentService.getAllStudents();
		// keep results in model attributes
		map.put("resultMsg", msg);
		map.put("studentsData", list);
		// return LVN
		return "students_report";
	}

	@GetMapping("/edit")
	public String ShowEditStudentForm(@RequestParam("no") int no, @ModelAttribute("stud") Student stud) {
		// get Student details dynamically based on the given student no
		Student stud1 = studentService.getStudentByNo(no);
		BeanUtils.copyProperties(stud1, stud);
		// return LVN
		return "student_edit";
	}

	@PostMapping("/edit")
	public String editStudent(Map<String, Object> map, @ModelAttribute("stud") Student stud) {
		// use service
		String result = studentService.editStudent(stud);
		List<Student> list = studentService.getAllStudents();
		// keep results in model attributes
		map.put("resultMsg", result);
		map.put("studentsData", list);
		// return LVN
		return "students_report";
	}
}// class
