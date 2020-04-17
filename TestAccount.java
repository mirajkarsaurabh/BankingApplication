import java.util.Scanner;

public class TestAccount {
	static Scanner sc = new Scanner(System.in);
	static Account[] arr = new Account[3];
	static int i=0;
	static int count=0;
	public static void main(String[] args)
	{
		int ch=0;
		do
		{   System.out.println("Enter the type of account");
		System.out.println("1.Savings\n2.Current\n3.Loan\n");
		System.out.println("Enter your choice :");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: Account a = new Savings();
		arr=accept(a);
		break;

		case 2: Account c = new Current();
		arr=accept(c);
		break;

		case 3: Account l = new Loan();
		arr=accept(l);
		break;
		}
		}while(ch!=4);
		display(arr);
	}
	
	public static Account[] accept(Account a)
	{
		System.out.println("Enter Acc_no,Cust_name,Balance,IFSC code");
		a.setAcc_no(sc.nextInt());
		a.setCust_name(sc.next());
		a.setBalance(sc.nextInt());
		a.setIfsc_no(sc.next());

		if(a instanceof Savings)
		{
			System.out.println("Enter Min_Bal,Min_Withdrawal,Rate_of_Interest");
			((Savings)a).setMin_balance(sc.nextInt());
			((Savings)a).setMin_withdraw(sc.nextInt());
			((Savings)a).setRate_of_interest(sc.nextInt());
		}

		if(a instanceof Current)
		{
			System.out.println("Penalty_amt,Min_Bal,Company_name");
			((Current)a).setPenalty_amt(sc.nextInt());
			((Current)a).setMin_balance(sc.nextInt());
			((Current)a).setCompany_name(sc.next());
		}

		if(a instanceof Loan)
		{
			System.out.println("Loan_amt, EMI ,Tenure, Rate_of_Interest");
			((Loan)a).setLoan_amt(sc.nextInt());
			((Loan)a).setTenure(sc.nextInt());
			((Loan)a).setRate_of_interest(sc.nextInt());
		}
		arr[i]=a;
		i++;
		count++;
		return arr;
	}

	public static void display(Account[] arr)
	{
		for(int j=0; j<count;j++)
		{
			System.out.println(arr[j]);
		}
	}
}

//PRINTING ALL THE VALUES

//Account arr[]=accept();
//display(arr);

/*public static Account[] accept()
	{
		Account arr[]=new Account[5];
		syso
		arr[0]=new Savings(100,"Saurabh",200000,"ABC100Z" , 3000, 5, 100);
		arr[1]=new Current(101,"Saurabh",20000,"ABC100Z",50,1000,"MESCOE");
		arr[3]=new Loan(102,"Saurabh",20000,"ABC100Z",40000,2000,20,5);
		return arr;
	}*/

/*private static void display(Account[] arr) {
		// TODO Auto-generated method stub
		for(Account acc :arr){

			if(acc instanceof Savings)    //Type-casting
			{
				System.out.println("-----------SAVINGS ACCOUNT--------------------");
				Savings saving=(Savings)acc;
				System.out.println("Account-No :"+acc.getAcc_no());
				System.out.println("Customer-name :"+acc.getCust_name());
				System.out.println("IFSC code :"+acc.getIfsc_no());
				System.out.println("Account-balance :"+acc.getBalance());
				System.out.println("Minimun-balance :"+saving.getMin_balance());
				System.out.println("Rate of Interest :"+saving.getRate_of_interest());
				System.out.println("Minimun-withdrawal :"+saving.getMin_withdraw());
			}
			if(acc instanceof Current)    //Type-casting
			{
				System.out.println("-----------CURRENT ACCOUNT--------------------");
				Current current=(Current)acc;
				System.out.println("Account_no :"+current.getAcc_no());
				System.out.println("Customer-name :"+current.getCust_name());
				System.out.println("Penalty-amount :"+current.getPenalty_amt());
				System.out.println("Minimum-balance :"+current.getMin_balance());
				System.out.println("Company-name :"+current.getCompany_name());
			}
			if(acc instanceof Loan)  //Type-casting 
			{
				System.out.println("-----------LOAN ACCOUNT--------------------");
				Loan loan=(Loan)acc;
				System.out.println("Account_no :"+loan.getAcc_no());
				System.out.println("Customer-name :"+loan.getCust_name());
				System.out.println("Loan-amount :"+loan.getLoan_amt());
				System.out.println("EMI :"+loan.getEmi());
				System.out.println("Rate_of_Interest :"+loan.getRate_of_interest());
				System.out.println("Tenure of Loan(in years) :"+loan.getTenure());
			}
		}
	}
}
 */