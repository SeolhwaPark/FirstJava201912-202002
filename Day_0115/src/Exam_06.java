/*����Ŭ����(����Ŭ����)
 * 
 * �ڷ����屸��
 */

public class Exam_06 {
	public static void main(String[] args) {
		//Hak h1 = new Hak(); //������ ���ÿ� ����Ʈ������ �ʱ�ȭ
		//h1.bun = 3;
		Hak[] stu = new Hak[5]; //stu�� ����
		
		Hak h2 = new Hak(1,"ȫ�浿", 90); //������ ���ÿ� �� �ʱ�ȭ
		
		stu[0] = h2; //
		
		h2 = new Hak(3,"dddd",77);
		
		stu[1] = h2;
		
		stu[2] = new Hak(2,"ABA",88);
		
		stu[3] = new Hak(5,"AEA",88);

		stu[4] = new Hak(7,"AGA",88);
		
		HakData data = new HakData(stu);
		
		data.print();
		
	}
}
