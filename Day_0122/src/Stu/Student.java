package Stu;
/*
 *  �Է¿���
 * �Է� : 5,ȫ�浿,90,90,80
 * 
 * ó������
 * �л��ο��� �ִ� 10��
 * �Է��ڷ�� ��ȣ�� �������� �Էµ�
 * �Է� �׸� ��ȿ�� �˻縦 �����Ѵ�
 *  ��ȣ�� 1~10 �Է¿���ó���� ��ȣ �����Դϴ�. �ٽ� �Է¹޾ƾ���
 *  �̸��� 1~10���̳�
 *  �� ������ 0~100������ ���� �̾�� �Ѵ�.
 *  ��½� ��ȣ�� �������� �����������
 *  
public String toString() { 
		return name + "\t " + number + "\t" + bangou;
 */
public class Student {
	int bun, kor, eng, mat, sum, suk=1;
	String name; //�̸��� ���ڵ��� ��
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
