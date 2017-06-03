package practice;

import java.util.Scanner;

public class instance_variabnle 
{
  int a;  //instance variable
  int b;  //instance variable
  public void sum()
	  {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter 2 numbers");
	      int a =sc.nextInt();
	      int b =sc.nextInt();
	      int s=a+b;
	      System.out.println("sum is " +s );
	  }

  public static void main(String args[])
  {
	  instance_variabnle  iv=new instance_variabnle ();
	  iv.sum();
  }
}
