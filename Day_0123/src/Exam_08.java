
public class Exam_08 {
	public static void main(String[] args) {
		/*
		 * Math.random() -- > 0~10 ������ ����
		 */
		int[] lotto = new int[6];
		for(int x=0; x<lotto.length; x++) {
			lotto[x] = (int)(Math.random()*45)+1;
		//�ߺ��oũ
			for(int y=0; y<x; y++) { //0��°�� ��
				if(lotto[x] == lotto[y]) {
					x--;
					break; //�迭�ȿ� ���� ������ �ٸ� ���� �������
					//�ְ��� ���ϴ� ����
				}
			}
		}
		for(int x = 0; x< lotto.length; x++) {
			System.out.println(lotto[x] + "\t");
		}
	}
}
