package group;

/*����ó �����
 �Է�
 �׷� �̸� ��ȭ��ȣ �������
 ���
(1)��ü��ȸ (2)�׷���ȸ (3)������ȸ (4)�̸���ȸ -> ���ý� �ش������ ���
 */
public class Renraku {
	String group; //�׷�
	String name; //�̸�
	int bangou; //��ȭ��ȣ
	int seinen; //�������
	
	Renraku(){}
	
	Renraku(String group, String name, int bangou, int seinen){ 
		//()��ȣ�ȿ����� �Ű�����. ��������ִ� ��
		this.group = group;
		this.name = name;
		this.bangou = bangou;
		this.seinen = seinen;	
	}
	
	void print() {
		System.out.print(group + "\t" + name + "\t" + bangou + "\t" + seinen + "\n");
		
	}

}
