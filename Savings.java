
public class Savings extends Account
{
	private int min_balance;
	private int rate_of_interest;
	private int min_withdraw;

	public int getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(int min_balance) {
		this.min_balance = min_balance;
	}

	public int getRate_of_interest() {
		return rate_of_interest;
	}

	public void setRate_of_interest(int rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}

	public int getMin_withdraw() {
		return min_withdraw;
	}

	public void setMin_withdraw(int min_withdraw) {
		this.min_withdraw = min_withdraw;
	}

	@Override
	public String toString()
	{
		return  getAcc_no() + "\t" + getIfsc_no() + "\t" + getCust_name()  + "\t" + getBalance() + "\t" + getMin_balance() + "\t" + getRate_of_interest() + "\t" + getMin_withdraw();
	}














}	
