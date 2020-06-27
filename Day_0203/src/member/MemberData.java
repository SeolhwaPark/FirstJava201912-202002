package member;

import java.util.List;

public class MemberData {
	List list;
	
	MemberData(){}
	MemberData(List list){
		this.list = list;
		memberPrint();
	}
	
	private void memberPrint(){
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		}
	}
	
}
