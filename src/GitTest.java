
public class GitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// git test
		int cnt = 0;
		for (int i=1;i<=1000;i++) {
			if ((i % 7 == 0) && (i % 11 == 0)) {
				System.out.println("[" + i + "]입니다");
				cnt++;
				if (cnt > 4) break;
			}
		}

		System.out.println("=======================");
		
		// Hello World 1000번 찍기
		for (int cnt2 = 1;cnt2 <= 1000;cnt2++) {
			System.out.println("[" + cnt2 + "] - Hello World ");
		}
		
	}
	
	
}
