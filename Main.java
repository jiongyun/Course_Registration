package oop_ownproject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String flag;
		System.out.println("welcome! Is this your first time using this Course Registration System. Please answer yes or no");
		flag=input.next();
		if(flag.equals("no")) {
		try{
			 
		      FileInputStream fis = new FileInputStream("/Users/jiongyunsun/Downloads/Course.ser");
		      FileInputStream fis2 = new FileInputStream("/Users/jiongyunsun/Downloads/Student.ser");
		      ObjectInputStream ois = new ObjectInputStream(fis);
		      ObjectInputStream ois2 = new ObjectInputStream(fis2);
		      Course.courses = (ArrayList<Course>)ois.readObject(); 
		      Student.students = (ArrayList<Student>)ois2.readObject();
		      

		      ois.close();
		      fis.close();
		      
		      ois2.close();
		      fis2.close();
		    }
		    catch(IOException ioe) {
		       ioe.printStackTrace();
		       return;
		    }
		 catch(ClassNotFoundException cnfe) {
		       cnfe.printStackTrace();
		       return;
		     }
		}
		String user;
		int choice_1;
		int choice_2;
		int choice_3;
		int choice_4;
		int newmax;
		boolean print=true;
		String admin_name;
		String admin_pwd;
		String student_name;
		String student_pwd;
		CSVReader.main(args);
		Admin a=new Admin("ADMIN","admin01");
		Admin.admins.add(a);
		
		
		while(print) {
		System.out.println("are you admin or student");
		user=input.next();
		if(user.equals("admin")) {
			System.out.println("username: ");
			admin_name=input.next();
			System.out.println("password: ");
			admin_pwd=input.next();
			for(int i=0; i<Admin.admins.size(); i++) {
				if((Admin.admins.get(i).getUsername().equals(admin_name)) && (Admin.admins.get(i).getPwd().equals(admin_pwd))) {
						System.out.println("press 1 to course management; press 2 to reports");
						choice_1=input.nextInt();
						if(choice_1==1) {
						System.out.println("Courses Management");
						System.out.println("1.Create a new course");
						System.out.println("2.Delete a course");
						System.out.println("3.Edit a course ");
						System.out.println("4.Display information for a given course (by course ID)");
						System.out.println("5.Register a student");
						System.out.println("6.Exit");
						choice_2=input.nextInt();
						if(choice_2==1) {
							String name;
							String id;
							int max;
						    int curr;
							String instructor;
							int num;
							String loc;
						    ArrayList<String>s=new ArrayList<String>();
							
							System.out.println("course name:");
							input.nextLine();
							name=input.nextLine();
							System.out.println("couse id:");
							id=input.next();
							System.out.println("maximum students");
							max=input.nextInt();
							System.out.println("current students");
							curr=input.nextInt();
							System.out.println("course instructor:");
							input.nextLine();
							instructor=input.nextLine();
							System.out.println("Course_Section_Number:");
							num=input.nextInt();
							System.out.println("course location: ");
							input.nextLine();
							loc=input.nextLine();
							Course c=new Course(name,id,max,curr,s,instructor,num,loc);
							Course.courses.add(c);
							
							System.out.println("Saved Succesfully...Press Enter to go back to the Main Window");
							
						}
						if (choice_2==2) {
							String delete_id;
							System.out.println("enter the course id: ");
							input.nextLine();
							delete_id=input.nextLine();
							for(int j=0; j<Course.courses.size(); j++) {
								if(Course.courses.get(j).getId().equals(delete_id)) {
									Course.courses.remove(j);
									System.out.println("Deleted...press Enter to go back to Main Window");
								}
							}	
							
						}
						if(choice_2==3) {
							String edit_n;
							String edit;
							int e;
							System.out.println("enter the course name that you want to edit: ");
							input.nextLine();
							edit_n=input.nextLine();
							
							for(int k=0; k<Course.courses.size(); k++) {
								if(Course.courses.get(k).getName().equals(edit_n)) {
									System.out.println(Course.courses.get(k));
						}
						}
							System.out.println(" press 1 to edit maximum students \n press 2 to edit current"
									+ "students \n press 3 to edit instructor \n press 4 to edit location\n");
							choice_4=input.nextInt();
							if(choice_4==1) {
								System.out.println("enter the new maximum students");
								newmax=input.nextInt();
								for(int k=0; k<Course.courses.size(); k++) {
									if(Course.courses.get(k).getId().equals(edit_n)) {
										Course.courses.get(k).setMax(newmax);
										System.out.println(Course.courses.get(k));	
							}
							
						}
							}
							if(choice_4==2) {
								System.out.println("enter the new curr students");
								int newcur;
								newcur=input.nextInt();
								for(int k=0; k<Course.courses.size(); k++) {
									if(Course.courses.get(k).getId().equals(edit_n)) {
										Course.courses.get(k).setCurr(newcur);
										System.out.println(Course.courses.get(k));	
									}
							}
						}if(choice_4==3) {
							System.out.println("enter the new instructor");
							String new_instructor;
							new_instructor=input.nextLine();
							for(int k=0; k<Course.courses.size(); k++) {
								if(Course.courses.get(k).getId().equals(edit_n)) {
									Course.courses.get(k).setInstructor(new_instructor);
									System.out.println(Course.courses.get(k));	
								}
						}
					}if(choice_4==4) {
						System.out.println("enter the new location: ");
						String new_loc;
						new_loc=input.nextLine();
						for(int k=0; k<Course.courses.size(); k++) {
							if(Course.courses.get(k).getId().equals(edit_n)) {
								Course.courses.get(k).setLoc(new_loc);
								System.out.println(Course.courses.get(k));	
							}
					}
				}
							
						}
						if(choice_2==4) {
							String search;
							System.out.println("enter the course id for searching ");
							search=input.next();
							for(int k=0; k<Course.courses.size(); k++) {
								if(Course.courses.get(k).getId().equals(search)) {
									System.out.println(Course.courses.get(k));	
								}
						}
						}
						if(choice_2==5) {
							String un;
							String pwd;
							String fn;
							String ln;
							System.out.println("enter the username: ");
							un=input.next();
							System.out.println("enter the password: ");
							pwd=input.next();
							System.out.println("enter the firstname");
							fn=input.next();
							System.out.println("enter the lastname");
							ln=input.next();
							Student s=new Student(un,pwd,fn,ln);
							Student.students.add(s);
							 
							
							System.out.println(Student.students);
							
						}if(choice_2==6) {
							print=false;
						}
						}
						if(choice_1==2) {
							System.out.println("reports");
							System.out.println("1.view all course");
							System.out.println("2.view all course that are full");
							System.out.println(
									"3.View the names of the students being registered in a specific course\n"
									+ "4.View the list of courses that a given student is being registered on\n"+
									"5. Sort courses based on the current number of student registers\n"+
									"6. Exit" );
							choice_3=input.nextInt();
							if(choice_3==1) {
								CSVReader.view();
							}
							if(choice_3==2) {
								for(int k=0; k<Course.courses.size(); k++) {
									if(Course.courses.get(k).getMax()<=Course.courses.get(k).getStudents().size()) {
										System.out.println(Course.courses.get(k).getName());
									}
									
								}
								
							}if(choice_3==3) {
								String c;
								int s;
								System.out.println("enter the course name:");
								input.nextLine();
								c=input.nextLine();
								System.out.println("enter the section num: ");
								s=input.nextInt();
								for(int k=0; k<Course.courses.size(); k++) {
									if(Course.courses.get(k).getName().equals(c)&&
											Course.courses.get(k).getNum()==s){
										System.out.println(Course.courses.get(k).getStudents());
									}
							}
						}if(choice_3==4) {
							String u;
							System.out.println("Student's username: ");
							input.nextLine();
							u=input.nextLine();
							for(int z=0; z<Student.students.size(); z++) {
								if((Student.students.get(z).getUsername().equals(u))){
									for(int k=0; k<Course.courses.size(); k++) {	
										if(Course.courses.get(k).getStudents().contains(Student.students.get(z).getFirst_name()+
												" "+Student.students.get(z).getLast_name())){
									
									System.out.println(Course.courses.get(k).getName());
								}
						}
						}
				
				}
			}if(choice_3==5) {
			Collections.sort(Course.courses, new Sorter());
			System.out.println(Course.courses);
				
			}if(choice_3==6) {
				print=false;
			}
			}
				}
			}
		}
		
					
				if(user.equals("student")) {
					int choice_5;
					String reg_course;
					int reg_sec;
					System.out.println("username: ");
					student_name=input.next();
					System.out.println("password: ");
					student_pwd=input.next();
					for(int z=0; z<Student.students.size(); z++) {
						if((Student.students.get(z).getUsername().equals(student_name)) && (Student.students.get(z).getPwd().equals(student_pwd))) {
					
					System.out.println("Course Management\n"
							+ "1. View all courses\n"
							+ "2. View all courses that are not FULL\n"
							+ "3. Register on a course (student must enter the course name, section, and\n"
							+ "student full name, the name will be added to the appropriate course)\n"
							+ "4. Withdraw from a course (the student will be asked to enter her/his student\n"
							+ "name and the course, then the name of the student will be taken off from the given course’\n"
							+ "list)\n"
							+ "5. View all courses that the current student is being registered in\n"
							+ "6. Exit");
					choice_5=input.nextInt();
					if(choice_5==1) {
						CSVReader.view();
					}
					if (choice_5==2) {
						for(int k=0; k<Course.courses.size(); k++) {
							if(Course.courses.get(k).getMax()>Course.courses.get(k).getStudents().size()) {
								System.out.println(Course.courses.get(k).getName());
							}
					}
					}
					if(choice_5==3) {
						System.out.println("enter the course name you want register: ");
						input.nextLine();
						reg_course=input.nextLine();
						System.out.println("enter the course section num you want register: ");
						reg_sec=input.nextInt();
				
						for(int k=0; k<Course.courses.size(); k++) {
							if(Course.courses.get(k).getName().equals(reg_course)&&
									Course.courses.get(k).getNum()==reg_sec){
								System.out.println(Course.courses.get(k));
								ArrayList<String>new_students=new ArrayList<String>();
								new_students=Course.courses.get(k).getStudents();
								new_students.add(Student.students.get(z).getFirst_name()+" "+Student.students.get(z).getLast_name());
								Course.courses.get(k).setStudents(new_students);
								System.out.println(Course.courses.get(k).getStudents());
								Course.courses.get(k).setCurr(Course.courses.get(k).getCurr()+1);
							
							}
					}
				}if (choice_5==4) {
					String username;
					String course;
					int sec;
					System.out.println("enter the your username: ");
					input.nextLine();
					username=input.nextLine();
					System.out.println("enter the course name you want to withdraw: ");
					course=input.nextLine();
					System.out.println("enter the course section num you want to withdraw: ");
					sec=input.nextInt();
					for(int k=0; k<Course.courses.size(); k++) {
						if(Course.courses.get(k).getName().equals(course)&&
								Course.courses.get(k).getNum()==sec){
							
							ArrayList<String>new_students=new ArrayList<String>();
							new_students=Course.courses.get(k).getStudents();
							new_students.remove(Student.students.get(z).getFirst_name()+" "+Student.students.get(z).getLast_name());
							Course.courses.get(k).setStudents(new_students);
							System.out.println(Course.courses.get(k).getStudents());
							Course.courses.get(k).setCurr(Course.courses.get(k).getCurr()-1);
						}
				}
				}if(choice_5==5) {
					for(int k=0; k<Course.courses.size(); k++) {	
						if(Course.courses.get(k).getStudents().contains(Student.students.get(z).getFirst_name()+" "+Student.students.get(z).getLast_name())){
							System.out.println(Course.courses.get(k).getName());
						}
				}
					
				}if(choice_5==6) {
					print=false;
				}
				}
					}
				}
		
			
		}
		try {
			
			FileOutputStream Course_Data = new FileOutputStream("/Users/jiongyunsun/Downloads/Course.ser");
			
			
			FileOutputStream student_Data = new FileOutputStream("/Users/jiongyunsun/Downloads/Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(Course_Data);
			
			ObjectOutputStream oos2 = new ObjectOutputStream(student_Data);

			
			//Writes the specific object to the OOS
			
			oos2.writeObject(Student.students);

			oos.writeObject(Course.courses);
			

			
			//Close both streams
			oos.close();
			oos2.close();

			Course_Data.close();
			
			student_Data.close();

			System.out.println("All information has been updated.");
		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
			}

	
}
