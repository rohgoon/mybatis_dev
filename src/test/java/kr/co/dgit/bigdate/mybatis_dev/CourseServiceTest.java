package kr.co.dgit.bigdate.mybatis_dev;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.dgit.bigdate.mybatis_dev.dto.Course;
import kr.co.dgit.bigdate.mybatis_dev.service.CourseService;

public class CourseServiceTest {
	private static CourseService courseService; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}

	
	@Test
	public void testSearchCourses() {
		GregorianCalendar cal = new GregorianCalendar(2013, 1, 1);
		Map<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		map.put("startDate", cal.getTime());
		List<Course> courses = courseService.searchCourses(map);
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void testSearchCaseCourses() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		List<Course> courses = courseService.searchCaseCourses(map);
		Assert.assertNotNull(courses);
		
		map.replace("searchBy", "CourseName");
		map.remove("tutorId");
		map.put("courseName", "%java%");
		courses = courseService.searchCaseCourses(map);
		Assert.assertNotNull(courses);
		
	}
	
}
