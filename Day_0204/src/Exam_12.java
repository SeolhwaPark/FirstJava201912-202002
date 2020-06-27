import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 해시맵 인터페이스는 동기화가 안되고 싱글테이블에서 주로 이용됨
 * 
 * 해쉬탭은 동기화가 됨
 */
public class Exam_12 {
	public static void main(String[] args) {
		Map map = new HashMap();
			map.put(1, "AAA");
			map.put(2, "BBB");
			map.put(3, "CCC");
			map.put(1, "DDD");
		
		String a = (String)map.get(1);
		System.out.println(a);
		
		Set set = map.keySet();
		System.out.println(set);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Integer x= (Integer)iter.next();
			System.out.println("key :" + x + "Value:" + map.get(0));
		}
	}

}
