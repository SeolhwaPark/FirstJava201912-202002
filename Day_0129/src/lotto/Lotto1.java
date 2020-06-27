package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lotto1 {

	public static void main(String[] args) {

		Lotto1 lotto = new Lotto1();
		Scanner sc = new Scanner(System.in);

		System.out.print("�ζǹ�ȣ ���� ���� �Է�: ");
		int gameCnt = sc.nextInt();

		for (int i = 1; i <= 6; i++) {
			System.out.println(i + "��° �ζǹ�ȣ: " + lotto.lottoNumbers());
		}
	}

	String lottoNumbers() {

		Set<Integer> set = new HashSet<Integer>();
		while( set.size() < 6){
			Double d = Math.random() * 45 + 1;
			set.add(d.intValue());	
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		return list.toString();
	}
}

