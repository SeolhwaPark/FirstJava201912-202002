/*
 * �迭�� ����� data �߿���  ���� ū ���� ���� ���� �� ã��
 */
public class Exam_06 {
	public static void main(String[] args) {
		int array[] = {90,77,56,78,69,56,95,88,56,93,16,89,67,77}; //���ǵ�����
		System.out.println("array data list");
		for(int i=0; i<array.length; i++) {
			if(i%7==0) {
				System.out.print("\n");
			} 
			System.out.print(array[i] + "\t");
		}
		//�ִ� �ּ� ã��
		int max = array[0]; //�ִ�
		int min = array[0]; //�ּ�
		
		for(int i=1; i<array.length; i++) {
			if(max < array[i]) {
				max = array [i];
			}
			if(min > array[i]) {
				min = array [i];
			}
		}
			System.out.print("\n max = " + max);
			System.out.print("\n min = " + min);

	}

}