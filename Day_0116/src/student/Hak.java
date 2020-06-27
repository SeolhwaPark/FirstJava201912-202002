package student;
/* 자바 빈 파일 만들기 POJO(가장 오래된 자바파일)
 * java beans : 데이터 전송용 - 
 * 
 접근을 위한 값을 저장하는 메소드와 출력용 메소드를 추가
 = 이클립스 > sourse -> Generate getters and setters
 
 Beans, VO, DTO

 */
public class Hak {
	private int number;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	private int rank;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
