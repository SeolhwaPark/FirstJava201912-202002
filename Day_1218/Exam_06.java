/*
 * ��������
 *  ���� : ���׿����� !(not), &&(and)������ ���� ���� ��, ||(or)���ʸ� ���̶� ��
 *  
 */
public class Exam_06 {
	public static void main(String[] args) {
		System.out.println("5>4&&7<8 =" + (5>4&&7<8));
		System.out.println("5>4&&7<8 =" + (4>4&&7<8));
		System.out.println("5>4="+(5>4));
		System.out.println("5>4="+!(5>4));
		boolean flag=false; // ���� ���ΰ� �����ΰ�
		System.out.println("flag="+!flag);
		
		int a=100;
		System.out.println("a =" + a);
		//System.out.println("a =" + a);
		
		int sw=0;
		System.out.println("sw =" + !(sw==0));
	}

}
