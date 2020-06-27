package treeMap;
import java.util.*;
/*
 * TreeMap
 * 검색기능,자동정렬가능
 * 
 *  entry.getKey() 키
 *  entry.getValue() 값
 * lowerEntry 아래
 * higherEntry 위
 * firstEntry 가장 작은 값
 * headEntry ~보다 작은값 
 * tailEntry ~보다 큰값
 * floorEntry 같거나 바로 아래
 * ceilingEntry 같거나 바로위
 * pollFirstEntry 작은 숫자순으로 불러오면서 삭제
 * pollLastEntry 큰 숫자순으로 불러오면서 삭제
 */
public class Exam_03 {
	public static void main(String[] args) {
		TreeMap<Integer,String> score = new TreeMap<Integer,String>();
		score.put(new Integer(87), "홍길동");
		score.put(new Integer(90), "김자바");
		score.put(new Integer(55), "홍갤동");
		score.put(new Integer(78), "김길동");
		score.put(new Integer(69), "홍자바");
		score.put(new Integer(40), "김갤동");
		
		System.out.println(score);
		System.out.println(score.get(87)); // 87에 해당되는 문자열이 나옴
		
		//Entry
		Map.Entry<Integer, String> entry = null; //객체선언**********
		
		entry = score.firstEntry(); //가장적은거
		System.out.println("가장 낮은 점수 :" + entry.getKey() + "-" + entry.getValue());
		//정수와 문자열을 동시에 출력
		
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 :" + entry.getKey() + "-" + entry.getValue());
		//정수와 문자열을 동시에 출력
		
		entry = score.lowerEntry(85);
		System.out.println("85점 아래의 점수 :" + entry.getKey() + "-" + entry.getValue());
		//정수와 문자열을 동시에 출력

		entry = score.higherEntry(75);
		System.out.println("75점 위의 점수 :" + entry.getKey() + "-" + entry.getValue());
		//정수와 문자열을 동시에 출력

		entry = score.floorEntry(85);
		System.out.println("85점이거나 바로 아래의 점수 :" + entry.getKey() + "-" + entry.getValue());
		//정수와 문자열을 동시에 출력

		entry = score.ceilingEntry(75);
		System.out.println("75점이거나 바로 위의 점수 :" + entry.getKey() + "-" + entry.getValue());
		//정수와 문자열을 동시에 출력
		
		while(!score.isEmpty()) {
			entry = score.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "남은 객체 :" + score.size());
		}
		
	}
}
