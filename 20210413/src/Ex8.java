
public class Ex8 {

	public static void main(String[] args) {
		// 3단~8단까지 반복. 4곱~7곱까지
		for(int dan = 3; dan<=8;dan++) {
			for(int gop = 4; gop<=7;gop++) {
				System.out.println(dan * gop);
			}
		}
		// start dan 과 end gop으로 수정하는 수업자료에 나와 있는데로 해보기
		int startdan = 5;
		int enddan = 8;
		int startgop = 4;
		int endgop = 7;
		for(int dan = startdan; dan <= enddan; dan++) {
			for(int gop = startgop; gop<= endgop; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop );
			}
		}
	}

}
