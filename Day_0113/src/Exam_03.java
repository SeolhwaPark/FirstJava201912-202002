//�Ӽ��� ����
class AA{
	int x; //��� �Ǵ� �ν��Ͻ�
	int y;
	
}

//��ɸ� ����
class BB{
	int sum() {
		int x = 100; //��������, �޼ҵ��� �۾��� ������ �Ҹ��
		return x;
	}
	void test (int n) { //n �Ű�����,����
		System.out.println("n =" + n);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		int a; //�׳� ����
		
		AA aa = new AA();//��ü�� ������ �� �޸𸮿� �����
		BB bb = new BB();
		aa = new AA() ; //������� �ʴ� ��ü�� ������ ����°� ������ �ݷ��� 
		aa.x=10;
		int s = bb.sum();//ȣ��� �� ������ ������ �������
		
		
	}

}
