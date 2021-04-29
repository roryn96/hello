
public class Ex9 {

	public static void main(String[] args) {
		// 2중 while
		// 2단
		int dan = 2;
		int gop =1;
		while(gop <=9) {
			System.out.println(dan + "*" + gop + "=" + dan * gop);
			gop++;
		}
		//3단
		dan = 3;
		gop = 1;
		while(gop <=9) {
			System.out.println(dan + "*" + gop + "=" + dan * gop);
			gop++;
		}
		//4단
		dan = 4;
		gop = 1;
		while(gop <=9) {
			System.out.println(dan + "*" + gop + "=" + dan * gop);
			gop++;
		}
		System.out.println("===============================");
		dan = 2;
		while(dan<=4) {
			gop = 1;
			while(gop <=9) {
				System.out.println(dan + "*" + gop + "=" + dan * gop);
				gop++; // 2~4단 부분에서 반복되는 것을 안쪽 괄호 안에 넣는다.
			}
			dan++;
		}

				

	}

}
