
public class sam_10 {
	public static void main(String[] args) {
		int s = 0; //Ȧ��
		int t = 0; //¦��
		boolean sw = true; // true = 0
		
		for(int i = 1; i <=100 ; i++) {
			if(sw) {
				sw = false;
				s += i;
			}else {
				sw = true;
				t += i;
			}	
		}//for
		System.out.println("Ȧ���� �� :"+ s +", ¦���� �� :"+ t);
	}//main

}
