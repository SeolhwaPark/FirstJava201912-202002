/*
 * // \t ĭ ���� ����

 */
public class Exam_03 {

	public static void main(String[] args) {
		int bun = 10; //�Է��۾�
		char irum = 'k';
		int kor=95;
		int eng=88,mat=77;
		
		// ���� ���
		int tot = kor+eng+mat;
		// ���
		double ave=tot/3.;
		
		System.out.println("��ȣ :"+bun);
		System.out.println("�̸� :"+irum);
		System.out.println("���� :"+tot);
		System.out.println("��� :"+ave);

		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		System.out.print(bun+"\t"+irum+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t");		
	}

}
