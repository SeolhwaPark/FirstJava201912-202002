/*
 * 
 */
public class Exam_13 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int x = -1;//가로
		int y = 0;//세로
		int cnt = 0;//반복될 횟수 카운트
		int c = a.length;//반복할 횟수
		int d = 1;//역주행할 애
		
		while(true) {
			for(int n=0; n<c; n++ ) {
				cnt++;
				x+=d; //-1+1=0 // 0.0부터 횟수를 넣으려고
				a[y][x] = cnt; //배열안에 횟수가 반복해야할 횟수
			}
			c--; //횟수를 줄임 
			if(c<0) break;
			for(int n=0; n<c; n++ ) {
				cnt++;
				y+=d;
				a[y][x] = cnt;
			}
			d*=(-1);
		}
		
		//출력
		for(int n=0; n<a.length; n++) 
		{
			for(int m=0; m<a[0].length; m++)
			{
				System.out.print(a[n][m] + "\t");
			}
			System.out.println();
		}
	}
}
/*
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


*/