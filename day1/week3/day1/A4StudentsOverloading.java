package week3.day1;

public class A4StudentsOverloading { //overloading

	public void getStudentInfo() {
		System.out.println("Empty student info");
		
	}
	
	public void getStudentInfo(int id ,String name) {
		System.out.println(id+ ""  +"     " +name);
		
	}

	public void getStudentInfo(String email,long phnnum) {
		
		System.out.println(email+ "    " +phnnum);
	
}
	public static void main(String[] args) {
		A4StudentsOverloading print=new A4StudentsOverloading();
		print.getStudentInfo();
	    print.getStudentInfo(7, "monisha");
	    print.getStudentInfo("moni@gmail", 656677777l);
	    
		
	}
	
}
