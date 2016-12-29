package kr.co.dgit.bigdate.mybatis_dev.mappers;

import java.util.List;
import java.util.Map;

import kr.co.dgit.bigdate.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student findStudentById(int id);
	List<Student> findStudentByAll();
	Map<String, Object> findStudentByIdForMap(int id);
	List<Map<String, Object>> findStudentByAllForMap();
	
	int insertStudent(Student std);
	int insertStudentAutoInc(Student student);
	int updateStudent(Student student);	
	int deleteStudent(int id);	
	/////// Join
	Student selectStudentWithAddressResult(int id);
}
