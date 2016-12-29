package kr.co.dgit.bigdate.mybatis_dev.mappers;

import java.util.List;

import kr.co.dgit.bigdate.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student findStudentById(int id);
	int insertStudent(Student std);
	int insertStudentAutoInc(Student student);
	int updateStudent(Student student);	
	int deleteStudent(int id);
	List<Student> findStudentByAll();
}
