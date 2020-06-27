import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/*
 *달력만들기
 *년월입력:2020,2
			[2020년2월]
일	월	화	수	목	금	토
						1	
2	3	4	5	6	7	8	
9	10	11	12	13	14	15	
16	17	18	19	20	21	22	
23	24	25	26	27	28	29	
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("년월입력:");
		String[] day = scn.nextLine().split(",");
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		System.out.println("\t\t\t["+ year + "년" +month+ "월]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//년,월을 이용한 calendar 객체생성
		GregorianCalendar calendar =
				new GregorianCalendar(year,(month-1),1);
		
		//해당 월의 마지막날 구하기
		int maxday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		//System.out.println(maxday);
		//요일구하기(1일욜 2월욜 3화욜 4수욜 5목욜 6금욜 7토욜)
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		//시작요일전까지 공백 출력
		for(int x=0; x<(week-1);x++) {
			System.out.print("\t");
		}
		//일자출력
		for(int x =1; x<=maxday; x++) {
			if(week <= 7) {
				System.out.print(x + "\t");
			}else {
				System.out.print("\n");
				//week가 7보다 커지면 다시 일욜로 
				System.out.print(x+"\t");
				week = 1; 
			}			
			week++;
		}
		System.out.println();
	}
	
}
