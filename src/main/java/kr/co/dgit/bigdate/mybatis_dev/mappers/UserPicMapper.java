package kr.co.dgit.bigdate.mybatis_dev.mappers;

import java.util.List;
import java.util.Map;

import kr.co.dgit.bigdate.mybatis_dev.dto.Course;
import kr.co.dgit.bigdate.mybatis_dev.dto.Student;
import kr.co.dgit.bigdate.mybatis_dev.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userPic);
	UserPic getUserPic(int id);
	
}
