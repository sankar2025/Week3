package week3.day1;

public class Axisbank extends Bankinfo {

	public void deposit()
	{
		System.out.println("Axis Bank Method Deposit");	
	}
	public static void main(String[] args) {

		Axisbank bank = new Axisbank();
		bank.fixed();
		bank.saving();		
		bank.deposit();
		Bankinfo info = new Bankinfo();
		info.deposit();
		

	}

}
