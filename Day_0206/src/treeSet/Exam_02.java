package treeSet;

import java.util.TreeSet;
/*
 * TreeSet 
 * set.lower 아래
 * set.higher 위
 * set.first 가장 작은 값
 * set.headSet ~보다 작은값 
 * set.tailSet ~보다 큰값
 * set.floor 같거나 바로 아래
 * set.ceiling 같거나 바로위
 * set.pollFirst 작은 숫자순으로 불러오면서 삭제
 * set.pollLast 큰 숫자순으로 불러오면서 삭제
 */
public class Exam_02 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80,95,70,44,56,10,100,59};
		
		for(int x=0; x<score.length; x++) {
			set.add(score[x]);
		}
		
		System.out.println("50보다 작은 값 :" + set.headSet(50));
		System.out.println("50보다 큰 값 :" + set.tailSet(50));
		System.out.println("가장 작은 값 :" + set.first());
		System.out.println("가장 큰 값 :" + set.last());
		System.out.println("90점 아래 :" +set.lower(90));
		System.out.println("90점 위 :"+set.higher(90));
		System.out.println("90점이거나 바로 아래 :"+set.floor(90));
		System.out.println("90점이거나 바로 위 :"+set.ceiling(90));
		
		//컬렉션에서 불러오면서 제거할 때
		while(!set.isEmpty()) { //데이터가 비어있지 않으면
			int sc = (int)set.pollFirst();//기본타입이 객체라서 int로 형변환
			System.out.println(sc);
			System.out.println("남은 객체수 :" + set.size());
		}
		/*
10
남은 객체수 :7
44
남은 객체수 :6
56
남은 객체수 :5
59
남은 객체수 :4
70
남은 객체수 :3
80
남은 객체수 :2
95
남은 객체수 :1
100
남은 객체수 :0

		 */
		
	}
}
