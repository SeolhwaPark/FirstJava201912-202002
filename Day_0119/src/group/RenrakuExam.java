package group;

import java.util.Scanner;

public class RenrakuExam {
	public static void main(String[] args) {
		// �Է�
		Scanner scn = new Scanner(System.in);
		System.out.println("**********  ����ó   **********");
		System.out.println("�Ҽӱ׷�/ �̸�/ ��ȭ��ȣ/ �������");
		Renraku ren[] = new Renraku[100];
		int cnt = 0;

		while (cnt < 100) {
			System.out.print("�Է�:");
			String group = scn.next();
			if (group.equals("end"))
				break;
			String name = scn.next();
			int bangou = scn.nextInt();
			int seinen = scn.nextInt();
			ren[cnt] = new Renraku(group, name, bangou, seinen);
			cnt++;
		}

		//���
		RenrakuData data = new RenrakuData(ren, cnt);
		System.out.println("-------��ȸ��ȣ�� �Է��ϼ���-------\n(1)��ü (2)�׷� (3)������� (4)�̸�");
		int imsi = scn.nextInt();
		
		if (imsi == 1) {
			data.totalPrint();
			
		} else if (imsi == 2) {
			String imsi1 = scn.next();
			data.groupPrint(imsi1);
			
		} else if (imsi == 3) {
			
			int imsi2 = scn.nextInt();
			data.birthPrint(imsi2);
			
		} else if (imsi == 4) {
			String imsi3 = scn.next();
			data.namePrint();
		}
	}
}
