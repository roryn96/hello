
public class Ex8 {

	public static void main(String[] args) {
		// 3��~8�ܱ��� �ݺ�. 4��~7������
		for(int dan = 3; dan<=8;dan++) {
			for(int gop = 4; gop<=7;gop++) {
				System.out.println(dan * gop);
			}
		}
		// start dan �� end gop���� �����ϴ� �����ڷῡ ���� �ִµ��� �غ���
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
