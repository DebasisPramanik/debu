package practice;

public class sumof_digits 
{

    public void calculate(int x)
    {
    	int s=0;
    	while(x<0)
    	{ 
    	int d=x%10;
    	s=s+d;
    	x=x/10;
    	System.out.println("sum of digits "+s);
    	}
		
    }
    public static void main(String args[])
    {
    	sumof_digits ss=new sumof_digits();
    	ss.calculate(123);
    }

}

