import java.util.Scanner;


/*
 * ��ȣ �̸� ����5�� �Է� �޾Ƽ� ����ϴ� ���α׷��� �ϼ��Ͻÿ�
 * 
 * �Է��׸� �ִ� 10�� �Ǵ� ��ȣ -99�̸� ����
 * ��ȣ �̸� ���� 5��
 * 
 * ������½� ������������ ���
 * 
 * ���
 * ��ȣ �̸� ����
 * 1 AAA 77 80 87 90 95
 * 
 */
class Hak {
	int bun;
	String name;
	int[] score = new int[5];
	
	Hak(){}
	
	Hak(String[] hh){
		bun = Integer.parseInt(hh[0]);
		name = hh[1];
		
		for(int i = 0; i<score.length; i++) {
			this.score[i] = Integer.parseInt(hh[i+2]);
		}
	}
}

class HakData {
	Hak[] hak;
	int cnt;
	
	HakData(Hak[] hak, int cnt) {
		this.hak = hak;
		this.cnt = cnt;
		
		dataPrint();
	}

	void dataPrint() {
		// ���
		System.out.println("��ȣ\t�̸�\t����");
		for(int x = 0; x<cnt; x++) { //�����
			for(int y = 0; y<hak.length-1; y++) { // ������������
				for(int z= y+1; z<hak[x].score.length; z++) { // ����
					if(hak[x].score[y] > hak[x].score[z]) {
						int temp = hak[x].score[y];
						hak[x].score[y] = hak[x].score[z];
						hak[x].score[z] = temp;
					}					
				}
			}
		}
		
		for (int x = 0; x < cnt; x++) {
			System.out.print(hak[x].bun + "\t" + hak[x].name + "\t");
			for (int y = 0; y <hak[x].score.length; y++) {
				System.out.print(hak[x].score[y] + "\t");
			}
		}	
	}
}
	public class Exam_01 {
	public static void main(String[] args) {
		Hak[] hak = new Hak[10];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		
		while(cnt<10) {
			System.out.print("�Է� :");
			String[] arr = scn.nextLine().split(",");
			for(int x = 0; x<cnt; x++) {
				for(int y =0; y<hak[x].score.length; y++) {
					if(100<Integer.parseInt(arr[y]) && 0>Integer.parseInt(arr[y])) {
						System.out.println("���� �����ϴ�");
						continue;
					}
				}
			}
			if(arr[0].equals("-99"))break;
			Hak h = new Hak(arr);
			hak[cnt] = h;
			cnt++;
		}
		HakData h = new HakData(hak,cnt);
	}
}
