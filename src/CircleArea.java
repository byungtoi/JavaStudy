
public class CircleArea {

	public static void main(String[] args) {
		// 반지름이 10인 원의 넓이 
		
				double ccle_half = 10.0;
				double ccle_area = 0.0;
				final double PI = 3.14;
				
				ccle_area = ccle_half * ccle_half * PI;
				
				System.out.println("=============================");
				System.out.println("반지름:"+ ccle_half + "  넓이:" + ccle_area);
				System.out.println("반지름 넓이가 100 미만입니까? "+ (ccle_area< 100.0));
				System.out.println("=============================");

	}

}
