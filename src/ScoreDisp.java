
public class ScoreDisp {

	public static void main(String[] args) {
		int kor  = 90;
		int math = 77;
		int eng  = 90;
    	double avg = (kor + math + eng) / 3.0; 
    	
		System.out.println("=======================");
		System.out.println("== 2024년 2학기 시험점수 ==");
		System.out.println("=======================");
		System.out.println("국어: "+ kor);
		System.out.println("수학: "+ math);
		System.out.println("영어: "+ eng);
		System.out.println("=======================");
		System.out.println("총첨: "+(kor + math + eng));
		System.out.println("=======================");
		System.out.println("평균: "+ avg);
		System.out.println("=======================");
    	if (avg >= 90.0)
    		System.out.println("성적 : [수] 입니다");
    	else if (avg >= 80.0)
    		System.out.println("성적 : [우] 입니다");
    	else if (avg >= 70.0)
    		System.out.println("성적 : [미] 입니다");
    	else if (avg >= 60.0)
    		System.out.println("성적 : [양] 입니다");
    	else 
    		System.out.println("성적 : [가] 입니다");
		System.out.println("=======================");
    		
		
	}

	
}
