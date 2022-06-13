package oop_ownproject;
import java.io.*;
import java.util.*;

public class Course implements Serializable {
	private String name;
	private String id;
	private int max;
	private int curr;

	private ArrayList<String>students=new ArrayList<String>();
	static ArrayList<Course>courses=new ArrayList<Course>();
	private String instructor;
	private int num;
	private String loc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getCurr() {
		return curr;
	}
	public void setCurr(int curr) {
		this.curr = curr;
	}
	
	public ArrayList<String> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}
	
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Course(String n, String id, int m, int c, ArrayList<String>students, String instructor, int num, String l) {
		this.name=n;
		this.id=id;
		this.max=m;
		this.curr=c;
		this.students=students;
		this.instructor=instructor;
		this.num=num;
		this.loc=l;
	}
	

	public String toString() {
		return "course name "+name+" course id "+id+" maximum students "+max+" current students "+curr+" list of students "+students+
				" instructor "+ instructor+" section num "+num+" Couselocation "+loc+"\n";
	}
	

}
