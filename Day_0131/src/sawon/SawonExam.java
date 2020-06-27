package sawon;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;


/*
 * 사번    이름     급여
 * 1101 aaaa 345,890
 * . . . . . . 
 * 합계            4,234,560
 */
public class SawonExam {
	public static void main(String[] args) throws Exception {
		int cnt = 0;
		int sum=0;
		
		Scanner scf = new Scanner(new File("src\\sawon\\sawon.txt"));		
		while(scf.hasNext()) {
			scf.nextLine();
			cnt++;
		}
		Sawon[] sawon = new Sawon[cnt];
		
		scf = new Scanner(new File("src\\sawon\\sawon.txt"));
		int cnt1 = 0;
		System.out.println("사번\t성명\t급여");
		
		while(scf.hasNext()) {
			String[] str = scf.nextLine().split(",");
			Sawon sa1 = new Sawon(str);
			sawon[cnt1] = sa1;
			cnt1++;
		}
		
		DecimalFormat df = new DecimalFormat("￦ #,###,###,###");
		for(int x=0; x<cnt1; x++) {
			System.out.println(sawon[x]);
			sum += sawon[x].money;
		}
		String a = df.format(sum);
		System.out.println("합계\t\t" + a);
	}
}
