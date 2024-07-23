package p1;

public class JDBCdemo {
	
  public static void main(String[] args) throws ClassNotFoundException
  {
	  
	  Class.forName("com.mysql.cj.jdbc.Driver");

	  System.out.println("Driver Found");
  }
}
