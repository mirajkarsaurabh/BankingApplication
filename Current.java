
public class Current extends Account{
	private int penalty_amt;
	private int min_balance;
	private String company_name;

	public int getPenalty_amt() {
		return penalty_amt;
	}

	public void setPenalty_amt(int penalty_amt) {
		this.penalty_amt = penalty_amt;
	}

	public int getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(int min_balance) {
		this.min_balance = min_balance;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	@Override
	public String toString()
	{
		return getAcc_no()+"\t"+getCust_name()+"\t"+getBalance()+"\t"+getIfsc_no()+"\t"+getPenalty_amt()+"\t"+getMin_balance()+"\t"+getCompany_name();
	}



}
