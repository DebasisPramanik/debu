package practice;

import java.util.Scanner;

public class a 
{
  public static void main(String args[])
  {
	System.out.println("enter 3 numbers");
	Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int s=x+y+z;
	System.out.println("sum is " + s);
  }
}