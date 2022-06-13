package oop_ownproject;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import oop_ownproject.Course;

public class CSVReader {
	public static void main(String[] args) {
		
		String path="/Users/jiongyunsun/Downloads/MyUniversityCourses (4).csv";
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			br.readLine();
			while((line=br.readLine())!= null) {
				String[] lines = line.split(",");
				ArrayList<String> students = new ArrayList<String>();
				students.add(lines[4]);
				
				int max = Integer.parseInt(lines[2]);
				int cur = Integer.parseInt(lines[3]);
				int num = Integer.parseInt(lines[6]);
				
				Course.courses.add(new Course(lines[0], lines[1],max,cur,students, lines[5],num,lines[7]));
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void view() {
		System.out.println(Course.courses);
	}
	

}
