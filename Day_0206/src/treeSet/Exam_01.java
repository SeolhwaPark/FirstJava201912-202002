package treeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 *검색기능을 강화한 컬렉션 treeSet
 *루트와 비교해서 값이 크면 오른쪽으로 내려가고 작으면 왼쪽으로 내려감. 자동정렬이 가능
 *중복값은 자동소멸(?)
 *트리의 루트 바로아래는 포인터(주소)와 영역(위치)를 갖고있음
 *List는 배열과 비슷. 배열은 값이 저장되고 list는 객체의 주소가 저장됨
 *
 *Set는 중복을 허용하지 않고 순서가 없음
 *임의대로 저장하고 임의대로 꺼내짐
 *
 *first메소드
 *
 *이진트리
 *전이진트리
 *정이진트리 무조건 두개씩
 *
 */
public class Exam_01 {
	public static void main(String[] args) {
		//그냥 셋 Set set = new HashSet();
		//set.add(10); //10이라는 정수의 객체가 저장됨
		//set.add(new Integer(10)); //객체의 주소가 저장
	System.out.println("___________로또번호 뽑깅_____________");
		 
		Set set = new TreeSet();
		for(int x =0;set.size()<6; x++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set); //트리셋으로 자동정렬가능
		System.out.println("_____________________________");
		Set set2 = new HashSet();
		for(int x =0;set2.size()<6; x++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		System.out.println(set2);
	}
}
