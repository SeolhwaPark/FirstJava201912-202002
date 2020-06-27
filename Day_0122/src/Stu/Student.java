package Stu;
/*
 *  입력예시
 * 입력 : 5,홍길동,90,90,80
 * 
 * 처리조건
 * 학생인원은 최대 10명
 * 입력자료는 번호가 무작위로 입력됨
 * 입력 항목 유효성 검사를 수행한다
 *  번호는 1~10 입력오류처리는 번호 오류입니다. 다시 입력받아야함
 *  이름은 1~10자이내
 *  각 점수는 0~100사이의 정수 이어야 한다.
 *  출력시 번호를 기준으로 오름차순출력
 *  
public String toString() { 
		return name + "\t " + number + "\t" + bangou;
 */
public class Student {
	int bun, kor, eng, mat, sum, suk=1;
	String name; //이름에 숫자들어가도 됨
	double ave;
	
	Student() {}
	
	Student(String bun, String name, String kor, String eng, String mat){
		this.bun = Integer.parseInt(bun);
		this.name = name;
		this.kor = Integer.parseInt(kor);
		this.eng = Integer.parseInt(eng);
		this.mat = Integer.parseInt(mat);
	}
	
	public String toString() { 
		return bun + "\t" + name +"\t" + kor +"\t"+ eng + "\t"+ mat;
	}
}
