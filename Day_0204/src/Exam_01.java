import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List -> ArrayList �̱۽��������� �迭����, Vector��Ƽ���������� �迭����, LinkedList
 * ������ �ߺ��� ����, �������� ����.
 * 
 * LinkedList
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		List list = new ArrayList(); //����Ʈ ��ü�� ����. ����Ʈ������ ����
		List list2 = new LinkedList(); //����Ʈ ��ü�� ����. �굵 ����Ʈ������ ����
		
		list.add("123"); //�����߰�, ���ʴ�� ��, �����ֱ� ����, ���Ի����� ����
		list2.add("AAA"); // �յڿ� �ּҰ� ������, ���Ի����� ����
	}
}
