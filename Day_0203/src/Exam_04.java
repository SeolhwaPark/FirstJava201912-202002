import java.util.List;
import java.util.Vector;

/*
 * Vector
 * 멀티스레스환경에서 사용하며,동기화되면 속도가 느려짐
 * 
 * capacity 실제 차지하고 있는 공간 확인하는 아이
 */
public class Exam_04 {
	public static void main(String[] args) {
		//List list = new Vector();
 
		Vector vc = new Vector();
		//Vector<vector> 벡터전용 ㅇㅇㅋ

		//System.out.println(vc.size()); //오브젝트의 갯수 
		//System.out.println(vc.capacity()); 
		//물리적인 공간의 크기, 기본 10개의 저장공간이 존재하고, 자동으로 공간을 확보함
		
		vc.add("AAAA");
		vc.add(0,"BBBB");
		//인덱스값을 주면 데이터순서가 밀려나고 삽입삭제같이 그만큼 처리시간이 늦어짐		
		vc.add("CCCC");
		
		//****LinkedList가 삽입삭제가 자주 일어날 떄는 용이함
		
		for(int x = 0; x<vc.size();x++) { 
			System.out.println(vc.get(x));
		}
	}
}
