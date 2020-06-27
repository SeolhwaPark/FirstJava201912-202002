package parking;

/*���
 * �ڵ�����ȣ �����ð� �������
 *	1234 	25 		500 
 */
public class ParkingData {
	Parking[] park;
	int arr[] = new int[100];
	int cnt;

	ParkingData() {
	}

	ParkingData(Parking[] p, int cnt) {
		park = p;
		this.cnt = cnt;
	}

	void dataPrint(Parking[] park, int cnt) {
		System.out.println("�ڵ�����ȣ\t�����ð�\t�������");

		for (int x = 0; x < cnt; x++) {
			int parkTime = park[x].parkTime;
			if (parkTime < 10) { // 10�� �̸��� ��
				park[x].money = 0;
			} else if (parkTime >= 10 && parkTime < 30) { // 10�� �̻� 30�� �̸��̸�
				park[x].money = 500;
			}
			if (parkTime >= 30) { // 30�� �̻� ������ 10�� ������ 500���� �߰�
				park[x].money = ((parkTime - 30) / 10) * 500 + 500;
				if ((parkTime - 30) % 10 > 0)
					park[x].money = park[x].money + 500;
				// �����ð� - 30�и���(30�� ���ϴ� ����) 500�� �߰�
			}
			if (park[x].money >= 30000)
				park[x].money = 30000;// 30000�� �̻��̶� 30000�� ��
			if (parkTime >= 1440)
				park[x].money = 30000;// �Ϸ� 24�ð� �����ص� �ִ� 30,000��
		}

		for (int x = 0; x < cnt; x++) {
			System.out.print("");
			System.out.print("������ȣ : " + park[x].carNo+ "\t");
			System.out.print("�����ð� : " + park[x].parkTime + "\t");
			System.out.print("������� : " + park[x].money + "\n");
		}
	}
	
	void data() {
		System.out.println("-----------����----------");

		int sum = 0;
		for(int x=0; x<cnt; x++) {
			park[x].money+=cnt;
			cnt++;
			sum = park[x].money;
		}
		System.out.println("���� �� ������� :" + cnt);
		System.out.println("�� ������� :" + sum);
	}
}
