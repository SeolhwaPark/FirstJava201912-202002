package mem;
/*
* nextLine ������ �־ ���͸� ĥ �� ����..
* 
* 
* �Է�
* �ڷ��Է� : ȫ�浿, 900206-1, 010-2242-3810

*��� 1 spilt 2.substring
* Integer.parseInt ���ڸ� ������
*
* ó������
* �Է��� 1���ξ� �Է�
* 
* ����üũ
* 1900~1999 1��2�� 2000~2099 3��4��
* �ܱ��� 5,6 / 7,8
* 
* ���
* �̸� 	��ȭ 			 	���� 		����
* ȫ�浿 	010-2242-3810	 �� 	 	30
* 
* 'end'�Է��ڷ��� �� , ��������� �°� ���
* �Է��� �ִ� 10��
* ȸ������ MemberŬ���� , ȸ������ �迭ó�� Ŭ������ MemberData, ����Ŭ�����¸�� MemberExam
*/
public class Member {
	String name; //�̸�
	String number; //�ֹι�ȣ
	String bangou; //��ȭ
	
	Member(){
	}
	
	Member(String name, String number,String bangou){
		this.name = name;
		this.number = number;
		this.bangou = bangou;
	}
	
	public String toString() { 
		return name + "\t " + number + "\t" + bangou;
	}
	
}
