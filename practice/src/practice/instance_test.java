package practice;

public class instance_test 
{
   public void test()
   {
	   int a=10;
	   System.out.println("value of a " +a);
	   System.out.println("value of b " +b);
   }
   int b=100;  //b is declared in the middle.before the declaration we haver used it. 
   
   public static void main(String args[])
   {
 	  instance_test xxx = new instance_test ();
 	  xxx.test();
   }
}
