package p1;

public class Employee {
	private static int empno;
	private float salary;;
	private float totsalary;
	
	public void getsal(float s) {
		salary=s;
		empno++;
		totsalary += salary;
		System.out.println("Em_no:"+ empno);
		System.out.println("Salary:"+ salary);
		System.out.println("totalsalary->:"+ totsalary+"\n");
	    
		
	}
     public static void main(String[] args) {
    	 Employee e1= new Employee();
    	 e1.getsal(33.3f);
    	 e1.getsal(63.3f);
    	 
	 
	}
}
