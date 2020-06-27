
public class sam_05 {
	public static void main(String[] args) {
		int i = 0;
		int s = 0;
		int y = 1;
		
		while(true) {
			int m = 0;
			i++;
			m = i*y;
			s += m;
			if(i == 10) break;
			y = y*(-1);
		}
		System.out.println("1-2+3... -10 :"+ s);
	}

}
