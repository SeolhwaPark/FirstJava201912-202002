
public class Exam_07_01 {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		int cnt = 0;
		
		while(cnt<lotto.length) {
			boolean flag = false;//�ߺ�Ȯ�ο�
			int var = (int)(Math.random()*45)+1;
			//�ߺ��˻� �����鼭 �˻��ϴ� ����
			for(int x=0; x<=cnt; x++) {
				if(var == lotto[x]) {//�ߺ��� �ִٸ�
					flag = true; 
					break;
				}
			}
			if(!flag) {//�ߺ��� �ƴ϶��
				lotto[cnt] = var;
				cnt++;
			}
			
		}
		
		for(int x = 0; x< lotto.length; x++) {
			System.out.println(lotto[x] + "\t");
		}

	}

}
