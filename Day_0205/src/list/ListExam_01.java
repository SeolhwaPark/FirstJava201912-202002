package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * index()메소드는 리스트 자료타입에서 사용할 수 있는 메소드이다.
 * 리스트에 있는 전체 리스트의 데이터 중 검색하길 원하는 데이터가 복수개 있을 경우
 * 첫번째 데이터만을 돌려준다. 
 * 리스트에 있는 복수개의 데이터에 대한 인덱스를 모두 검색하기 위한 프로그램을 작성하시오.
 * 
 * 예;
 * list = [89,84,90,77,95,90,65,100,90,84]
 * input = 90
 * 90의 인덱스는 2,5,8입니다.
 */
public class ListExam_01 {
	static List<Integer> list = new ArrayList<Integer>();
	static int index(int idx,int val) {
		for(int x=idx ; x<list.size(); x++) {
			if(list.get(x) == val) return x;
		}
		return -1;
	}

	public static void main(String[] args) {
		list.add(89);
		list.add(84);
		list.add(90);
		list.add(77);
		list.add(95);
		list.add(78);
		list.add(65);
		list.add(100);
		list.add(54);
		list.add(90);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("input :");
		int val = scn.nextInt();
		int index = 0;
		System.out.println(val + "의 인덱스는");
		while (index < list.size()) {
			index = index(index, val);
			if (index == -1)
				break;
			System.out.print(index + ",");
			index++;
		}
		System.out.println("입니다.");

	}
}
