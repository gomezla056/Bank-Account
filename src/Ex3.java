package bankAccount;

/**
 * Ex3: a public class used for testing BankAccount class.
 */
public class Ex3 
{
	/**
	 * Creates a BankAccout and tests all of its methods.
	 * 
	 * @param args	no arguments taken in our method
	 */
	public static void main(String[] args)
	{
		// Testing formatTo's width parameter
		BankAccount myAccount = new BankAccount(123.50);
		System.out.println("Testing getBalance: " + myAccount.getBalance());
		System.out.printf("%s\n", myAccount);
		System.out.printf("%8s\n\n", myAccount);
		
		// Testing withdraw
		System.out.println("Testing getBalance: " + myAccount.getBalance());
		myAccount.withdraw(97.71);
		System.out.println("Withdrew $97.71. Balance is now: " + myAccount.getBalance());
		System.out.printf("%s\n", myAccount);
		System.out.printf("%8s\n\n", myAccount);

		// Testing deposit
		System.out.println("Testing getBalance: " + myAccount.getBalance());
		myAccount.deposit(74.33343245);
		System.out.println("Deposited $74.33343245. Balance is now: " + myAccount.getBalance());
		System.out.printf("%s\n", myAccount);
		System.out.printf("%14s\n\n", myAccount);
	}
}
