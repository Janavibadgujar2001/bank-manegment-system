import java.util.Scanner;
public class AmountDetails{
	
	int acc_no,balance;
	String name;
	Scanner s1 = new Scanner(System.in);
	
	void addUser()
	{
		System.out.println("Enter your Account number : ");
		acc_no = s1.nextInt();
		System.out.println("Enter your Name : ");
		s1.nextLine();
		name = s1.nextLine();
	}
	
	void viewUser()
	{
		System.out.println("Account number is : " +acc_no);
		System.out.println("Name is : " +name);
	}
	void checkbalance()
	{
		System.out.println("account balance is : " +balance);
	}
	
}