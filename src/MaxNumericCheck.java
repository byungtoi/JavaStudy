
public class MaxNumericCheck {

	public static void main(String[] args) {

		int int_amt1  = 2100000000;
		int int_amt2  = 2100000000;
		int int_tot_amt = int_amt1 + int_amt2;
		long long_tot_amt1 = int_amt1 + int_amt2;
		
		long long_amt1  = 2100000000;
		long long_amt2  = 2100000000;
		long long_tot_amt2 = long_amt1 + long_amt2;
		

		int int_amt3  = 2100000000;
		long long_amt3  = 2100000000;
		long long_tot_amt3 = int_amt3 + long_amt3;
		
		System.out.println("=======================");
		System.out.println("int_amt1: "+	int_amt1);
		System.out.println("int_amt2: "+	int_amt2);
		System.out.println("int_tot_amt: "+	int_tot_amt);
		System.out.println("long_tot_amt1: "+	long_tot_amt1);
		System.out.println("=======================");
		System.out.println("long_amt1: "+	long_amt1);
		System.out.println("long_amt2: "+	long_amt2);
		System.out.println("long_tot_amt2: "+	long_tot_amt2);
		System.out.println("=======================");
		System.out.println("int_amt3: "+	int_amt3);
		System.out.println("long_amt3: "+	long_amt3);
		System.out.println("long_tot_amt3: "+	long_tot_amt3);
		System.out.println("=======================");

	}
	

}
