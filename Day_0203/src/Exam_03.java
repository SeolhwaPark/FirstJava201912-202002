import java.util.ArrayList;
import java.util.List;

class AA{
	int b;
	String n;
	AA(){}
	AA(int b, String n){
		this.b = b;
		this.n = n;
	}
	
	public String toString() {
		return "��ȣ:" + b + "/t�̸�:" + n;
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		List<AA> list = new ArrayList<AA>();
		list.add(new AA(1,"AAA"));
		list.add(new AA(2,"BBB"));
		list.add(new AA(3,"CCC"));
		list.add(new AA(4,"DDD"));
		list.add(new AA(5,"EEE"));
		
		for(int x = 0 ; x<list.size(); x++) {
			AA a = list.get(x);
			System.out.println(a.b);
		}
	}

}
