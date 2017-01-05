package kr.co.dgit.bigdate.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.dgit.bigdate.mybatis_dev.dto.UserPic;
import kr.co.dgit.bigdate.mybatis_dev.service.UserPicService;

public class UserPicServiceTest {
	private static UserPicService userPicService; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userPicService = UserPicService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userPicService = null;
	}

	@Test
	public void testInsertUserPic() {
		byte[] pic = null;
		File file =new File(System.getProperty("user.dir") + "\\DataFiles\\sana.jpg");
			
			try {
				InputStream is = new FileInputStream(file);
				pic = new byte[is.available()];
				is.read(pic);
				is.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		UserPic userPic = new UserPic();
		userPic.setName("사나");
		userPic.setBio("샤샤샤");
		userPic.setPic(pic);
		
		int result =userPicService.insertUserPic(userPic);
		Assert.assertSame(1, result);
		
	}
	
	@Test
	public void testGetUserPic() {
		UserPic userPic = userPicService.getUserPic(4);
		Assert.assertNotNull(userPic);
		
		
	}
	
}
