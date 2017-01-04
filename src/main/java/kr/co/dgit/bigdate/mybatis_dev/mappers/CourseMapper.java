package kr.co.dgit.bigdate.mybatis_dev.mappers;

import java.util.List;
import java.util.Map;

import kr.co.dgit.bigdate.mybatis_dev.dto.Course;

public interface CourseMapper {
	List<Course> searchCourses(Map<String, Object> map);
	List<Course> searchCaseCourses(Map<String, Object> map);
}
