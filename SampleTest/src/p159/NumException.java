package p159;
//문자열을 정수로 변환할때 발생하는 NumberFormatException을 처리하는 프로그램을 작성
public class NumException {
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);//3.141592를 정수로변환할때 NumberFormatException 예외 발생
				System.out.println("정수로 변환된 값은 " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}

}
