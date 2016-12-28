package kr.co.dgit.bigdate.mybatis_dev;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.dgit.school.dto.PhoneNumber;
import kr.co.dgit.school.dto.Student;
import kr.co.dgit.school.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testSelectByAll() {
		List<Student> list = studentService.findAllStudent();
		Assert.assertNotNull(list);
	}
	/*@Test
	public void testSelectByNo() {
		Student std = studentService.selectByNo(1);
		Assert.assertNotNull(std);
	}
	
	@Test
	public void testInsertItem() {
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 01, 01);
		Student insStd = new Student(4, "강보미2", "kbm2@test.co.kr", cal.getTime()); 
		studentService.insertItem(insStd);
		
		List<Student> list = studentService.findAllStudent();
		
		Assert.assertEquals(4, list.size());
	}*/
	
	/*@Test
	public void testDeleteItem() { 
		studentService.deleteItem(4);
		
		Student std = studentService.selectByNo(4);
		
		Assert.assertNull(std);
	}
	

	@Test
	public void testInsertItem() {
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 01, 01);
		Student insStd = new Student(5, "강보미3", "kbm2@test.co.kr", cal.getTime(), new PhoneNumber("010-6544-6544")); 
		studentService.insertItem(insStd);
		
		List<Student> list = studentService.findAllStudent();
		
		Assert.assertEquals(4, list.size());
		}
	@Test
	public void testUpdateItem() {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(2000, 01, 01);
		Student upStd = new Student(5, "이유진", "lyj@test.co.kr", cal.getTime(), new PhoneNumber("010-6544-6544")); 
		studentService.updateItem(upStd);
		
		Student std = studentService.selectByNo(5);
		Assert.assertEquals(std, upStd);
	}*/
}
