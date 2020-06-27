/*
 * 오름차순 ㅈ정렬ㄹ
 */
public class Exam_07 {
	public static void main(String[] args) {
		int array[] = {90,66,88,78,56,86,93,24,56,67};
		System.out.print("Source Data : ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ "\t");
		}
		System.out.println();
		System.out.print("ASsort Data : ");
		for(int i=0; i<array.length-1; i++) { // -1 -> 작은 숫자까지 인덱스
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ "\t");
		}
					
	}

}
