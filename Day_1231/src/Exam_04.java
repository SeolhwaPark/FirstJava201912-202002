/*
 * �ݺ���
 * 1. while(���ǽ�){  } //{}�ȿ� ���� ���ȿ� �ݺ���
 * 2. do{ ~ }while(���ǽ�){  }
 * 3. for(���� = �ʱⰪ;���ǽ�;������){}
 * 	�ݺ��� �׸� �ΰ� ���� �� ��ü������ if���� �����
 */
public class Exam_04 {
	public static void main(String[] args) {
		int x = 0;
		while (true) { //���ѷ�����, ������ ������ ��ȣ �ȿ� ���� �� ����
			System.out.println("x = " + x);
			x++;
			if(x==10) break;
		}
		int y = 0;
		while (y<10) { //���� ���� ����
			y++;
			System.out.println("y = " + y);
			
		}
		int z = 0;
		do { //������ �����̶� �ϴ� �� ���� ������,�׽�Ʈ ����
			z++;
			System.out.println("z = " + z);
			
		} while (z<=10);
		
	}
}
