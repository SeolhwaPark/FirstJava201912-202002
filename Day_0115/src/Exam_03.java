import java.util.Scanner;

/*
 * 키보드 10진수, 변환할 진수 입력 다음과 같이 출력하는 클래스를 작성하시오
 * 변환하는 부분이 2,8,10,16 이외의 진수는 다시 입력받아함
 * 
 * 1.[입]
 *	10진수 : 25
 *  변환 : 2
 * 
 * 2.[출]
 * 10진수 : 25
 * 2진수 : 11001
 */


class ConvNumber{
	//속성
	//프로그램작성
	int dec, conv, cnt;
	int arr[] = new int [16];//2진수분의 자릿수가 들어갈 수 있게...
	char str[] = {'0','1','2','3','4','5','6','7','8','A','B','C','D','E','F'};
	//16진수 들어가게
	
	char bi [] = new char[16];//변환한 값을 저장
	String string = "";//변환한 값을 출력하기 위한 문자열
	
	
	//기능
	ConvNumber(){
	}
	
	ConvNumber(int dec, int conv){
		this.dec = dec;
		this.conv = conv;
	}
	
	String conversion() {
		for(int i = 0; i<arr.length; i++) {
			bi[i] = str[dec%conv];
			if((dec/conv)>0) cnt++;
			dec = dec/conv;
		}
		for(int i = cnt; i>=0; i--) {
			string+=bi[i];
		}
		return string;
	}
	
}
public class Exam_03 {
	public static void main(String[] args) {
		//입력
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 :");
		int dec = scn.nextInt();
		int conv;
		while(true) {
			System.out.print("변환 :");
			conv = scn.nextInt();
		
		if(conv == 2 || conv == 8 || conv == 16) break;
		else System.out.println("잘못된 변환 값");
		}
		
		//출력
		ConvNumber con = new ConvNumber(dec,conv);
		System.out.println("10진수 : " + dec);
		System.out.println(conv + "진수 : " + con.conversion());
	}
}