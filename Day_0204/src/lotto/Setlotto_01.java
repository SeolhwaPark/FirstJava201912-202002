package lotto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setlotto_01 {
	public static void main(String[] ar) {
		Set set = new HashSet();
		for(int x =0; set.size()<6;x++) {
			int lotto = (int)(Math.random()*45)+1; //6���� ��󳻴� ��Ȱ
			set.add(lotto);
		}
		//while(set.size()<6) ���Ϲ�����
		while(set.size()<6) {
			Double d = Math.random()*45+1; //�����̶�� Ŭ������ �̿�
			set.add(d.intValue()); // ������������ intValue 
		}
		
		System.out.println(set);
		
		List list = new ArrayList(set);
		Collections.sort(list); //������ ���� �˻��� �ʿ䰡 ����
		System.out.println(list); //�󵵰˻�� �㿡 ���..
	}
}
