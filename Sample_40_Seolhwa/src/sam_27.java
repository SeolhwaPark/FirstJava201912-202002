
public class sam_27 {
	public static void main(String[] args) {
		int a[]= {68,45,85,76,65,95,99,89,36,77};
		int b[]= new int [a.length];
		
		for(int i = 0; i < a.length; i++) {
			b[i] = 1;
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i] < a[j]) b[i] += 1;
				}
			}
		System.out.println("¼®Â÷");
		for(int i = 0 ; i < a.length; i++)
			System.out.println(a[i] + " " + b[i] + "µî");
	}

}