
public class FunctionCall {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int tt = 0;
		//tt = printHello(5,8);
		
		printStart(4);
	}

	public static void printStart(int cnt) {
		for (int i=1;i<=cnt;i++) {
			for (int j=1;j<=cnt ;j++) {
					if (j<=i)
						System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static int printHello(int cnt,int ii) {
		for (int i=1;i<=cnt;i++) {
			System.out.println("Hello World - " + ii);
		}
		int jj = 5;
		return jj;
	}
	
	
}
