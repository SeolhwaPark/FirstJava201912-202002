/* int는 4바이트 int b=7%5;
 * 정수와 실수의 연산결과는 실수
 * Double은 8바이트 double a=7/5.;
 * a=(int)(7/5.);//강제형변환시 결과가 변형될 가능성이 큼ㅠㅠ
 * 자동형변환(작은바이트가 큰바이트에 들어갔을 때) ->정수를 실수로,실수를 정수로~~
 */
public class Exam_02 {

	public static void main(String[] args) {
		int a=(int)(7/5.);//강제형변환
		int b=7%5;
		System.out.println("7/5="+a);
		System.out.println("7%5="+b);
		System.out.println("7/5="+7/5.);
		System.out.println("7%5="+7%5);
		
		int var=(int)3.14;
		double d1 =3.14;
		double d2 =90;//자동형변환
		System.out.println("d2="+d2);
		System.out.println("var="+ var);
	}

}
