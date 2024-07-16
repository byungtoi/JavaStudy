
public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte n1 = 5;
		byte n2 = 3;
		byte n3 = -1;
		int m = n1+n2+n3;
		
		byte r1 = (byte)(n1 & n2);
		byte r2 = (byte)(n1 | n2);
		byte r3 = (byte)(n1 ^ n2);
		byte r4 = (byte)(~n3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(n3);
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(m);
		

		int n01 = 5;
		int n02 = 3;
		int n03 = -1;
		
		byte r01 = (byte)(n01 & n02);
		byte r02 = (byte)(n01 | n02);
		byte r03 = (byte)(n01 ^ n02);
		byte r04 = (byte)(~n3);
		
		System.out.println(r01);
		System.out.println(r02);
		System.out.println(r03);
		System.out.println(r04);
		
		int n001 = 5;
		int n002 = 3;
		int n003 = -1;
		
		int r001 = (n01 & n02);
		int r002 = (n01 | n02);
		int r003 = (n01 ^ n02);
		int r004 = (~n3);
		
		System.out.println(r001);
		System.out.println(r002);
		System.out.println(r003);
		System.out.println(r004);
		System.out.println(r004);
		
		
	}

}
