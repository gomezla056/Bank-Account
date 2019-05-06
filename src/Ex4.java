package bankAccount;

/**
 * Ex4: a public class used for testing BankAccount class.
 */
public class Ex4 
{
	/**
	 * Creates a BankAccout and tests all of its methods.
	 * 
	 * @param args	no arguments taken in our method
	 */
	public static void main(String[] args)
	{	
		// Testing formatTo's width and precision parameter
		BankAccount myAccount = new BankAccount(123.50);
		System.out.println("Testing getBalance: " + myAccount.getBalance());
		System.out.printf("%s\n", myAccount);
		System.out.printf("%15.1s\n", myAccount);
		System.out.printf("%15.2s\n", myAccount);
		System.out.printf("%15.3s\n", myAccount);
		System.out.printf("%15.4s\n", myAccount);
		System.out.printf("%15.5s\n\n", myAccount);

		// Testing withdraw
		System.out.println("Testing getBalance: " + myAccount.getBalance());
		myAccount.withdraw(97.71);
		System.out.println("Withdrew $97.71. Balance is now: " + myAccount.getBalance());
		System.out.printf("%s\n", myAccount);
		System.out.printf("%5.1s\n", myAccount);
		System.out.printf("%5.2s\n", myAccount);
		System.out.printf("%5.3s\n", myAccount);
		System.out.printf("%5.4s\n", myAccount);
		System.out.printf("%5.5s\n\n", myAccount);

		// Testing deposit
		System.out.println("Testing getBalance: " + myAccount.getBalance());
		myAccount.deposit(74.33343245);
		System.out.println("Deposited $74.33343245. Balance is now: " + myAccount.getBalance());
		System.out.printf("%s\n", myAccount);
		System.out.printf("%10.1s\n", myAccount);
		System.out.printf("%10.2s\n", myAccount);
		System.out.printf("%10.3s\n", myAccount);
		System.out.printf("%10.4s\n", myAccount);
		System.out.printf("%10.5s\n\n", myAccount);
	}
}
