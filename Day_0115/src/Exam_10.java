import java.util.Scanner;

/*	Ű����� 10����, ��ȯ�� ���� �Է� ������ ���� ����ϴ� Ŭ����
 * 1. [�Է� ����]
 * 10���� : 25
 * ��ȯ : 2
 * 2. [��� ����]
 * 10���� : 25
 * 2���� : 11001
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
	void conversion() { // ��ȯ
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
		//�ۼ�
		//�Է�
		int conv=0;
		System.out.println("[�Է� ����]");
		System.out.print("10���� : ");
		int dec = scn.nextInt(); // 10���� �Է�
		System.out.print("��ȯ : ");
		int a = scn.nextInt(); // 10���� -> ?���� ��ȯ
		if(a==2||a==8||a==16) {
			conv = a;
		}
		
		ConvNumber2 conve = new ConvNumber2(dec, conv);
		System.out.println("10���� : " + dec);
		System.out.print(conv + "���� : ");
		conve.conversion();

	}

}
