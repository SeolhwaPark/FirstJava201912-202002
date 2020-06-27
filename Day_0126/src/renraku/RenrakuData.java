package renraku;

public class RenrakuData {
	String name; // 이름
	String sex; // 성별
	String bu; // 부서
	String kuni; // 국적
	
	RenrakuData(String name, String sex, String bu,String kuni){
		this.name = name;
		this.sex = sex;
		this.bu = bu;
		this.kuni = kuni;
	}

	void renrakuPrint() {
		System.out.println("*결과 :" + name + "," + sex + "," + bu + "," + kuni+"*");
	}
}