package Student;

public abstract class Student { //추상클래스
	int bun;
	String name;
	int[] jum;
	int tot;
	double ave;
	
	public Student(int bun, String name, int[] jum) {
		this.bun = bun;
		this.name = name;
		this.jum = jum;
	}
	
	public void title() {
		System.out.print("번호\t이름\t총점\t평균");
	}
	
	abstract void account(); //총점 평균 소수점 둘째자리 를 계산후 출력하는 메소드
	abstract void scoreMax();	//점수 최대 최소를 구하여 출력
	abstract void scoreSelection(); // 선택정렬을 이용하여 점수 오름차순
	abstract void scoreBubble(); // 버블정렬을 이용하여 점수 내림차순

}
