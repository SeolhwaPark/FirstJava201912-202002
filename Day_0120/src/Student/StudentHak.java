package Student;

//���

public class StudentHak extends Student{
	public StudentHak(int bun, String name, int[] jum) {
		super(bun, name, jum);
	}
	@Override
	void account() {//���� ��� �Ҽ��� ��°�ڸ� �� ����� ����ϴ� �޼ҵ�
		int sum = 0;
		
		for(int x = 0; x < jum.length; x++) {
			sum += jum[x];
		}
		ave = (double)sum/jum.length;
		
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + ((int)(ave*100))/100.);
	}
	@Override
	void scoreMax() {//���� �ִ� �ּҸ� ���Ͽ� �⤩��
		int max = jum[0];
		int min = jum[0];
		
		for(int x = 0; x < jum.length ; x++) {
			if(jum[x] > max) {
				max = jum[x];
			}else if(jum[x] < min){
				min = jum[x];
			}
		}
		System.out.println("MAX = " + max);
		System.out.println("MIN = " + min);
		
	}@Override
	void scoreBubble() {// ���������� �̿��Ͽ� ���� ��������
	
		for(int x=0; x<jum.length-1; x++) { 
			for(int y=0; y<jum.length-(x+1); y++) { 
				if(jum[y]<jum[y+1]) {
					int temp = jum[y];
					jum[y] = jum[y+1];
					jum[y+1] = temp;
				}
			}
		}
		System.out.print("BubbleSort : " );
		for(int x=0; x<jum.length;x++) {
			System.out.print(jum[x] + "\t");
		}
	}

	@Override
	void scoreSelection() {// ���������� �̿��Ͽ� ���� ��������
	for(int x=0; x<jum.length;x++) {
			System.out.print(jum[x] + "\t");
		}
		System.out.println();
		for(int x=0; x<jum.length-1; x++) {
			for(int y=x+1; y<jum.length; y++) {
				if(jum[x] > jum[y]) {
					int temp = jum[x];
					jum[x] = jum[y];
					jum[y] = temp;
				}
			}
		}
		System.out.print("SelectionSort : ");
		for(int x=0; x<jum.length;x++) {
			System.out.print(jum[x] + "\t");
		}
	}
}