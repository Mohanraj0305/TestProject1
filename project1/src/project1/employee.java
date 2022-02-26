
class emp{
	long empid=345;
	int empsalary=10000;
	float empTax=9.5f;
	int empdaysofwork=24;
	void calculatePF()
	{
		float pfr=10.5f;
		System.out.print("pf rate"+pfr);
	}
}

public class employee{
	public static void main(String[] args)
	{
		emp e=new emp();
		e.calculatePF();
	}
}