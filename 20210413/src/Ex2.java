
public class Ex2 {

	public static void main(String[] args) {
		//"홀수 번째 입니다"
		int i ;
		for(i = 1; i<=9; i+=2) {
			System.out.println(i + "번째 입니다.");
		}
		//continue
		//홀수만 출력하시오. 짝수는 통과
		for(i = 1;i <= 9; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + "번째입니다.");
		}
		System.out.println("======================");
		//" 짝수 번째 입니다"
		for ( i = 2; i <=10; i+=2) {
			System.out.println(i + "번째 입니다.");
		}
		//continue
		for( i = 1; i <=10; i++) {
			if(i % 2 != 0) { // 'i % 2 == 1'도 동일한 의미 
				continue;
			}
			System.out.println(i + "번째 입니다.");
		}
		// continue 없이 if문만 이용
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "번째 입니다.");
			}
		}

	}

}
