package renraku;

public class RenrakuData {
	String name; // �̸�
	String sex; // ����
	String bu; // �μ�
	String kuni; // ����
	
	RenrakuData(String name, String sex, String bu,String kuni){
		this.name = name;
		this.sex = sex;
		this.bu = bu;
		this.kuni = kuni;
	}

	void renrakuPrint() {
		System.out.println("*��� :" + name + "," + sex + "," + bu + "," + kuni+"*");
	}
}