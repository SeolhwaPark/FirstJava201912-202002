package parking;

import java.util.Scanner;

/*�Է�
 *�������� : 1234 25
 *�������� : 0000 -> �Է�����
 *
 */
public class ParkingExam {
	public static void main(String[] args) {
		//�Է�
		Scanner scn = new Scanner(System.in);
		System.out.println("������ȣ �� �����ð�(�д���)�� �Է��ϼ��� ");
		Parking park[] = new Parking[100];
		Parking p = new Parking();
		int cnt = 0;
		
		while(cnt<100) {
			System.out.print("�������� : ");
			String carNo = scn.next();
			if(carNo.equals("0000"))break;
			int parkTime = scn.nextInt();
			park[cnt] = p;
			park[cnt] = new Parking(carNo, parkTime);
			cnt++;
			}
		
		ParkingData data = new ParkingData(park, cnt);
		data.dataPrint(park, cnt);
	
	}
}