
public class MaxScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 95;
		int eng = 91;
		int math = 92;
		int max = 0;
		
		// 최대값구하기
		if (kor > eng) 
			if (kor > math) 
				System.out.println("최대값 : " + kor);
			else 
				System.out.println("최대값 : " + math);
		else if (eng > math)
			System.out.println("최대값 : " + eng);
		else
			System.out.println("최대값 : " + math);
		
		max = (kor > eng) ? (kor > math ? kor:math) : (eng > math ? eng:math);
		System.out.println("최대값 : " + max);
		

			
	}

}
