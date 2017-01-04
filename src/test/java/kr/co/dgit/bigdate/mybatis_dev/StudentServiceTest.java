package kr.co.dgit.bigdate.mybatis_dev;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.dgit.bigdate.mybatis_dev.dto.Student;
import kr.co.dgit.bigdate.mybatis_dev.service.StudentService;

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

	/*@Test
	public void testFindStudentById() {
		Student student = studentService.findStudentById(1);
		Assert.assertNotNull(student);
	}

	
	 * @Test public void testInsertStudent() { Calendar cal =
	 * Calendar.getInstance();
	 * 
	 * cal.clear(); cal.set(1980, 0, 1);
	 * 
	 * Student insStd=new Student(); insStd.setStudId(5); insStd.setName("박경아");
	 * insStd.setEmail("pka@asd.asd"); insStd.setPhone(new
	 * PhoneNumber("010-123-1234")); insStd.setDob(cal.getTime());
	 * 
	 * int res= studentService.insertStudent(insStd); Assert.assertEquals(1,
	 * res); }
	 
	@Test
	public void testInsertStudentAutoInc() {
		Calendar cal = Calendar.getInstance();

		cal.clear();
		cal.set(1980, 0, 1);

		Student insStd = new Student();
		insStd.setName("박경아2");
		insStd.setEmail("pka@asd.asd");
		insStd.setPhone(new PhoneNumber("010-123-1234"));
		insStd.setDob(cal.getTime());

		int res = studentService.insertStudent(insStd);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testUpdateStudent() {
		Calendar cal = Calendar.getInstance();

		cal.clear();
		cal.set(1980, 0, 1);

		Student upStd = new Student();
		upStd.setStudId(6);
		upStd.setName("노창균2");
		upStd.setEmail("rcg2@asd.asd");
		upStd.setPhone(new PhoneNumber("010-123-1234"));
		upStd.setDob(cal.getTime());

		int res = studentService.updateStudent(upStd);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testDeleteStudent() {
		
		int delStudent = studentService.deleteStudent(6);
		Assert.assertSame(1, delStudent);
	}
	
	@Test
	public void testFindStudentByAll() {
		List<Student> student = studentService.findStudentByAll();
		Assert.assertNotNull(student);
		for (Student s : student) {
			Assert.assertNotNull(s);
		}
		
	}
	
	@Test
	public void testFindStudentByIdForMap() {
		Map<String, Object> student = studentService.findStudentByIdForMap(1);
		Assert.assertNotNull(student);
		
		for(Entry<String, Object> c :student.entrySet()){
			System.out.printf("%s -> %s  %n", c.getKey(), c.getValue());
		}
	}
	
	@Test
	public void testFindStudentByAllForMap(){
		List<Map<String, Object>> student = studentService.findStudentByAllForMap();
		Assert.assertNotNull(student);
		
	}
	
	//////////
	@Test
	public void testSelectStudentWithAddressResult() {
		Student student = studentService.selectStudentWithAddressResult(1);
		Assert.assertNotNull(student);
	}*/
	
	@Test
	public void testSelectStudentWithAddress() {
		Student student = studentService.selectStudentWithAddress(1);
		Assert.assertNotNull(student);
	}
	
}
