class Acount {
	int n;
	int m;

	void add() {
		int a = n + m;
	System.out.print(n + "+" + m + "=" + a +"\n");
	}
	void sub() {
		int a;
		if(n>m) {
			a = n - m;
		}else {
			a = m - n;
		}
		System.out.print(n + "-" + m + "=" + a+"\n");
	}
	void mul() {
		int a = n*m;
		System.out.print(n + "*" + m + "=" + a+"\n");

	}
	void div() {
		int a;
		if(n>m) {
			a = n / m;
			System.out.print(n + "/" + m + "=" + a+"\n");
		}else {
			a = m / n;
			System.out.print(m + "/" + n + "=" + a+"\n");

		}
	}

}
public class Exam_05 {
	public static void main(String[] args) {
		Acount a = new Acount();
		a.n = 100;
		a.m = 200;
		a.add(); //���ϱ�
		a.sub(); //ū ������ ���� ���� ����
		a.mul(); //���ϱ�
		a.div(); //ū���� �������� ������
		
	}

}
