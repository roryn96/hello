
public class Ex5 {
	public static void main(String[]args) {
		System.out.println("1번 찍었습니다");
		System.out.println("2번 찍었습니다");
		System.out.println("3번 찍었습니다");
		System.out.println("4번 찍었습니다");
		System.out.println("5번 찍었습니다");
		System.out.println("6번 찍었습니다");
		System.out.println("7번 찍었습니다");
		System.out.println("8번 찍었습니다");
		System.out.println("9번 찍었습니다");
		System.out.println("10번 찍었습니다");
		System.out.println("나무가 넘어갑니다");
		System.out.println("==========================");
		
		int i = 1;
		while(i<=10) {
			System.out.println(i +"번 찍었습니다");
			if(i == 10) { System.out.println("나무가 넘어갑니다");
			} i++;
		}
		
		System.out.println("============================");
		//1~8번째 입니다.
		i = 1;
		while(i<=8) {
			System.out.println(i + "번째입니다");
			i++;
		}
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println("1~10의 합" + sum);
		System.out.println("=========================");
		i = 1;
		sum = 0;
		while(i<=10) {
			sum = sum +i; i++;
		}
		System.out.println("1~10의 합" + sum);
		System.out.println("=========================");
		i = 1;
		sum = 0;
		int end = 10;
		while( i <= end) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~10의 합" + sum);
		System.out.println("=========================");
		
		System.out.println(" 3 * 1 = 3");
		System.out.println(" 3 * 2 = 6");
		System.out.println(" 3 * 3 = 9");
		System.out.println(" 3 * 4 = 12");
		System.out.println(" 3 * 5 = 15");
		System.out.println(" 3 * 6 = 18");
		System.out.println(" 3 * 7 = 21");
		System.out.println(" 3 * 8 = 24");
		System.out.println(" 3 * 9 = 27");
		System.out.println("=========================");
		
		i = 1;
		while(i<=9) {
			System.out.println("3 * " + i + " = " + i * 3);
			i++;
		}
		
		System.out.println("=========================");
		//3의 곱. 홀수만
		i = 1;
		while(i<=9) {
			if(i%2==0) { continue;} 
			System.out.println(" 3 * " + i + " = " + i * 3);
			i++;
		}
		System.out.println("=========================");
		//100부터 1000까지의 합을 구하시오
		i = 100;
		end = 1000;
		sum = 0;
		while(i<=end) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
	
		
		
		
	}

}
