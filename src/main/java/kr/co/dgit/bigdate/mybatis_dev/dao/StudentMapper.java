package kr.co.dgit.bigdate.mybatis_dev.dao;

import kr.co.dgit.bigdate.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student findStudentById(int id);
	
}
