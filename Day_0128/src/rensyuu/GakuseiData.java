package rensyuu;
/*
 * ��¿���
 * 
 * ������ ä�� ���ǥ
 * 
 * �����迭
 * ��ȣ	 �̸� 	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ����
 * 
 * ������� 70% ������ �迭
 */

public class GakuseiData {
	Gakusei[] seiseki;
	int[] ox = new int[20];
	int[] seikai = new int[20];
	int cnt =0;
	
	GakuseiData(){}
	
	GakuseiData(Gakusei[] seiseki, int[] sekai, int cnt){
		this.seiseki = seiseki;
		this.cnt = cnt;
		
		for(int i = 0; i<seikai.length; i++) {
			this.seikai[i] = seikai[i];
		}
	}
	
	void keisan() {
		//����
		for(int x = 0 ; x<cnt; x++) {
			for(int y = 0; y<seikai.length; y++) {
				
			}
		}
	}
	

}
