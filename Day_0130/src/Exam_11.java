import java.util.Arrays;

/*
 * 검색
 * 
 * binarySearch이진검색법. 정렬이 되어 있을 때만 검색가능
 */
public class Exam_11 {
	public static void main(String[] args) {
		int var[] = {80,90,77,88,56,95};
		String name[] = {"홍길동","김자바","이순신"};
		
		Arrays.parallelSort(var);
		int index = Arrays.binarySearch(var, 90);
		System.out.println("90 위치는 :" + index);
		System.out.println();
		Member m1 = new Member("홍길동");
		Member m2 = new Member("김자바");
		Member m3 = new Member("이순신");
		Member[] mem = {m1,m2,m3};
		
		Arrays.parallelSort(mem);
		int no = Arrays.binarySearch(mem, m3);
		System.out.println(m3.name +"는 " + no + "에 있음");
		int noo = Arrays.binarySearch(mem, m2);
		System.out.println(m2.name +"는 " + noo + "에 있음");
		int nooo = Arrays.binarySearch(mem, m1);
		System.out.println(m1.name +"는 " + nooo + "에 있음");
	}

}
