import java.util.List;
import java.util.ArrayList;

/*
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		//���ڿ��� ���� ��̸���Ʈ
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Program");
		// ������Ʈ�� ���������� ������Ʈ�� Ÿ������ ��ȯ������� �ϴµ�
		//�̹� ��ȯ������  ���� ��ȯ���� �ʾƵ� ������ Ÿ���� �������� �װ� 
		String str =list.get(0); 
		
		//�������� ������ �����ϴϱ�
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		} //���������� ����� ����
		
		boolean bool = list.contains("c++");
		System.out.println(bool);
		int index = list.indexOf("C++"); // C++�̸��°�� �ִ��� Ȯ���ϴ� ���
		System.out.println(index); 
		list.set(0,"Java"); // ȫ�浿�� �ڹٷ� �ٲٴ� ���
		System.out.println(list.get(0));
		
	}

}
