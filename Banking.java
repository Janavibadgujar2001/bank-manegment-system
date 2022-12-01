import java.util.Scanner;
public class Banking extends AmountWithdraw
{
	public static void main(String[] args) 
	{
		int ch;
		Scanner s1 = new Scanner(System.in);
		Banking b1 = new Banking();
		b1.addUser();
		b1.viewUser();
		do
			{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.CheckBalance");
			System.out.println("Enter you Choice");
			ch = s1.nextInt();
			switch(ch)
			{
				case 1:
					b1.deposit();
					break;
				case 2 :
					b1.WithDraw();
					break;
				case 3:
					b1.checkbalance();
					break;		
			}
		}while(ch!=0);
	}
}