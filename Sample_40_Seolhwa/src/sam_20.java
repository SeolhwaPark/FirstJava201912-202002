
public class sam_20 {
	public static void main(String[] args) {
		
		for(int x = 1; x<=5; x++) { //��
			for(int y = 1; y<=x; y++) { //����
				System.out.print(" ");
			}
			for(int z = 1; z <= 6-x; z++) { //�� ������ ĭ
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
