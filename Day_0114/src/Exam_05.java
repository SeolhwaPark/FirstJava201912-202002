class DD{
	static int cnt = 0;
	int m = 0;
	
	void add() {
		cnt++;
		m++;
		System.out.println("cnt =" + cnt);
		System.out.println("m =" + m);
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		DD d1 = new DD();
		d1.add();
		
		DD d2 = new DD();
		d2.add();
	}
}
