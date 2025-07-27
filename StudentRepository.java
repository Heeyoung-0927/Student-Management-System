package net.heeyoung.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.heeyoung.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
