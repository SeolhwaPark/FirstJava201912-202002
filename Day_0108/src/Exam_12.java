/* 
 1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9

 */
public class Exam_12 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k = 0; //카운트(반복할 횟수세기)
		int c = 1; //역주행
		int i = 0;//세로
		int j = -1;//가로 //빼가면서 내려감
		int f = a.length; //반복횟수
		
		while(true) {	
			for(int n=0; n<f; n++) {
				k++;
				j+=c;//가로
				a[i][j] = k;//0.0부터 0.4까지 가려고함
			}
			f--; //칸수 줄임
			
			if(f<0) break; 
			for(int n=0; n<f; n++) {
				k++;
				i+=c;//세로
				a[i][j] = k;
			}
			c*=(-1); //역주행 4.4를 4.3이 되게 함
		}
		
		//출력
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[0].length; y++) {
				if (a[x][y] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(a[x][y] + "\t");
				}

			}
			System.out.println();
		}
		
		
		
		
		

	}

}
