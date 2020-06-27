/*
 * if(조건식){
 *   문장1;
 * }else if(조건식1){
 *   문장2;
 * }else if(조건식2){
 *   문장3;
 * }else if(조건식..n)
 *   . . . . .
 * }else{
 *   문장n
 * }
 * 
 * 모든걸 간결하고 알기 쉽게 쓰셈
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
		System.out.println("등급 :"+ rank);
		}
	}
}
