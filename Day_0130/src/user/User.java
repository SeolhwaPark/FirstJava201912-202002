package user;
/*
 * Ŭ�����迭�� �̟G�� �˻���� ����
 
 ȸ�������Է�
 ȸ���̸�
 ȸ�� id
 �̸���
 
 ȸ�� ��ü�������
 ������ȣ �̸� id �̸���
 
 ó������
 ȸ�������� 10���̸� �Է°��� null�̰ų� "end"�̸� �Էµ� ȸ�������� ��� ���
 ȸ������ �Է½� ���̵� �ߺ��� �Ұ� ���̵� �ߺ��� ����ϰ� �ٽ��Է�  -> ?
 ������ȣ�� �Է¼��� �°� �ڵ����� ��ϵǵ��� �Ѵ�  
 ȸ��������½� ��ü�̸����� ��µǵ��� �Ѵ� �޼ҵ�ȣ�� �Ұ�   
 
 ��ȸ
 �˻������ end ��ҹ��ڱ��� ����
 �˻� : ID �Է��� ����
 �����ϸ� ��������ϰ� ������ �ش��������� ���
 */
public class User implements Comparable<User>{
	String name; 
	String userId;
	String email;
	int goyu;

	User(String a){
		userId=a;
	}
	
	User(String name, String userId, String email ){
		this.name = name;
		this.userId = userId;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "������ȣ:" +goyu + "\t����:"+ name +"\tID:"+ userId + "\tE-Mail:"+email;
		
	}
	@Override
	public int compareTo(User o) {
		return userId.compareTo(o.userId);
	}
}
