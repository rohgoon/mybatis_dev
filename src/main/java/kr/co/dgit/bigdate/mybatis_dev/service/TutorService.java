package kr.co.dgit.bigdate.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.co.dgit.bigdate.mybatis_dev.dto.Tutor;
import kr.co.dgit.bigdate.mybatis_dev.mappers.TutorMapper;
import kr.co.dgit.bigdate.mybatis_dev.util.MyBatisSqlSessionFactory;

public class TutorService {
	private static final Logger logger = Logger.getLogger(TutorService.class);

	private final static TutorService instance = new TutorService();

	public static TutorService getInstance() {
		return instance;
	}

	private TutorService() {
	}

	public Tutor findTutorById(int tutorId) {
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentById(int) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
			return tutorMapper.findTutorById(tutorId);
		} finally {
			sqlSession.close();
		}

	}


}
