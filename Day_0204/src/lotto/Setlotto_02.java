package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 * 로또 공 뽑아오기 구현
 */
public class Setlotto_02 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for(int x=1; x<46; x++) {
			set.add(new Integer(x));

		}
		System.out.print(set);
		System.out.println();
		
		List list = new ArrayList(set);
		Collections.shuffle(list); 
		
		for(int x=0; x<6; x++) {
			System.out.print(list.get(x) + "\t");
			
		}
		System.out.println();
	}

}
