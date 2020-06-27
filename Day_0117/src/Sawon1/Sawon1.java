package Sawon1;

/*
 * 키보드로 사원정보를 입력받아서 부서별 급여합계를 출력
 * 
 * 사원정보 : 부서명 사원번호 사원이름 급여
 * 입력자료 예시 입력은 부서순으로 입력
 * 사원정보 : 인사 1101 AAAA 358000
 * 
 * 부서명이 "end" 또는 "END"이면 전체자료 출력 후 종료
 * 부서가 동일한 경우 첫번째 사원만 부서명을 출력
 * 부서가 바뀌면서 부서별 급여 합계 출력
 * 마지막에는 전체 급여합계를 출력한다
 */
public class Sawon1 {
//private사용

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

	// 자기자신출력
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
