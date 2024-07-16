
public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 10;
		int eng = 10;
		int math = 92;
		
		double avr = (kor + eng + math) / 3;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("평균 : " + avr);
		if (avr >= 90.0)
			System.out.println("성적 : 수입니다");
		else if (avr >= 80.0)
			System.out.println("성적 : 우입니다");
		else if (avr >= 70.0)
			System.out.println("성적 : 미입니다");
		else if (avr >= 60.0)
			System.out.println("성적 : 양입니다");
		else 
			System.out.println("성적 : 가입니다");
			
		int num1 = 5;
		int num2 = 7;
		int num3 = 1;
	
		// 최대값구하기
		if (num1 > num2) 
			if (num1 > num3) 
				System.out.println("최대값 : " + num1);
			else 
				System.out.println("최대값 : " + num3);
		
		else if (num2 > num3)
			System.out.println("최대값 : " + num2);
		else
			System.out.println("최대값 : " + num3);
			
			
		int max = 0;
		
		if (num1 > num2 && num1 > num3)
			max = num1;
		else
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		System.out.println("최대값 : " + max);
				
		// 중간값 구하기
		int mid = 0;
		if (((num2 > num1) && (num2 < num3 )) || ((num2 > num3) && (num2 < num1 )))
			mid = num2;
		else if (((num3 > num1) && (num3 < num2 )) || ((num3 > num2) && (num3 < num1)))
			mid = num3;
		else
			mid = num1;
		System.out.println("중간값 : " + mid);
			
	}

}
