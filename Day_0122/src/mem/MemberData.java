package mem;


/*

* ���
* �̸� 	��ȭ 			 	���� 		����
* ȫ�浿 	010-2242-3810	 �� 	 	30
* 
* 'end'�Է��ڷ��� �� , ��������� �°� ���
* �Է��� �ִ� 10��
* ȸ������ MemberŬ���� , ȸ������ �迭ó�� Ŭ������ MemberData, ����Ŭ�����¸�� MemberExam
*/
public class MemberData {
	Member[] mem; // ȸ�������� �迭�� �� Ŭ����
	int cnt;
	
	MemberData(){}
	MemberData(Member[] m, int cnt){
		mem = m;
		this.cnt = cnt;
	}
	
	//����׽�Ʈ
	
	/*void testPrint() {
		System.out.println("�̸�\t�ֹι�ȣ\t��ȭ��ȣ");
		for(int x = 0 ; x<cnt; x++) {
			System.out.println(mem[x]);
		}
		System.out.println();
		for(int x = 0; x<cnt; x++) {
			System.out.println(mem[x].name + "\t" + mem[x].bangou );
		}
	}
	*/
	void memPrint() {
		System.out.println("�̸�\t��ȭ��ȣ\t����\t����");
		for(int x = 0; x<cnt; x++) {
			System.out.print(mem[x].name + "\t" + mem[x].bangou +"\t" );
			
			//����,�������
			String str = mem[x].number.substring(7);
			
			int year = 0;
			if(str.equals("1")) {
				System.out.print("��\t" );
				year = 1900;
			}else if(str.equals("2")){
				System.out.print("��\t" );
				year = 1900;
			}else if(str.equals("3")){
				System.out.print("��\t" );
				year = 2000;
			}else if(str.equals("4")){
				System.out.print("��\t" );
				year = 2000;
			}else if(str.equals("5")){
				System.out.print("��\t" );
				year = 1900;
			}else if(str.equals("6")){
				System.out.print("��\t" );
				year = 1900;
			}else if(str.equals("7")){
				System.out.print("��\t" );
				year = 2000;
			}else if(str.equals("8")){
				System.out.print("��\t" );
				year = 2000;
			}
			int ydate = Integer.parseInt(mem[x].number.substring(0,2)); //����
			int age = 2020 - (year+ydate); //���̰��
			System.out.print(age);
		}
	}
	
}
