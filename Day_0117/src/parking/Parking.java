package parking;
/*
 * �����忡 ������ �����鿡 ���� ��������� ���
 * 
 * �����忡 ������ �������� �����׸�
 * �ڵ�����ȣ �����ð� (�д���) �������
 * 
 * ó������
 * �������ɽð��� �ִ��Ϸ� 24�ð����� �Ѵ�
 * ��������� 10�й̸��� ����, 30�б��� 500
 * 30�� ���ĺ��ʹ� 10�д� 500�� �߰�
 * �Ϸ���������� �ִ� 30000
 * 30000�ʰ��ص� 30000�� ¡��
 * 
 * �������������� 100�� �̸�
 */
public class Parking {
	String carNo;
	int parkTime;
	int money;
	
	Parking(){}
	
	Parking(String carNo, int parkTime){
		this.carNo = carNo;
		this.parkTime = parkTime;
	}
	
	void parkingPrint() {
		System.out.print(carNo + "\t" + parkTime + "\t" + money + "\n");
	}
	
}
