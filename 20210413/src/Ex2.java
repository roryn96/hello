
public class Ex2 {

	public static void main(String[] args) {
		//"Ȧ�� ��° �Դϴ�"
		int i ;
		for(i = 1; i<=9; i+=2) {
			System.out.println(i + "��° �Դϴ�.");
		}
		//continue
		//Ȧ���� ����Ͻÿ�. ¦���� ���
		for(i = 1;i <= 9; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + "��°�Դϴ�.");
		}
		System.out.println("======================");
		//" ¦�� ��° �Դϴ�"
		for ( i = 2; i <=10; i+=2) {
			System.out.println(i + "��° �Դϴ�.");
		}
		//continue
		for( i = 1; i <=10; i++) {
			if(i % 2 != 0) { // 'i % 2 == 1'�� ������ �ǹ� 
				continue;
			}
			System.out.println(i + "��° �Դϴ�.");
		}
		// continue ���� if���� �̿�
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "��° �Դϴ�.");
			}
		}

	}

}
