import java.util.List;
import java.util.Vector;

/*
 * Vector
 * ��Ƽ������ȯ�濡�� ����ϸ�,����ȭ�Ǹ� �ӵ��� ������
 * 
 * capacity ���� �����ϰ� �ִ� ���� Ȯ���ϴ� ����
 */
public class Exam_04 {
	public static void main(String[] args) {
		//List list = new Vector();
 
		Vector vc = new Vector();
		//Vector<vector> �������� ������

		//System.out.println(vc.size()); //������Ʈ�� ���� 
		//System.out.println(vc.capacity()); 
		//�������� ������ ũ��, �⺻ 10���� ��������� �����ϰ�, �ڵ����� ������ Ȯ����
		
		vc.add("AAAA");
		vc.add(0,"BBBB");
		//�ε������� �ָ� �����ͼ����� �з����� ���Ի������� �׸�ŭ ó���ð��� �ʾ���		
		vc.add("CCCC");
		
		//****LinkedList�� ���Ի����� ���� �Ͼ ���� ������
		
		for(int x = 0; x<vc.size();x++) { 
			System.out.println(vc.get(x));
		}
	}
}
