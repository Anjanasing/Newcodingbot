class calculator
{
	int addition(int num1,int num2)
	{
return num1+num2;
}
int addition(int num1,int num2,int num3)
{
return num1+num2+num3;
}
}



public class CompileTimePolymorpizm {

	public static void main(String[] args) {
		{
			calculator obj=new calculator();
		
		System.out.println("Addition of two num is "+obj.addition(30,40));
        System.out.println("Addtion of two num is  "+obj.addition(30,40,50));
	
	}
	}
}
