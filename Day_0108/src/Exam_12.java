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
