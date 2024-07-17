
public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=5;i>=1;i--) {
			for (int j=1;j<=5 ;j++) {
					if (j<i)
						System.out.print(" ");
					else
						System.out.print("*");
			}
			System.out.println();
		}

		int	tcnt = 20;   // 전체 층수 입력
		int tscnt = 2 * tcnt - 1; // 한층의 별의 최대수(y축 갯수)
		
		int scnt = 0;	// 층별 별갯수
		int spnt = 0;	// 층별 시작포인트
		
		for (int i2=1;i2<=tcnt;i2++) {
			scnt = 1 + 2 * (i2-1);
			spnt = (tscnt - scnt) / 2 + 1;
			for (int j2=1;j2<=tscnt ;j2++) {
				if (j2>= spnt && j2< (spnt+scnt))
						System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
