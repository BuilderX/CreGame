package NoSe;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
			String name;
			int idNum;
			double newStatus;
			ArrayList list;
			
			
			
	public static void main(String[] args) {
		String name;
		int idNum;
		double newStatus;
		Scanner input = new Scanner(System.in);
		ArrayList<Student> insert = new ArrayList<Student>();
		
		int i = 0;
		System.out.println(" Enter students Name, Id and Status");
		
		do {
			name = input.next();
			idNum = input.nextInt();
			newStatus = input.nextDouble();
			
				System.out.println("Name  : "+name);
				System.out.println("ID : " + idNum);
				System.out.println("Status : "+newStatus);
			while(insert.isEmpty()){
			
				insert = Insert(name, idNum,newStatus);
			}
			i++;
		}
	
		while(i < 3)   ;
		System.out.println(insert.toString());
		System.out.println("List Contents /n");
		
			
		for (Student student : insert) {
			System.out.println(student);
		}
		
		int key = input.nextInt();
		
		switch (key) {
		case 4:
			
			break;
		case 2:
			break;
		case 8:
			break;

		default:
			break;
		}
		
	}



	private static ArrayList<Student> Insert(String name, int idNum, double newStatus) {
				Student newStudent = new Student(name, idNum, newStatus);
				ArrayList<Student> list = new ArrayList<Student>();
				list.add(newStudent);
				System.out.println(list.toString());
		
		return list ;
	
		
	}

}

class Student{
	String name;
	int idNum;
	double newStatus;
	Scanner input = new Scanner(System.in);
	boolean InSchoolToDay = false;
	Student s;
	
	
	{System.out.println("Enter Students");
	
	}
	Student(){
		
		System.out.println(" Enter students name, id and status");
		
					if(newStatus == 1) {
						InSchoolToDay = true;
						System.out.println(name  + "Is in class today ");
					}else if(newStatus ==0){
							System.out.println(name  + "Is absent today ");
							
						}}
		
		


		public Student(String name, int idNum, double newStatus) {
			super();
			this.name = name;
			this.idNum = idNum;
			this.newStatus = newStatus;		
			
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getIdNum() {
			return idNum;
		}


		public void setIdNum(int idNum) {
			this.idNum = idNum;
		}


		public double getNewStatus() {
			return newStatus;
		}


		public void setNewStatus(double newStatus) {
			this.newStatus = newStatus;
		}


		public boolean isInSchoolToDay() {
			return InSchoolToDay;
		}




		public void setInSchoolToDay(boolean inSchoolToDay) {
			InSchoolToDay = inSchoolToDay;
		}




		@Override
		public String toString() {
			return "Student [ name=" + name + ", idNum=" + idNum
					+ ", newStatus=" + newStatus
					+ ", InSchoolToDay=" + InSchoolToDay + "]";
		}
	
	
}
