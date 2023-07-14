package week3.day1;

public class A2Student extends A2Department {// child extends parent  (child class)
	
	public void studentName() {
		System.out.println("Student name coming from ---->student");
	}
	
	public static void main(String[] args) {
		A2Student print=new A2Student();
		print.collegeCode();
		print.collegeName();
		print.collegeRank();
		print.deptName();
		print.studentName();
		
	}

}
