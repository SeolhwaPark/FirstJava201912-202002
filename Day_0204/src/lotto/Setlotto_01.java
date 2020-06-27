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
			int lotto = (int)(Math.random()*45)+1; //6개를 골라내는 역활
			set.add(lotto);
		}
		//while(set.size()<6) 와일문버젼
		while(set.size()<6) {
			Double d = Math.random()*45+1; //더블이라는 클래스를 이용
			set.add(d.intValue()); // 정수값만들어가는 intValue 
		}
		
		System.out.println(set);
		
		List list = new ArrayList(set);
		Collections.sort(list); //동일한 값을 검사할 필요가 없음
		System.out.println(list); //빈도검사는 담에 배움..
	}
}
