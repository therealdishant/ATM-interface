import java.util.*;
public class atm
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int Dihant_Dey = 1234;
		int Ankita_Mondal = 5678;
		int Dishani_Podder = 8998;
		int Ashutosh_Ram = 8765;
		int Sudhriti_Biswas = 4321;
		int Namrata_Sarkar =6567;
		System.out.println("1.Dihant_Dey-22601219128  2. Ankita_Mondal-22601219071  3. Dishani_Podder-22601219164  4. Ashutosh_Ram-22601219141  5. Sudhriti Biswas-22601219123  6. Namrata Sarkar-22601219124");
		System.out.println("****CHOICE ONE OPTION****");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter passcode");
			int password = sc.nextInt();
			double current_balance = 15000.65;
			if(password == Dihant_Dey )
			{
				System.out.println("1 for withdraw 2 for deposit 3 for balance check");
				System.out.println("******CHOICE ONE OPTION******");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
						System.out.println("enter amount to withdraw:");
						int withdraw = sc.nextInt();
						current_balance -= withdraw;
						System.out.println("balance: " + current_balance);
						break;
					case 2:
						System.out.println("enter amount to deposit:");
						int deposit = sc.nextInt();
						current_balance += deposit;
						System.out.println("balance: " + current_balance);
						break;
					case 3:
						System.out.println("balance: " + current_balance);
						break;
					default:
						System.out.println("enter valid option");
						break;
				}
			}
			else
				System.out.println("******WRONG PASSWORD******");
		}
		if(choice == 2)
		{
			System.out.println("enter passcode");
			int password = sc.nextInt();
			double current_balance = 16000.65;
			if(password == Ankita_Mondal)
			{
				System.out.println("1 for withdraw 2 for deposit 3 for balance check");
				System.out.println("******CHOICE ONE OPTION******");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
						System.out.println("Enter amount to withdraw:");
						int withdraw = sc.nextInt();
						current_balance -= withdraw;
						System.out.println("balance: " + current_balance);
						break;
					case 2:
						System.out.println("enter amount to deposit:");
						int deposit = sc.nextInt();
						current_balance += deposit;
						System.out.println("balance: " + current_balance);
						break;
					case 3:
						System.out.println("balance: " + current_balance);
						break;
					default:
						System.out.println("Enter valid option");
						break;
				}
			}
			else
				System.out.println("******WRONG PASSWORD******");

		}
			if(choice == 3)
		{
			System.out.println("Enter passcode");
			int password = sc.nextInt();
			double current_balance = 17000.71;
			if(password == Dishani_Podder)
			{
				System.out.println("1 for withdraw 2 for deposit 3 for balance check");
				System.out.println("******CHOICE ONE OPTION******");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
						System.out.println("Enter amount to withdraw:");
						int withdraw = sc.nextInt();
						current_balance -= withdraw;
						System.out.println("balance: " + current_balance);
						break;
					case 2:
						System.out.println("enter amount to deposit:");
						int deposit = sc.nextInt();
						current_balance += deposit;
						System.out.println("balance: " + current_balance);
						break;
					case 3:
						System.out.println("balance: " + current_balance);
						break;
					default:
						System.out.println("Enter valid option");
						break;
				}
			}
			else
				System.out.println("******WRONG PASSWORD******");

		}
			if(choice == 4)
		{
			System.out.println("Enter passcode");
			int password = sc.nextInt();
			double current_balance = 20000.83;
			if(password == Ashutosh_Ram)
			{
				System.out.println("1 for withdraw 2 for deposit 3 for balance check");
				System.out.println("******CHOICE ONE OPTION******");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
						System.out.println("Enter amount to withdraw:");
						int withdraw = sc.nextInt();
						current_balance -= withdraw;
						System.out.println("balance: " + current_balance);
						break;
					case 2:
						System.out.println("enter amount to deposit:");
						int deposit = sc.nextInt();
						current_balance += deposit;
						System.out.println("balance: " + current_balance);
						break;
					case 3:
						System.out.println("balance: " + current_balance);
						break;
					default:
						System.out.println("Enter valid option");
						break;
				}
			}
			else
				System.out.println("******WRONG PASSWORD******");

		}
		if(choice == 5)
		{
			System.out.println("Enter passcode");
			int password = sc.nextInt();
			double current_balance = 19854.49;
			if(password == Sudhriti_Biswas)
			{
				System.out.println("1 for withdraw 2 for deposit 3 for balance check");
				System.out.println("******CHOICE ONE OPTION******");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
						System.out.println("Enter amount to withdraw:");
						int withdraw = sc.nextInt();
						current_balance -= withdraw;
						System.out.println("balance: " + current_balance);
						break;
					case 2:
						System.out.println("enter amount to deposit:");
						int deposit = sc.nextInt();
						current_balance += deposit;
						System.out.println("balance: " + current_balance);
						break;
					case 3:
						System.out.println("balance: " + current_balance);
						break;
					default:
						System.out.println("Enter valid option");
						break;
				}
			}
			else
				System.out.println("******WRONG PASSWORD******");

		}
		if(choice == 6)
		{
			System.out.println("Enter passcode");
			int password = sc.nextInt();
			double current_balance = 50000.29;
			if(password == Namrata_Sarkar)
			{
				System.out.println("1 for withdraw 2 for deposit 3 for balance check");
				System.out.println("******CHOICE ONE OPTION******");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
						System.out.println("Enter amount to withdraw:");
						int withdraw = sc.nextInt();
						current_balance -= withdraw;
						System.out.println("balance: " + current_balance);
						break;
					case 2:
						System.out.println("enter amount to deposit:");
						int deposit = sc.nextInt();
						current_balance += deposit;
						System.out.println("balance: " + current_balance);
						break;
					case 3:
						System.out.println("balance: " + current_balance);
						break;
					default:
						System.out.println("Enter valid option");
						break;
				}
			}
			else
				System.out.println("******WRONG PASSWORD******");

		}
	}
}