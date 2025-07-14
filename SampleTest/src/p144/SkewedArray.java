package p144;
/*그림과 같은 비정방형 배열을 만들어 값을 초기화하고 출력하라
 * ㅁㅁㅁ
 * ㅁㅁ
 * ㅁㅁㅁ
 * ㅁㅁ
 * */
public class SkewedArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for (int i=0; i<intArray.length; i++) // 행에 대한 반복
			for (int j=0; j<intArray[i].length; j++) // 열에 대한 반복
				intArray[i][j] = (i+1)*10 + j;
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}
	}

}
