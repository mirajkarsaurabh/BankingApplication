
public class Loan extends Account{
	private int loan_amt;
	private  int emi;
	private int tenure;
	private int rate_of_interest;

	public int getLoan_amt() {
		return loan_amt;
	}

	public void setLoan_amt(int loan_amt) {
		this.loan_amt = loan_amt;
	}

	public int getEmi() {
		return emi;
	}

	public void setEmi(int emi) {
		this.emi = emi;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getRate_of_interest() {
		return rate_of_interest;
	}
	public void setRate_of_interest(int rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getAcc_no()+"\t"+getIfsc_no()+"\t"+getCust_name()+"\t"+getBalance()+"\t"+getLoan_amt()+"\t"+getEmi()+"\t"+getTenure()+"\t"+getRate_of_interest();
	}
}
