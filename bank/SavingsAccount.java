package bank;

public class SavingsAccount extends Account
{

	public SavingsAccount(UserInformation u)
	{
		super(u);
		setMinBalance(500);
		setWithdrawalLimit(500,20000);
		setBalance(500);
	}
	SavingsAccount(String an, String pin, double balance, UserInformation u)
	{
		this(u);
		super.setAccountNo(an);
		super.setPIN(pin);
		super.setBalance(balance);
	}

	public double setMinBalance(double a)
	{
		minBalance=a;
		return minBalance;
	}
	public double setBalance(double a)
	{
		balance=a;
		return balance;
	}
	
	
	public void setWithdrawalLimit(double l, double h)
	{
		minWithdrawal=l;
		maxWithdrawal=h;
	}
	public int getAccountType()
	{
		return Account.SAVINGS_ACCOUNT;
	}


}
