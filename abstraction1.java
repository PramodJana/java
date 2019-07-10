abstract class GeneralBank
{
	public abstract double getSavingInterestRate();

	public abstract double getFixedDepositRate();

}

class ICICIBank extends GeneralBank  
{
	int amount;
	ICICIBank(int amount)
	{
		this.amount= amount;
	}

	public double getSavingInterestRate()
	{
		return 0.04*amount;
	}

	public double getFixedDepositRate()

	{
		return 0.085*amount;
	}
}

class KotMBank extends GeneralBank  
{
	int amount;
	KotMBank(int amount)
	{
		this.amount= amount;
	}

	public double getSavingInterestRate()
	{
		return 0.06*amount;
	}

	public double getFixedDepositRate()

	{
		return 0.09*amount;
	}
}

public class abstraction1
{
	public static void main(String [] args)
	{
		ICICIBank i= new ICICIBank(100);
		System.out.println("Saving interest of ICICI bank "+i.getSavingInterestRate());
		System.out.println("Fixed deposit of ICICI bank "+i.getFixedDepositRate());	

		System.out.println("-------------------------------------------------------------------");
		KotMBank k= new KotMBank(100);
		System.out.println("Saving interest of ICICI bank "+k.getSavingInterestRate());
		System.out.println("Fixed deposit of ICICI bank "+k.getFixedDepositRate());	

		System.out.println("-------------------------------------------------------------------");
		GeneralBank g=new KotMBank(200);
		System.out.println("Saving interest of ICICI bank "+g.getSavingInterestRate());
		System.out.println("Fixed deposit of ICICI bank "+g.getFixedDepositRate());
	}
}






