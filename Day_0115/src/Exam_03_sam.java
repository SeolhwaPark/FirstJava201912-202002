import java.util.Scanner;



/* 키보드로 10진수, 변환할 진수 입력 다음과 같이 출력하는 클래스를 작성하시오

 * [입력 예시] 			[입력 예시]			[입력 예시]

 * 10진수 : 25			10진수: 45			10진수:45

 * 변환 : 2			    변환: 8					변환:16

 * [출력 예시]			[출력 예시]			[출력 예시]

 * 10진수 : 25			10진수: 45			10진수:45

 * 	2진수:11001		8진수:55				16진수:2D

 */

class ConvNumber1{

	int dec,conv,cnt;
	int arr[] = new int[16]; //2진수가 16자리까지 표현
	char str[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	//16진수까지 변환하기 위함

	char binary[]= new char[16]; //변환한 값을 저장하기 위한 배열
	String string=""; //프린트메소드안에서 진수를 변환한 값을 출력하기 위한 문자열

	ConvNumber1(){} //디폴트생성자

	ConvNumber1(int a,int b){ //10진수와 변환할 진수를 입력받음

		dec=a;
		conv=b;

	}

	String coversion(){

			for(int i=0;i<arr.length;i++) {
				binary[i]=str[dec%conv];
				if((dec/conv)>0) cnt++;
				dec = dec/conv;
	}
			for(int i=cnt;i>=0;i--) { 
				//System.out.print(binary[i]);
					string+=binary[i];
			}
			return string;
	}
	
}

public class Exam_03_sam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수 :");
		int dec,conv;
		dec= sc.nextInt();
		
		while(true) {
		System.out.print("변환 :");
		conv = sc.nextInt();
		
		if (conv == 2 || conv == 8 || conv ==16) break;
		else System.out.println("잘못된 변환 값");
		}
		
		ConvNumber1 cv = new ConvNumber1(dec,conv);
		System.out.println("10진수 "+dec);
		System.out.println(conv+"진수 :"+cv.coversion());

	}

}