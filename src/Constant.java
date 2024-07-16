
public class Constant {

	public static void main(String[] args) {

		// 반지름이 10인 원의 넓이 
		
		double ccle_half = 10.0;
		double ccle_area = 0.0;
		final double PI = 3.14159;
		
		ccle_area = ccle_half * PI * PI;
		
		System.out.println("===========================");
		System.out.println("반지름:"+ ccle_half + "  넓이:" + ccle_area);
		System.out.println("===========================");
		
		// 가로 12.5  세로 13.1
		double width = 10;
		double height = 10;
		double RecatangleArea = 0.0;
		double bool_p = 20;
		
		RecatangleArea = width * height / 2;
		
		System.out.println("===========================");
		System.out.println("가로 :" + width);
		System.out.println("세로 :" + height);
		System.out.println("넓이 :" + RecatangleArea);
		System.out.println("===========================");
		System.out.println("넓이가 20보다 큽니까?");
		System.out.println(RecatangleArea > bool_p);
		System.out.println("===========================");
		
		
				

		
	}

}
