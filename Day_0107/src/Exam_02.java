import java.util.Stack;

/*
 * 
 */

public class Exam_02 {
	public static void main(String[] args) {
		int bun[] = new int [5]; //1�����迭 , ����� �Ҵ��� ���ÿ� ��
		//new int[][]2����,3����,4����....���
		String[] name = new String[5];
		bun[0]= 1 ;
		bun[1]= 10 ;
		bun[2]= 100 ;
		bun[3]= 1000 ;
		bun[4]= 10000 ;
		name[0] = "���ڹ�";
		name[1] = "ȫ�浿";
		name[2] = "c/c++";
		name[3] = "���̽�";
		name[4] = "������";
			for(int x=0; x<5; x++) {//5������
				System.out.println(bun[x] + " : " + name[x]); //�ݺ��ؼ� ��½�Ŵ
			}
	}

}