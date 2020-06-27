package textstream;

public class Student {
	int bun ;
	String name;
	String gender;
	int score[] = new int[3];
	int tot;
	double ave;
	
	Student(){}
	
	Student(String[] arr){
		this.bun = Integer.parseInt(arr[0]);
		this.name = arr[1];
		
		if(arr[2].equalsIgnoreCase("m")) {
			this.gender = "남자";
		}else {
			this.gender = "여자";
		}
		for (int x = 0; x < 3; x++) {
			this.score[x] = Integer.parseInt(arr[x+3]);
			tot += score[x];
		}
		ave = ((int) (tot / 3. * 100)) / 100.;
	}
	
	@Override
	public String toString() {
		return bun + "\t" + name + "\t"+ gender+ "\t" + score[0] + "\t" 
				+ score[1] + "\t" + score[2] +"\t" + tot + "\t" + ave;
	}
}
