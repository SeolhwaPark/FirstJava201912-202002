import java.util.Scanner;

/*	키보드로 10진수, 변환할 진수 입력 다음과 같이 출력하는 클래스
 * 1. [입력 예시]
 * 10진수 : 25
 * 변환 : 2
 * 2. [출력 예시]
 * 10진수 : 25
 * 2진수 : 11001
 * 
 */
class ConvNumber2{
	int dec;
	int conv;
	int mok;
	int nmg;
	int a[] = new int[10];
	int cnt=0;
	
	ConvNumber2(int dec,int conv){
		this.dec = dec;
		this.conv = conv;
	}
	void conversion() { // 변환
		do {
			mok = dec/conv;
			nmg = dec%conv;
			a[cnt] = nmg;
			cnt++;
			dec = mok;
		}while(mok != 0);
		
		for(int x=cnt-1; x>=0; x--) {
			if(a[x]==10) {
				System.out.print("A");
			}else if(a[x]==11) {
				System.out.print("B");
			}else if(a[x]==12) {
				System.out.print("C");
			}else if(a[x]==13) {
				System.out.print("D");
			}else if(a[x]==14) {
				System.out.print("E");
			}else if(a[x]==15) {
				System.out.print("F");
			}else {
				System.out.print(a[x]);
			}
		}
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//작성
		//입력
		int conv=0;
		System.out.println("[입력 예시]");
		System.out.print("10진수 : ");
		int dec = scn.nextInt(); // 10진수 입력
		System.out.print("변환 : ");
		int a = scn.nextInt(); // 10진수 -> ?진수 변환
		if(a==2||a==8||a==16) {
			conv = a;
		}
		
		ConvNumber2 conve = new ConvNumber2(dec, conv);
		System.out.println("10진수 : " + dec);
		System.out.print(conv + "진수 : ");
		conve.conversion();

	}

}
