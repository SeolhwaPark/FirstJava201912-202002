package rensyuu;
/*
 * ��¿���
 * 
 * ������ ä�� ���ǥ
 * 
 * ��ȣ	 �̸� 	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ����
 * 1  	ȫ�⵿	o x o x. . . .
 * 
 * ������� 70%
 */
public class Gakusei {
	int bangou;
	String name;
	int tensuu;
	String[] seiseki;
	int[] kotae;
	String[] ox;
	
	Gakusei(){}
	
	Gakusei(String[] gakuten){
		bangou = Integer.parseInt(gakuten[0]);
		name = gakuten[1];
	
		for(int i = 2; i<gakuten.length; i++) {
			kotae[i-2] = Integer.parseInt(gakuten[i]);		
		}
	}

}
