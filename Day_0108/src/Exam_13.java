/*
 * 
 */
public class Exam_13 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int x = -1;//����
		int y = 0;//����
		int cnt = 0;//�ݺ��� Ƚ�� ī��Ʈ
		int c = a.length;//�ݺ��� Ƚ��
		int d = 1;//�������� ��
		
		while(true) {
			for(int n=0; n<c; n++ ) {
				cnt++;
				x+=d; //-1+1=0 // 0.0���� Ƚ���� ��������
				a[y][x] = cnt; //�迭�ȿ� Ƚ���� �ݺ��ؾ��� Ƚ��
			}
			c--; //Ƚ���� ���� 
			if(c<0) break;
			for(int n=0; n<c; n++ ) {
				cnt++;
				y+=d;
				a[y][x] = cnt;
			}
			d*=(-1);
		}
		
		//���
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
		int k = 0; //ī��Ʈ(�ݺ��� Ƚ������)
		int c = 1; //������
		int i = 0;//����
		int j = -1;//���� //�����鼭 ������
		int f = a.length; //�ݺ�Ƚ��
		
		while(true) {	
			for(int n=0; n<f; n++) {
				k++;
				j+=c;//����
				a[i][j] = k;//0.0���� 0.4���� ��������
			}
			f--; //ĭ�� ����
			
			if(f<0) break; 
			for(int n=0; n<f; n++) {
				k++;
				i+=c;//����
				a[i][j] = k;
			}
			c*=(-1); //������ 4.4�� 4.3�� �ǰ� ��
		}
		
		//���
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