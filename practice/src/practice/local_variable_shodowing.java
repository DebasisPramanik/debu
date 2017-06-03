package practice;

public class local_variable_shodowing 
{
	 public static void main(String args[])
	 {
		 int a=10;
		 {
			// int a=20;  error here duplicate local variable
			 System.out.println("value of a= " +a);

		 }
		 System.out.println("value of a= " +a);
		 //System.out.println("value of b= " +b); we are trying to access b outside the block
	 }
	}