package rensyuu;

public class Loto {
	int[] game = new int[6]; //�ζ�6�ڸ�
	int cnt; //�Է¼�
	boolean bonasu = false; //���ʽ�Ȯ�ο�
	String rank;//����
	
	Loto(){} //������Ŭ����
	
	Loto(int[] lotto){
		game = lotto;//LotoŬ�����迭�� ���ӿ� ���� 6�ڸ� �ѱ��
	}
	
}
