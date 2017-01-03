package kr.co.dgit.bigdate.mybatis_dev.dto;

import java.util.Date;
import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	private String bio;
	private Address addrId;
	private List<Course> courses;
	
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public Address getAddrId() {
		return addrId;
	}
	public void setAddrId(Address addrId) {
		this.addrId = addrId;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return String.format("Tutor [tutorId=%s, name=%s, email=%s, phone=%s, dob=%s, bio=%s, addrId=%s, courses=%s]",
				tutorId, name, email, phone, dob, bio, addrId, courses);
	}
	
	
}
