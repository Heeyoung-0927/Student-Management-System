package net.heeyoung.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.heeyoung.sms.entity.Student;
import net.heeyoung.sms.repository.StudentRepository;
import net.heeyoung.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
}
