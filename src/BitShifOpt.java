
public class BitShifOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;
		
		num = 2; // 00000010
		System.out.println((byte)(num << 1));
		System.out.println((byte)(num << 2));
		System.out.println((byte)(num << 3));
		System.out.println((byte)(num << 4));

		
		num = 8; // 00000010
		System.out.println((byte)(num >> 1));
		System.out.println((byte)(num >> 2));
		System.out.println((byte)(num >> 3));
		System.out.println((byte)(num >> 4));
		
		System.out.println("[" + (byte)(num << 1) + "]");
		
	}

}
