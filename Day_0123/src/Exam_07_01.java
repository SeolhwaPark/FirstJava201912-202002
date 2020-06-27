
public class Exam_07_01 {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		int cnt = 0;
		
		while(cnt<lotto.length) {
			boolean flag = false;//중복확인용
			int var = (int)(Math.random()*45)+1;
			//중복검사 넣으면서 검사하는 구조
			for(int x=0; x<=cnt; x++) {
				if(var == lotto[x]) {//중복이 있다면
					flag = true; 
					break;
				}
			}
			if(!flag) {//중복이 아니라면
				lotto[cnt] = var;
				cnt++;
			}
			
		}
		
		for(int x = 0; x< lotto.length; x++) {
			System.out.println(lotto[x] + "\t");
		}

	}

}
