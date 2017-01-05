package kr.co.dgit.bigdate.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.co.dgit.bigdate.mybatis_dev.dto.UserPic;
import kr.co.dgit.bigdate.mybatis_dev.mappers.UserPicMapper;
import kr.co.dgit.bigdate.mybatis_dev.util.MyBatisSqlSessionFactory;

public class UserPicService {
	private static final Logger logger = Logger.getLogger(UserPicService.class);

	private final static UserPicService instance = new UserPicService();

	public static UserPicService getInstance() {
		return instance;
	}

	private UserPicService() {
	}

	public UserPic getUserPic(int id) {
		if (logger.isDebugEnabled()) {
			logger.debug("getUserPic(int) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserPicMapper userPicMapper = sqlSession.getMapper(UserPicMapper.class);
			return userPicMapper.getUserPic(id);
		} finally {
			sqlSession.close();
		}

	}
	
	public int insertUserPic(UserPic userPic) {
		if (logger.isDebugEnabled()) {
			logger.debug("insertUserPic(UserPic) - start");
		}

		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserPicMapper userPicMapper = sqlSession.getMapper(UserPicMapper.class);
			int res= userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		} finally {
			sqlSession.close();
		}

	}
	


}
