
 

public class Average {

	public static void main(String[] args) {
		 double a=56,b=87,c=45,d=76,e=34,f=78,sum,avg;
		  
sum=(a+b+c+d+e+f);
avg=(sum/6)*100;
if(avg<35)
{
	System.out.println("student failed");
	
}
else
	if(avg>35||avg<50)
	{
		  System.out.println("student passed in third class");

	}
	else if(avg>50||avg<60)
	{
		  System.out.println("student passed in second class");

	}
	else
	{
		  System.out.println("student passed in first class");

	}}}