package student;

public class Student {
	int bun;
	String name;
	int score;
	String[] jj;
	int[] dap = new int[20];
	String[] ox = new String[20];
	
	Student() {
	}
	
	Student(String[] jj){
		bun = Integer.parseInt(jj[0]);
		name = jj[1];
		
		for(int i = 2; i<jj.length; i++) {
			dap[i-2] = Integer.parseInt(jj[i]);
		}
	}
}
