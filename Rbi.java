abstract class RBI
{
  RBI()
  { super();
  }
  abstract void rateOfIntrest();
  abstract void withdrawLimit();
  abstract void depositLimit();

}
abstract class SBI extends RBI
{
	String accountType;
	String userName;
	SBI(String accountType,String userName)
	{
		super();
		this.accountType=accountType;
		this.userName=userName;
	}

	public void displayDeatils()
	{
		System.out.println("Account type :" +this.accountType);
		System.out.println("user name :"+this.userName);
	}
}
class Savings extends SBI
{
	void rateOfIntrest()
	{
		System.out.println("rate of intrest"+8.5);
	}
	void withdrawLimit()
	{
		System.out.println("withdraw limit is 50000");
	}
	void depositLimit()
	{
		System.out.println("deposit limit is 100000");
	}
}

class RBIDrriver
{
	public static void main(String[] args) {

		Savings obj = new Savings("Saving","Rasika");
		obj.rateOfIntrest();
		obj.withdrawLimit();
		obj.depositLimit();
	}
}