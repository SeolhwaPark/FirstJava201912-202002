package Sawon;
/*
 * �� ����� ���̵� ��� �ٹ��ð��� �Է¹޾� ����鿡 ���� �ְ� �޿��� ����ϴ� ���α׷��� �ϼ�
 * 
 * ��������׸�
 * ���̵� ��� �ñ� �ٹ��ð� �ְ��޿�
 * 
 * ó������
 * ����� �ְ��޿��� �ٹ��ð��� �ñ��� ���� ������ �Ѵ�
 * �ñ��� ����� ����� 1����� ��� 10000�� 2����� ��� 5000�� 3����� ��� 2000��
 * �ٹ��ð��� 36�ð��� �ʰ��� ��� �ʰ��ٹ��ð��� 1.5�踦 �����ϸ� �ٹ��ð��� �ִ� 50�ð������� �����ȴ�
 * ����� ���̵� "end"�� �ԷµǸ� �ڷ���� �������� �޿����հ� ����� ����Ѵ�.
 */
public class Sawon {
	//�Ӽ�
	String id;
	int level;
	int pay;
	int time;
	int weekPay;
	
	Sawon(){
	}
	
	Sawon(String id, int level, int time){
		this.id = id;
		this.level = level;
		this.time = time;
	}
	
	void print() {
		System.out.print(id + "\t" + level + "\t" + pay + "\t" );
		System.out.print(time + "\t"+ weekPay + "\n");
	}
	
}
