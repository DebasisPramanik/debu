package practice;

public class local_variable
{
 public static void main(String args[])
 {
	 int a=10;
	 {
		 int b=20;
		 System.out.println("value of a= " +a);
		 System.out.println("value of b= " +b);
	 }
	 System.out.println("value of a= " +a);
	 //System.out.println("value of b= " +b); we are trying to access b outside the block
 }
}
