/*
 * equals, equalsIgnoreCase();
 * 
 * "end" End enD END... �������� ��ҹ��� ���� ����..
 */
public class Exam_04 {
	public static void main(String[] args) {
		String s = "end";
		if(s.equals("eNd")) {
			System.out.println("==");
		}else {
			System.out.println("xx");
			
		}
		System.out.println("=====================");
		if(s.equalsIgnoreCase("End")) {
			System.out.println("==");
		}else {
			System.out.println("xx");
			
		}
		
	}

}
