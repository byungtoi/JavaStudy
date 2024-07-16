
public class NineNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
