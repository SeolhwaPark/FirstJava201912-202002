import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * key return type = set
 */
public class Exam_14 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 100); // ����ڽ�.. �ڵ����� ��ü��ȯ ��Ŵ
		// map.put("���ڹ�", new Integer(100)); //����ڽ�
		map.put("���ڹ�", new Integer(100));
		map.put("ȫ�浿", new Integer(95));
		map.put("���ڹ�", new Integer(88));
		map.put("ȫ�ڹ�", new Integer(78));
		map.put("��浿", new Integer(90));

		// �л���� ���
		Set set = map.keySet();
		System.out.println("�л� :" + set);

		// ����(����) ����
		Collection value = map.values();
		System.out.println("�л� :" + value);

		// ���� �հ�
		Iterator iter = value.iterator();
		int tot = 0;
		while (iter.hasNext()) {
			Integer a = (Integer) iter.next();
			tot += a.intValue();
		}
		System.out.println("sum =" + tot);

	}

}
