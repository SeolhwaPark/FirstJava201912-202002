/*
 * 배열에 저장된 data 중에서  가장 큰 값과 가장 작은 값 찾기
 */
public class Exam_06 {
	public static void main(String[] args) {
		int array[] = {90,77,56,78,69,56,95,88,56,93,16,89,67,77}; //임의데이터
		System.out.println("array data list");
		for(int i=0; i<array.length; i++) {
			if(i%7==0) {
				System.out.print("\n");
			} 
			System.out.print(array[i] + "\t");
		}
		//최대 최소 찾기
		int max = array[0]; //최대
		int min = array[0]; //최소
		
		for(int i=1; i<array.length; i++) {
			if(max < array[i]) {
				max = array [i];
			}
			if(min > array[i]) {
				min = array [i];
			}
		}
			System.out.print("\n max = " + max);
			System.out.print("\n min = " + min);

	}

}
