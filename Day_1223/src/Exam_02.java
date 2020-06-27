/*
 * 
 * 
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		int[] arr= new int[5]; //arr[0] ~ arr[4]
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=arr[0] + arr[1] + arr[2];
		arr[4]=arr[3]/3;
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.print(arr[0]+"\t");
		System.out.print(arr[1]+"\t");
		System.out.print(arr[2]+"\t");
		System.out.print(arr[3]+"\t");
		System.out.print(arr[4]+"\n");
		System.out.println("");
		
		System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]+"\t"+arr[3]+"\t"+arr[4]+"\n");
		
		
		System.out.println(arr); // 주소
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		//ArrayIndexOutOfBoundsException 인덱스 5를 쓸 수 없음
		


	}

}
