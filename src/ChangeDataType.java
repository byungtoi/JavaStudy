
public class ChangeDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		// 변수 num1에 저장된 값이 1과 100사이의 수인가?
		result = (num1 > 1) && (num1 < 100);
		System.out.println("num1이 1과 100사이의 수인가? : " + result);
	
		// 변수 num2에 저장된 값이 2 또는 3의 배수인가?
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("num2에 저장된 값이 2 또는 3의 배수인가? : " + result);
		
		// 변수 num1이 0인가?
		result = !(num1 != 0);
		System.out.println("num1이 0인가? : " + result);
		
		int num = 5;
		System.out.println((num++));
		
		
		
	}

}
