package oop_ownproject;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
	private String username;
	private String pwd;
	private String first_name;
	private String last_name;
	static ArrayList<Student>students=new ArrayList<Student>();
	public Student(String n, String pwd, String fn,String ln) {
		this.first_name=fn;
		this.last_name=ln;
		this.pwd=pwd;
		this.username=n;
	}
	public Student(String fn,String ln) {
		this.first_name=fn;
		this.last_name=ln;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public String toString() {
		return username+pwd+first_name+last_name;
	}

}
