package oop_ownproject;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Admin {
	private String username;
	private String pwd;
	static ArrayList<Admin>admins=new ArrayList<Admin>();
	
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
	public Admin(String username,String pwd) {
		this.username=username;
		this.pwd=pwd;
	}
	
	

}
