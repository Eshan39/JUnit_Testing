package bank;
import java.util.Random;

public abstract class Account
{
	public static final int SAVINGS_ACCOUNT=1;
	public static final int CURRENT_ACCOUNT=2;
	
	public static final int INSUFFICIENT_BALANCE=1;
	public static final int WITHDRAWAL_LIMIT_UNDER=2;
	public static final int WITHDRAWAL_LIMIT_OVER=3;
	
	public String accountNo;
	public String password;
	
	public double balance=0.0;
	public double minBalance;
	public double minWithdrawal;
	public double maxWithdrawal;
	
	public UserInformation user;
	
	public boolean isActivated;

	Account(UserInformation u)
	{
		accountNo=generateUniqueAccountNumber();
		password=generatePIN();
		user=u;
	}
	
	public abstract double setMinBalance(double a);
	public abstract void setWithdrawalLimit(double l, double h);
	public abstract int getAccountType();
	
	public double getBalance()
	{
		return balance;
	}
	public double setBalance(double b)
	{
		balance=b;
		return balance;
	}
	
	public String getAccuntNo()
	{
		return accountNo;
	}
	public String setAccountNo(String i)
	{
		accountNo=i;
		
		return accountNo;
	}
	public String getPIN()
	{
		return password;
	}
	public String setPIN(String s)
	{
		password=s;
		
		return password;
	}
	
	public boolean activateAccount()
	{ 
		if(isActivated=true){
		  return true;
		}
		else 
			return false;
	}
	
	public String generateUniqueAccountNumber()
	{
		Random r = new Random();
		Database db = Database.getInstance();
		String accountNum=String.valueOf(r.nextInt(10000000)+89999999);
		if(db.isAccountNumberUnique(accountNum))
		{
			return accountNum;
		}
		return generateUniqueAccountNumber();
		
	}
	
	public String generatePIN()
	{
		Random r = new Random();
		
		System.out.println(String.valueOf(r.nextInt(1000)+8999));
		return String.valueOf(r.nextInt(1000)+8999);
	}
	
	public boolean payBill(double amount)
	{
		if(balance-amount<minBalance)
			return false;
		
		balance-=amount;
		return true;	
	}
	
	public double depositMoney(double amount)
	{
		this.balance+=amount;
		return balance;
	}
	
	public boolean transferMoney(Account ac, double amount)
	{
		if(balance-amount<minBalance)
			return false;
		
		this.balance-=amount;
		ac.balance+=amount;
		return true;	
	}
	
	public int withdrawMoney(double amount)
	{
		if(amount<minWithdrawal)
			return WITHDRAWAL_LIMIT_UNDER;
		if(amount>maxWithdrawal)
			return WITHDRAWAL_LIMIT_OVER;
		if(balance-amount<minBalance)
			return INSUFFICIENT_BALANCE;
		
		balance-=amount;
		return 0;
	}
	
	public String toString()
	{
		return getAccountType()+"\n"+ balance + "\n" + user + "\n" + isActivated + "\n";
	}

	
}
