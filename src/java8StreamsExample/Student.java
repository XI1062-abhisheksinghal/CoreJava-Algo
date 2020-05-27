package java8StreamsExample;

import java.util.List;

public class Student {
	
	String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	Integer age;
	Address address;
	List<MobileNumber> mobileNumbers;
	
	

}
