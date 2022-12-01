import java.util.Scanner;
public class AmountWithdraw extends AmountDeposit{
	
	int amount_bal;
	Scanner s1 = new Scanner(System.in);
	
	void WithDraw()
	{
		System.out.println("enter amount how much you want to withdraw: ");
	    amount_bal = s1.nextInt();
	    if(amount < 4999)
	    {
	    	System.out.println("you do have sufficient balance to withdraw: ");
	    	
	    }
	    else
	    {
	    	balance = balance - amount_bal;
	    	System.out.println("Cash Withdraw successfully");
	    	System.out.println("Your current balence is : ");
	    	
	    }
	}
}