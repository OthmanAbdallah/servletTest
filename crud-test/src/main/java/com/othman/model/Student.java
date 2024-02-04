package com.othman.model;

public class Student extends Human{
 private int Sid;
 private Double  Gpa;
 private String Uni_Abb;
 
 public Student(int id,String name,int age,String gender,String country,int sid,Double gpa,String uni_Abb) {
	Id=id;
	Name=name;
	Age=age;
	 Gender=gender;
	 Country=country;
	 Sid=sid;
	 Gpa=gpa;
	Uni_Abb=uni_Abb;
}
 public Student(int sid,Double gpa,String uni_Abb) {
		 Sid=sid;
		 Gpa=gpa;
		Uni_Abb=uni_Abb;
	}
 
 public Student() {

}

public int getid() {
		return Id;
	}
 
public int getSid() {
	return Sid;
}

@Override
public String toString() {
	return "Student [Sid=" + Sid + ", Name=" + Name + ", Age=" + Age + ", Country=" + Country + ", Gpa=" +  Gpa
			+ ", Uni_Abb=" + Uni_Abb + ", Gender=" + Gender + "]";
}
public void setSid(int sid) {
	Sid = sid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public Double getGpa() {
	return  Gpa;
}
public void setGpa(Double gpa) {
	 Gpa = gpa;
}
public String getUni_Abb() {
	return Uni_Abb;
}
public void setUni_Abb(String uni_Abb) {
	Uni_Abb = uni_Abb;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
 
	
	
	
}
