
public class Exam_04 {
	public static void main(String[] args) {
		int [][] hak = {{1,90,89,79},{2,55,66,77},
				{3,56,78,89},{4,78,78,68}};
		String[] na = {"AAAA","BBBB","CCCC","DDDD"};
		
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		for(int x = 0; x < hak.length; x++) {
			System.out.print(hak[x][0]+"\t");
			System.out.print(na[x]+"\t");
		for(int y =0; y < hak[x].length; y++) {
			System.out.print(hak[x][y]+"\t");

		}
		System.out.print("\n");
		}
	}

}
