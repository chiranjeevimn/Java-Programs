import java.util.Scanner;

public class Bank_admin_menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int termination = 0;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];

        while (termination != -1) {
            System.out.println("Bank admin menu");
            System.out.println("Please enter the menu option");
            System.out.println("(1): Add customer to bank");
            System.out.println("(2): Change customer name");
            System.out.println("(3): Check Account Balance");
            System.out.println("(4): Modify account balance");
            System.out.println("(5): Summary of all accounts");
            System.out.println("(-1): Quit");

            int userInput = input.nextInt();

            if (userInput == 1) 
              {
                System.out.println("Bank add customer menu");
                System.out.print("Please enter an account balance: ");
                double balance = input.nextDouble();
                accountBalances[size] = balance;

                System.out.print("Please enter the account holder name: ");
                input.nextLine();
                String name = input.nextLine();
                accountNames[size] = name;

                System.out.println("Customer ID is: " + size);
                size = size + 1;
               }
 
 		else if (userInput == 2) 
		{
                System.out.println("Bank change name menu");
                System.out.print("Please enter a customer ID to change their name: ");
                int index = input.nextInt();

                System.out.print("What is the customer's new name? ");
                input.nextLine();
                String newName = input.nextLine();

                accountNames[index] = newName;
		}

		 else if (userInput == 3)
		{
                System.out.println("Bank check balance menu");
                System.out.print("Please enter a customer ID to check their balance: ");
                int index = input.nextInt();

                System.out.println("Account Balance: $" + accountBalances[index]);
		}

		else if (userInput == 4) 
		{
                System.out.println("Bank modify balance menu");
                System.out.print("Please enter a customer ID to modify their balance: ");
                int index = input.nextInt();

                System.out.print("What is the customer's new account balance? ");
                double newBalance = input.nextDouble();
                accountBalances[index] = newBalance;
		} 
		else if (userInput == 5) 
		{
                System.out.println("Bank all customer summary menu");
                double total = 0;
                for (int i = 0; i < size; i++) 
			{
                    	total = total + accountBalances[i];
                   	System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their account");
                	}
                System.out.println("In total, there is $" + total + " in the bank");
		}
		else if (userInput == -1) 
		{
                termination = -1;
		}
		else 
		{
                System.out.println("Error: Invalid input entered");
            }
        }
        input.close();
    }
}
