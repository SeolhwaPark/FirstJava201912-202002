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
		a.add(); //더하기
		a.sub(); //큰 수에서 작은 수를 빼기
		a.mul(); //곱하기
		a.div(); //큰수와 작은수를 나누기
		
	}

}
