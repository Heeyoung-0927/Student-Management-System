package net.heeyoung.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.heeyoung.sms.entity.Student;
import net.heeyoung.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Heeyoung", "Shin", "heeyoung@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Heeseong", "Shin", "heeseong@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Mihyo", "Jang", "mihyo@gmail.com");
//		studentRepository.save(student3);
	}

}
