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
	Student selectStudentWithAddressResult(int id); // 1회만 할 경우 추천
	
	Student selectStudentWithAddress(int id); // 일대일 매핑 추천 방법
}
