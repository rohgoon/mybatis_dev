package kr.co.dgit.bigdate.mybatis_dev.dto;

public class Address {
	private int addrId;
	private String street;
	private String city;
	private String zip;
	private String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(int addrId, String street, String city, String zip, String country) {
		super();
		this.addrId = addrId;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}
	
	
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return String.format("Address [%s, %s, %s, %s, %s]", addrId, street, city, zip,
				country);
	}
	
	
}
