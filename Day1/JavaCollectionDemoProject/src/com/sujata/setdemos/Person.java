package com.sujata.setdemos;

import java.util.Objects;

/*
 * hashCode() and equals() belongs to Object class
 * equals() default behavior is to check wheather two refrences are pointing to same object if yes then true otherwise false
 * hashCode() default behavior is that every object will have unique hashcode
 * 
 * but to conside two objects as unique
 * If two objects hashcodes are same , they might not be meaningfully equal
 * and if two objects are meaningfully equal then their hashcode must also be same 
 */
//POJO : Plain Old Java Object or Java Beans
public class Person {

	private int pId;
	private String pName;
	private int pAge;

	public Person() {

	}

	public Person(int pId, String pName, int pAge) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pAge, pId, pName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return pAge == other.pAge && pId == other.pId && Objects.equals(pName, other.pName);
	}

	
}
