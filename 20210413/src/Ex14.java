
public class Ex14 {

	public static void main(String[] args) {
		// 리터럴: 자연어, 한국어, 영어, 일본어, 숫자...
		// 리터럴 값을 저장하기 위한 자료형
		// 정수형 리터럴: 10,1,2,...
		//			정수 자료형: int, long
		// 실수형 리터럴: 0.5,178.5
		//			실수형 자료형: float, double
		// 논리형 리터럴: true, false
		//			논리형 자료형: boolean
		
		////////// 위 = "기본자료형" : 실제 값을 간직하고 있는 자료형
		/// stack영역 데이터가 저장
		// stack 영역에 있는 데이터는 데이터끼리의 비교가 가능하다.
		int i = 10;
		double d = 10.5;
		boolean b = true;
		int j = 10;
		if(i ==j) {
			System.out.println("같다.");
		}
		
		// 선언된 변수는 모두 stack 영역에 만들어진다.
		// 참조형 자료형: 실제값을 저장하고 있지 않다.
		// 주소를 참조하게 된다. => 주소 변수
		// 문자열 리터럴: "홍길동"
		//			문자열 자료형: String
		String str = "홍길동";
		String name1 = "호랑이";
		String name2 = "호랑이";
		///문자열 데이터는 heap 영역에 데이터 들어간다.
		///변수는 stack
		if(name1 == name2) { //주소 비교
			System.out.println("주소가 같다.");
		}
		// 참조형 자료형: 문자열 자료형
		//			    배열 자료형
		//			    열거 자료형 
		if(name1.equals(name2)) { //데이터 비교 (뒤에서 다시 다룰것)
			System.out.println("데이터가 같다.");
		}
		

	}

}
