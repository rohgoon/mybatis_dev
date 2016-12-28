package kr.co.dgit.bigdate.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.co.dgit.bigdate.mybatis_dev.dto.Student;
import kr.co.dgit.bigdate.mybatis_dev.mappers.StudentMapper;
import kr.co.dgit.bigdate.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	private static final Logger logger = Logger.getLogger(StudentService.class);
	
	private final static StudentService instance = new StudentService();

	public static StudentService getInstance() {
		return instance;
	}
	
	private StudentService(){}
	
	public Student findStudentById(int studId){
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentById(int) - start"); 
		}
		
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		return studentMapper.findStudentById(studId);
		}finally {
			sqlSession.close();
		}
		
		
	}
	
}
