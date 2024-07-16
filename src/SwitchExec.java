
public class SwitchExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 2;
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("[" + month + "]월이군요~ 봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("[" + month + "]월이군요~ 여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("[" + month + "]월이군요~ 가을입니다");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println("[" + month + "]월이군요~ 겨울입니다");
			break;
		default:
			System.out.println("월 오류입니다");
			
		}

		if (month < 3) 	System.out.println("[" + month + "]월이군요~ 겨울입니다");
		else if (month < 6) 	System.out.println("[" + month + "]월이군요~ 봄입니다");
		else if (month < 9) 	System.out.println("[" + month + "]월이군요~ 여름입니다");
		else if (month < 12) 	System.out.println("[" + month + "]월이군요~ 가을입니다");
		else if (month < 13) 	System.out.println("[" + month + "]월이군요~ 겨울입니다");
		else System.out.println("월 오류입니다");
		
		for (int i=0;i<100;i++) {
			System.out.println("[" + i + "]번째군요~ ");
		}
		
		int tot = 0;
		for (int i=1;i<=100;i++) {
			tot += i;
			System.out.println("[" + i + "]번째  합은 = [" + tot + "]요~ ");
		}
		
		
		// 구구단

		int x = 0;
		int y = 0;
		int xy = 0;
		for (x=2;x<=9;x++) {
			System.out.println("================================");
			System.out.println(x + "단을 출력합니다");
			for (y=1;y<=9;y++) {
				xy = x * y;
				System.out.println(x + " X " + y + " = " + xy );
			}
		}
		
		int tot3b = 0;
		for (int m=1;m<=100;m+=1) {
			if (m % 3 > 0) {
				tot3b += m;
				System.out.println( " m = [" + m + "] - 합계 = [" + tot3b + "]");
			}
		}	

		
		
			
	}

}
