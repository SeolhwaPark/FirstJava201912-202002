package rensyuu2;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GakuseiExam {
	public static void main(String[] args) throws Exception {
		Scanner scf = new Scanner(new File("C:\\Users\\lunas\\JavaSeolhwa\\Day_0131\\src\\rensyuu2\\rensyuu.txt"));
		int cnt = 0;
		int sum = 0;
		
		while(scf.hasNext()) {
			scf.nextLine();
			cnt++;
		}
		
		Gakusei[] gaku = new Gakusei[cnt];
		scf = new Scanner(new File("C:\\Users\\lunas\\JavaSeolhwa\\Day_0131\\src\\rensyuu2\\rensyuu.txt"));
		int cnt1 = 0;
		
		System.out.println("학번\t성명\t미납금");
		while(scf.hasNext()) {
			String[] str = scf.nextLine().split(",");
			Gakusei gakusei = new Gakusei(str);
			gaku[cnt1] = gakusei;
			cnt1++;
		}
		
		DecimalFormat dcf =  new DecimalFormat("￦#,###,###,###");
		for(int x = 0; x < cnt1; x++) {
			System.out.println(gaku[x]);
			sum += gaku[x].okane;
		}
		String aaa = dcf.format(sum);
		System.out.println("합계\t\t" + aaa);	
	}
}
