package Student;

//출력

public class StudentHak extends Student{
	public StudentHak(int bun, String name, int[] jum) {
		super(bun, name, jum);
	}
	@Override
	void account() {//총점 평균 소수점 둘째자리 를 계산후 출력하는 메소드
		int sum = 0;
		
		for(int x = 0; x < jum.length; x++) {
			sum += jum[x];
		}
		ave = (double)sum/jum.length;
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + ((int)(ave*100))/100.);
	}
	@Override
	void scoreMax() {//점수 최대 최소를 구하여 출ㄹ력
		int max = jum[0];
		int min = jum[0];
		
		for(int x = 0; x < jum.length ; x++) {
			if(jum[x] > max) {
				max = jum[x];
			}else if(jum[x] < min){
				min = jum[x];
			}
		}
		System.out.println("MAX = " + max);
		System.out.println("MIN = " + min);
		
	}@Override
	void scoreBubble() {// 버블정렬을 이용하여 점수 내림차순
	
		for(int x=0; x<jum.length-1; x++) { 
			for(int y=0; y<jum.length-(x+1); y++) { 
				if(jum[y]<jum[y+1]) {
					int temp = jum[y];
					jum[y] = jum[y+1];
					jum[y+1] = temp;
				}
			}
		}
		System.out.print("BubbleSort : " );
		for(int x=0; x<jum.length;x++) {
			System.out.print(jum[x] + "\t");
		}
	}

	@Override
	void scoreSelection() {// 선택정렬을 이용하여 점수 오름차순
	for(int x=0; x<jum.length;x++) {
			System.out.print(jum[x] + "\t");
		}
		System.out.println();
		for(int x=0; x<jum.length-1; x++) {
			for(int y=x+1; y<jum.length; y++) {
				if(jum[x] > jum[y]) {
					int temp = jum[x];
					jum[x] = jum[y];
					jum[y] = temp;
				}
			}
		}
		System.out.print("SelectionSort : ");
		for(int x=0; x<jum.length;x++) {
			System.out.print(jum[x] + "\t");
		}
	}
}