package kr.co.dgit.bigdate.mybatis_dev.dto;

public class EnumTest {
	public static void main(String[] args) {
		Gender f =Gender.FEMALE;
		
		switch(f){
			case FEMALE:
				System.out.println("여자");
				break;
			case MALE:
				System.out.println("남자");
				break;
			
		}
		System.out.println(f.ordinal());
	}
}
