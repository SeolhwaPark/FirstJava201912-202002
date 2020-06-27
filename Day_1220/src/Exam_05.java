/*
 * 1~100 Â¦¼ö ÇÕ
 * while
 */
public class Exam_05 {
	public static void main(String[] args) {
		//È¦¼ö
		int i=0,eventot1=0;
		while(true) { 
			i=i+2;
			eventot1+=i;
			if(i==100) {
			break;				
			}
		}
		System.out.println("1~100 Â¦¼öÀÇ ÇÕ:"+eventot1);
/*
		i=0;
		eventot2=0;
		while(i<=100) {
			i+=2;
			eventot2+=i;
			}
		System.out.println("3:1~100 Â¦¼öÀÇ ÇÕ:"+eventot2);
		
		
		i=0;
		evetot3=0;
		while(i<100) {
			i++;
			if(i%2==0) {
				eventot3 += i;
			}
		}
			System.out.println("4:1~100 Â¦¼öÀÇ ÇÕ:"+eventot3);
*/
	
		i=0;
		eventot1=0;
		boolean flag=true;
		while(i<100) {
			i++;
			if(flag) {
				flag=false;
			}else {
				eventot1  += i;
				flag = true;
			}
		}
			System.out.println("5:1~100 Â¦¼öÀÇ ÇÕ:"+eventot1);
	}

}
