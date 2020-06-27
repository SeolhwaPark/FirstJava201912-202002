package treeMap;
import java.util.*;
/*
 * TreeMap
 * �˻����,�ڵ����İ���
 * 
 *  entry.getKey() Ű
 *  entry.getValue() ��
 * lowerEntry �Ʒ�
 * higherEntry ��
 * firstEntry ���� ���� ��
 * headEntry ~���� ������ 
 * tailEntry ~���� ū��
 * floorEntry ���ų� �ٷ� �Ʒ�
 * ceilingEntry ���ų� �ٷ���
 * pollFirstEntry ���� ���ڼ����� �ҷ����鼭 ����
 * pollLastEntry ū ���ڼ����� �ҷ����鼭 ����
 */
public class Exam_03 {
	public static void main(String[] args) {
		TreeMap<Integer,String> score = new TreeMap<Integer,String>();
		score.put(new Integer(87), "ȫ�浿");
		score.put(new Integer(90), "���ڹ�");
		score.put(new Integer(55), "ȫ����");
		score.put(new Integer(78), "��浿");
		score.put(new Integer(69), "ȫ�ڹ�");
		score.put(new Integer(40), "�谶��");
		
		System.out.println(score);
		System.out.println(score.get(87)); // 87�� �ش�Ǵ� ���ڿ��� ����
		
		//Entry
		Map.Entry<Integer, String> entry = null; //��ü����**********
		
		entry = score.firstEntry(); //����������
		System.out.println("���� ���� ���� :" + entry.getKey() + "-" + entry.getValue());
		//������ ���ڿ��� ���ÿ� ���
		
		entry = score.lastEntry();
		System.out.println("���� ���� ���� :" + entry.getKey() + "-" + entry.getValue());
		//������ ���ڿ��� ���ÿ� ���
		
		entry = score.lowerEntry(85);
		System.out.println("85�� �Ʒ��� ���� :" + entry.getKey() + "-" + entry.getValue());
		//������ ���ڿ��� ���ÿ� ���

		entry = score.higherEntry(75);
		System.out.println("75�� ���� ���� :" + entry.getKey() + "-" + entry.getValue());
		//������ ���ڿ��� ���ÿ� ���

		entry = score.floorEntry(85);
		System.out.println("85���̰ų� �ٷ� �Ʒ��� ���� :" + entry.getKey() + "-" + entry.getValue());
		//������ ���ڿ��� ���ÿ� ���

		entry = score.ceilingEntry(75);
		System.out.println("75���̰ų� �ٷ� ���� ���� :" + entry.getKey() + "-" + entry.getValue());
		//������ ���ڿ��� ���ÿ� ���
		
		while(!score.isEmpty()) {
			entry = score.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "���� ��ü :" + score.size());
		}
		
	}
}
