
public class sam_06 {
	public static void main(String[] args) {
		int i = 0;
		int s = 0;
		boolean sw = true;
		
		while(true) {
			
			i++;
			if(sw) {
				s += i;
				sw = false;
			}else {
			s -= 1;
			sw = true;
			}
			if(i == 10) break;
		}
		System.out.println("1-2+3... -10 :"+ s);
		// 답이 이상해요 ...
	}

}
