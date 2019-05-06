package bankAccount;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

/**
 * BankAccount is a class that implements Formattable and 
 */
public class BankAccount implements Formattable
{
	private double balance;
	
	/**
	 * Class constructor that defaults the balance to 0.
	 */
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	 * Class constructor that defaults the balance to either the
	 * user's input or defaults the balance to 0 if user input is
	 * negative.
	 * 
	 * @param n	Sets the balance to user's request, defaults to 0 if negative
	 */
	public BankAccount(double n)
	{
		if(n >= 0)
		{
			balance = n;
		}
		else
		{
			balance = 0;
		}
	}
	
	/**
	 * The balance is modified by adding value to 
	 * it if the user wishes to do. 
	 * If the user deposits a value of 0 or less, the
	 * user receives an error message instead.
	 * 
	 * @param n	Balance is added, print error if negative or 0.
	 */
	public void deposit(double n)
	{
		if(n > 0)
		{
			balance = balance + n;
		}
		else
		{
			System.out.println("Cannot deposit 0 or less.");
		}
	}
	
	/**
	 * The balance is modified by being subtracted after the user
	 * declares to take out money from their account. If the user
	 * requests more than what their current balance has, the
	 * user receives an error message instead.
	 * 
	 * @param n	Balance is subtracted, print error if negative.
	 */
	public void withdraw(double n)
	{
		if((balance - n) >= 0)
		{
			balance = balance - n;
		}
		else
		{
			System.out.println("Cannot withdraw more than what your current balance has.");
		}
	}
	
	/**
	 * Returns the balance that the account currently has.
	 * 
	 * @return	balance value
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Appends a formatted version of the account's current balance by
	 * padding it and using precision to print the desire numbers.
	 * The default formatted value will be to two decimal places to the right
	 * after the decimal point.
	 * If an error occurs while appending, a message prints to the user
	 * stating the string cannot be formatted.
	 * 
	 * @param formatter	not used
	 * @param flags		not used
	 * @param width		pads formatted integer if greater than length of it
	 * @param precision	slices off right side of formatted integer
	 */
	public void formatTo(Formatter formatter, int flags, int width, int precision)
	{
		Appendable a = formatter.out();
		String str = "$" + String.valueOf(balance);
		int strIndex = str.indexOf('.');
		String temp = str.substring(strIndex);
		if(temp.length() == 2)
		{
			str = str + "0";
		}
		else if(temp.length() > 3)
		{
			str = str.substring(0, strIndex + 3);
		}
		if(precision != -1 && str.length() >= precision)
		{
			str = str.substring(0, str.length() - precision);
		}
		if(width != -1 && (width - str.length()) > 0)
		{
			int stringLength = str.length();
			for(int i = 0; i < (width - stringLength); i++)
			{
				str = " " + str;
			}
		}
		try
		{
			a.append(str);
		}
		catch(IOException error)
		{
			System.out.println("Could not append string. Exiting now.");
			System.exit(0);	// similar to C's exit(0)
		}
	}
}
