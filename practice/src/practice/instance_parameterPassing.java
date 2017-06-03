package practice;

public class instance_parameterPassing
{
   int roll;
   String name;
   int salary;
   public instance_parameterPassing(int x,String y,int z)
   {
	  roll=x;
	  name=y;
	  salary=z;
   }
   public void display()
   {
	  System.out.println("roll = "+roll );
	  System.out.println("name = "+name );
	  System.out.println("salary = "+salary );
   }
   
   public static void main(String args[])
   {
	   instance_parameterPassing pp=new instance_parameterPassing(100,"debasis",300000);
	   pp.display();
	   
   }
}
