/*
 * if(���ǽ�){
 *   ����1;
 * }else if(���ǽ�1){
 *   ����2;
 * }else if(���ǽ�2){
 *   ����3;
 * }else if(���ǽ�..n)
 *   . . . . .
 * }else{
 *   ����n
 * }
 * 
 * ���� �����ϰ� �˱� ���� ����
 */
public class Exam_09 {
	public static void main(String[] args) {
		int a=70;
		String rank="";
		if(a>=90) {
			rank="A";//System.out.println("A");
		}else if(a>=80) {
			rank="B";//System.out.println("B");
		}else if(a>=70) {
			rank="C";//System.out.println("C");
		}else if(a>=60) {
			rank="D";//System.out.println("D");
		}else {
			rank="F";//System.out.println("F");
		System.out.println("��� :"+ rank);
		}
	}
}
