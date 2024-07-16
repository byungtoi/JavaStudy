
public class PagerMoneyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt_50000 = 0;
		int cnt_10000 = 0;
		int cnt_5000 = 0;
		int cnt_1000 = 0;
		int cnt_500 = 0;
		int cnt_100 = 0;
		
		int	tot_money = 126731;
		int chg_money = 0;
		int jan_money = tot_money;
		
		// 1차 - 5만원권 구하기
		cnt_50000 = jan_money / 50000;
		chg_money = (cnt_50000 * 50000);
		jan_money = jan_money - chg_money;
		System.out.println("5만원권 처리후 잔액 = [" + jan_money + "]원");
		
		// 2차 - 1만원권 구하기
		cnt_10000 = jan_money / 10000;
		chg_money = (cnt_10000 * 10000);
		jan_money = jan_money - chg_money;
		System.out.println("1만원권 처리후 잔액 = [" + jan_money + "]원");

		// 3차 - 5천원권 구하기
		cnt_5000 = jan_money / 5000;
		chg_money = (cnt_5000 * 5000);
		jan_money = jan_money - chg_money;
		System.out.println("5천원권 처리후 잔액 = [" + jan_money + "]원");

		// 4차 - 1천원권 구하기
		cnt_1000 = jan_money / 1000;
		chg_money = (cnt_1000 * 1000);
		jan_money = jan_money - chg_money;
		System.out.println("1천원권 처리후 잔액 = [" + jan_money + "]원");

		// 5차 - 5백원권 구하기
		cnt_500 = jan_money / 500;
		chg_money = (cnt_500 * 500);
		jan_money = jan_money - chg_money;
		System.out.println("5백원권 처리후 잔액 = [" + jan_money + "]원");

		// 6차 - 1백원권 구하기
		cnt_100 = jan_money / 100;
		chg_money = (cnt_100 * 100);
		jan_money = jan_money - chg_money;
		System.out.println("1백원권 처리후 잔액 = [" + jan_money + "]원");
		
		
		System.out.println("===========================================");
		System.out.println(" 5만원권 == [" + cnt_50000 + "]매  [" +  cnt_50000 * 50000 + "]원");
		System.out.println(" 1만원권 == [" + cnt_10000 + "]매  [" +  cnt_10000 * 10000 + "]원");
		System.out.println(" 5천원권 == [" + cnt_5000 + "]매  [" +  cnt_5000 * 5000 + "]원");
		System.out.println(" 1천원권 == [" + cnt_1000 + "]매  [" +  cnt_1000 * 1000 + "]원");
		System.out.println(" 5백원권 == [" + cnt_500 + "]매  [" +  cnt_500 * 500 + "]원");
		System.out.println("  벡원권 == [" + cnt_100 + "]매  [" +  cnt_100 * 100 + "]원");
		System.out.println("===========================================");
		
		// 자투리금액 DISPLAY
		if (jan_money != 0) {
			System.out.println("화폐매수 처리후 잔액이 남았습니다. 잔액 = [" + jan_money + "]원");
		}
		
		
	}

}
