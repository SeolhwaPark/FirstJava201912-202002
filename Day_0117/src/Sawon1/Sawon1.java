package Sawon1;

/*
 * Ű����� ��������� �Է¹޾Ƽ� �μ��� �޿��հ踦 ���
 * 
 * ������� : �μ��� �����ȣ ����̸� �޿�
 * �Է��ڷ� ���� �Է��� �μ������� �Է�
 * ������� : �λ� 1101 AAAA 358000
 * 
 * �μ����� "end" �Ǵ� "END"�̸� ��ü�ڷ� ��� �� ����
 * �μ��� ������ ��� ù��° ����� �μ����� ���
 * �μ��� �ٲ�鼭 �μ��� �޿� �հ� ���
 * ���������� ��ü �޿��հ踦 ����Ѵ�
 */
public class Sawon1 {
//private���

	private String busyo;
	private String name;
	private String sabun;
	private int pay;
	int arr[] = new int[10];

	public Sawon1() {
	}

	public Sawon1(String busyo, String name, String sabun, int pay) {
		this.busyo = busyo;
		this.name = name;
		this.sabun = sabun;
		this.pay = pay;
	
	}

	// �ڱ��ڽ����
	public String getBusyo() {
		return busyo;
	}

	public void setBusyo(String busyo) {
		this.busyo = busyo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	void print() {
		int syou;
		int amari;
		int sihei = 50000;
		int kane = pay;
		boolean sw = true;
		int cnt = 0;

		for (int x = 0; x < arr.length; x++) {
			if (sw == true) {
				arr[x] = kane / sihei;
				amari = kane % sihei;
				sihei = sihei / 5;
				kane = amari;
				sw = false;
			} else {
				arr[x] = kane / sihei;
				amari = kane % sihei;
				sihei = sihei / 2;
				kane = amari;
				sw = true;
			}
		}
		for (int y = 0; y < arr.length; y++) {
			System.out.print(arr[y] + "\t");
		}
		System.out.println();
	}

}
