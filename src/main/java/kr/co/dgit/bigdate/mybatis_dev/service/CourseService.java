package kr.co.dgit.bigdate.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.co.dgit.bigdate.mybatis_dev.dto.Course;
import kr.co.dgit.bigdate.mybatis_dev.mappers.CourseMapper;
import kr.co.dgit.bigdate.mybatis_dev.util.MyBatisSqlSessionFactory;

public class CourseService {
	private static final Logger logger = Logger.getLogger(CourseService.class);

	private final static CourseService instance = new CourseService();

	public static CourseService getInstance() {
		return instance;
	}

	private CourseService() {
	}

	public List<Course> searchCourses(Map<String, Object> map) {
		if (logger.isDebugEnabled()) {
			logger.debug("searchCourses(Map<String, Object>) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
			return courseMapper.searchCourses(map);
		} finally {
			sqlSession.close();
		}

	}
	public List<Course> searchCaseCourses(Map<String, Object> map) {
		if (logger.isDebugEnabled()) {
			logger.debug("searchCaseCourses(Map<String, Object>) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
			return courseMapper.searchCaseCourses(map);
		} finally {
			sqlSession.close();
		}

	}
	public List<Course> searchWhereCourses(Map<String, Object> map) {
		if (logger.isDebugEnabled()) {
			logger.debug("searchWhereCourses(Map<String, Object>) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
			return courseMapper.searchWhereCourses(map);
		} finally {
			sqlSession.close();
		}

	}
	
	public List<Course> searchTrimCourses(Map<String, Object> map) {
		if (logger.isDebugEnabled()) {
			logger.debug("searchWhereCourses(Map<String, Object>) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
			return courseMapper.searchTrimCourses(map);
		} finally {
			sqlSession.close();
		}

	}
	
	public List<Course> searchForeachCoursesByTutors(Map<String, Object> map) {
		if (logger.isDebugEnabled()) {
			logger.debug("searchWhereCourses(Map<String, Object>) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
			return courseMapper.searchForeachCoursesByTutors(map);
		} finally {
			sqlSession.close();
		}

	}
	
	


}
