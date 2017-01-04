package kr.co.dgit.bigdate.mybatis_dev.service;

import java.util.List;
import java.util.Map;

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

	private StudentService() {
	}

	public Student findStudentById(int studId) {
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentById(int) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentById(studId);
		} finally {
			sqlSession.close();
		}

	}

	public int insertStudent(Student std) {
		if (logger.isDebugEnabled()) {
			logger.debug("insertStudent(Student) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.insertStudent(std);
			sqlSession.commit();
			return res;
		} finally {
			sqlSession.close();
		}

	}

	public int insertStudentAutoInc(Student student) {
		if (logger.isDebugEnabled()) {
			logger.debug("insertStudentAutoInc(Student) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.insertStudent(student);
			sqlSession.commit();
			return res;
		} finally {
			sqlSession.close();
		}

	}

	public int updateStudent(Student student) {
		if (logger.isDebugEnabled()) {
			logger.debug("updateStudent(Student) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.updateStudent(student);
			sqlSession.commit();
			return res;
		} finally {
			sqlSession.close();
		}

	}

	public int deleteStudent(int id) {
		if (logger.isDebugEnabled()) {
			logger.debug("updateStudent(Student) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.deleteStudent(id);
			sqlSession.commit();
			return res;
		} finally {
			sqlSession.close();
		}

	}

	public List<Student> findStudentByAll() {
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentByAll() - start");
		}
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentByAll();
		} finally {
			sqlSession.close();
		}

	}

	public Map<String, Object> findStudentByIdForMap(int id) {
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentByIdForMap(int) - start");
		}
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentByIdForMap(id);
		} finally {
			sqlSession.close();
		}

	}

	//////////

	public Student selectStudentWithAddressResult(int studId) {
		if (logger.isDebugEnabled()) {
			logger.debug("selectStudentWithAddressResult(int) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.selectStudentWithAddressResult(studId);
		} finally {
			sqlSession.close();
		}

	}

	public Student selectStudentWithAddress(int studId) {
		if (logger.isDebugEnabled()) {
			logger.debug("selectStudentWithAddress(int) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.selectStudentWithAddress(studId);
		} finally {
			sqlSession.close();
		}

	}
	
	public List<Map<String, Object>> findStudentByAllForMap(){
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentByAllForMap() - start");
		}
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentByAllForMap();
		} finally {
			sqlSession.close();
		}
		
		
	}

}
