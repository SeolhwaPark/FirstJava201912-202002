
public class sam_04 {
	public static void main(String[] args) {
		int i = 0;
		int s = 0;
		
		while(true) {
			i++;
			s += i;
			if(i == 10) break;
		}
		
		System.out.println("1~10 :"+ s);
	}

}
