import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("BBBB");
		list.add("!!!!");
		list.add("DDDD");
		
		List list2 = list; //���簡 �ƴ϶� �ּҰ� �Ѿ. ������ ������ 
		list2.add("FFFF");
		
		for(String str : list) {  //Ȯ������
			System.out.println(str);
		}
		
		System.out.println("---------------------");
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		}
		
		System.out.println("---------------------");
		//��Ʈ������ �ݺ��� �̿�� ���Ϲ�
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) { //hasNext ���翩�� ���°�
			System.out.println(iter.next());//�����ϸ� ��������
		}
	}

}
