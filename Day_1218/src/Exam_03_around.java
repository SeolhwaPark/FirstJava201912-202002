import java.util.Scanner;

/*
 * ��ȣ, �̸�, ����, ����, ����, ������ Ű����� �Է�
 * ����, ���(�Ҽ����� �ι�° �ڸ����� �ݿø�)
 */
public class Exam_03_around {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȣ :"); //����� ���Ǽ��� ���� ����
		int bun = s.nextInt();
		System.out.print("�̸� :");
		String name= s.next();
		System.out.print("���� :");
		int kor = s.nextInt();
		System.out.print("���� :");
		int eng = s.nextInt();
		System.out.print("���� :");
		int mat = s.nextInt();
		int tot = kor+eng+mat;
		double ave = (double)tot/3.; 
		//87.256->87.3
		ave = ((int)(ave*10+0.5))/10.;
		//ave*10+0.5=873.06 (3�ڸ����ݿø��̸� *100+0.05)
		//876.06->873-> (int)�������ٰ� �ݿø��Ϸ��� /10.->87.3 (3�ڸ����̸� /100.)
		System.out.println("��ȣ :"+bun);
		System.out.println("�̸� :"+name);
		System.out.println("���� :"+tot);
		System.out.println("��� :"+ave);
		
	}

}
