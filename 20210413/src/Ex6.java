
public class Ex6 {
	public static void main(String[] args) {
		//4단출력
		int dan = 4;
		int gop;
		for(gop =1; gop<=9; gop++) {
			System.out.println(dan + "*"+ gop +"="+dan *gop);
		}
		//5단 출력
		dan = 5;
		for(gop =1; gop<=9; gop++) {
			System.out.println(dan + "*"+ gop +"="+dan *gop);
		}
		//6단 출력
		dan =6;
		for(gop =1; gop<=9; gop++) {
			System.out.println(dan + "*"+ gop +"="+dan *gop);
		}
		
		System.out.println("1번째입니다");
		System.out.println("2번째입니다");
		System.out.println("3번째입니다");
		System.out.println("4번째입니다");
		System.out.println("5번째입니다");
		for(int i = 1; i<=5; i++) {
			System.out.println(i + "번째입니다");
		}
		
		for(int i=4; i<=6; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j +"="+i*j);
			}
		}
		

	}

}
