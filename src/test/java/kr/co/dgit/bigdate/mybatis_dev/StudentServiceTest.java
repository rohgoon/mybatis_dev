package kr.co.dgit.bigdate.mybatis_dev;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import kr.co.dgit.bigdate.mybatis_dev.dto.Student;
import kr.co.dgit.bigdate.mybatis_dev.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService =StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testFindStudentById() {
		Student student = studentService.findStudentById(1);
		Assert.assertNotNull(student);
	}
}
