
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam_04 {
	public static void main(String[] args) {
		List<String> voca =new ArrayList<String>();
		voca.add("rose");voca.add("candle");voca.add("paper");voca.add("book");voca.add("song");
		voca.add("candle");voca.add("berry");voca.add("paper");voca.add("berry");voca.add("song");
		voca.add("paper");voca.add("rose");voca.add("song");voca.add("lion");voca.add("berry");
		voca.add("rose");voca.add("book");voca.add("rose");voca.add("rose");
		
		System.out.println(voca);
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<voca.size();i++) {
			if(map.containsKey(voca.get(i))) {
				map.put(voca.get(i), map.get(voca.get(i))+1);
			}
			else map.put(voca.get(i), 1);
		}
		System.out.println(map);
		
	}
}
