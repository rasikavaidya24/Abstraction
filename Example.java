abstract class Example
{
	abstract int addition(int num1,int num2);
	abstract int substraction(int num1,int num2);
	abstract int multiplication(int num1,int num2);
	abstract int division(int num1,int num2);

	 class implementation extends Example
	 {
	 	int addition(num1,num2)
	 	{
	 	   addition=num1+num2;
	 	   return addition;
	 	}
	 
        int substraction(num1,num2)
        {
	 	   substraction=num1-num2;
	 	   return substraction;
	    }

	 	int multiplication(num1,num2)
	 	{
	 	    multiplication=num1*num2;
	 	    return multiplication;
	 	}

        int division(num1,num2)
        {
	 	    division=num1/num2;
	 	    return division;
	 	}
}
class driver
{
  public static void main(String[] args) 
  {
       Example obj = new Example();
       System.out.println(obj.addition(10,20));
       System.out.println(obj.substraction(20,10));
       System.out.println(obj.multiplication(10,20));
       System.out.println(obj.division(20,10));

  }
}