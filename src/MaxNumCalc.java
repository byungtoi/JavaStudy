
public class MaxNumCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 85;
		int eng = 89;
		int math = 82;
		
		int max = 0;
		
		max = (kor > eng) ? ((kor > math) ? kor:math):((eng > math) ? eng:math);
		
		System.out.println("max = " + max);
		
		int tot = 0;
		for (int cnt = 1;cnt <= 100;cnt++ ) {
			tot += cnt;
		}
		System.out.println("tot (1 ~100) = " + tot);
		
		
		tot = 0;
		for (int cnt = 1;cnt <= 100;cnt++ ) {
			
			if	(cnt % 3 == 0)
				tot += cnt;
		}
		System.out.println("tot (1 ~100) 3의 배수 = " + tot);
		
		int wcnt = 0;
		tot = 0;
		while (wcnt <= 100) {
			wcnt++;
			if	(wcnt % 3 == 0)
				tot += wcnt;
		}
		System.out.println("tot (1 ~100) 3의 배수 = " + tot);
		
		
	}

}
