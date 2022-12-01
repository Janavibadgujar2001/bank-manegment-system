import java.util.Scanner;

public class AmountDeposit extends AmountDetails {
	
	int amount;
	Scanner s1 = new Scanner(System.in);
	
	void deposit()
	{
		System.out.println("Enter Amount how much you want to Deposit");
		amount = s1.nextInt();
		System.out.println("Your current account balance is : " +amount);
		balance = amount+balance;
	}
}