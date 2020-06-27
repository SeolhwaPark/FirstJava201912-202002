package group;

import java.util.Scanner;

public class RenrakuExam {
	public static void main(String[] args) {
		// 입력
		Scanner scn = new Scanner(System.in);
		System.out.println("**********  연락처   **********");
		System.out.println("소속그룹/ 이름/ 전화번호/ 생년월일");
		Renraku ren[] = new Renraku[100];
		int cnt = 0;

		while (cnt < 100) {
			System.out.print("입력:");
			String group = scn.next();
			if (group.equals("end"))
				break;
			String name = scn.next();
			int bangou = scn.nextInt();
			int seinen = scn.nextInt();
			ren[cnt] = new Renraku(group, name, bangou, seinen);
			cnt++;
		}

		//출력
		RenrakuData data = new RenrakuData(ren, cnt);
		System.out.println("-------조회번호를 입력하세요-------\n(1)전체 (2)그룹 (3)생년월일 (4)이름");
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
