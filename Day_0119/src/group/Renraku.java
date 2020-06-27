package group;

/*연락처 만들기
 입력
 그룹 이름 전화번호 생년월일
 출력
(1)전체조회 (2)그룹조회 (3)나이조회 (4)이름조회 -> 선택시 해당사항을 출력
 */
public class Renraku {
	String group; //그룹
	String name; //이름
	int bangou; //전화번호
	int seinen; //생년월일
	
	Renraku(){}
	
	Renraku(String group, String name, int bangou, int seinen){ 
		//()괄호안에꺼가 매개변수. 연결시켜주는 애
		this.group = group;
		this.name = name;
		this.bangou = bangou;
		this.seinen = seinen;	
	}
	
	void print() {
		System.out.print(group + "\t" + name + "\t" + bangou + "\t" + seinen + "\n");
		
	}

}
