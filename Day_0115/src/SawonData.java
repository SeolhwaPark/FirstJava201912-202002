
public class SawonData {
	void sourceDataPrint(Sawon[] s, int cnt) {
		System.out.println("사번 \t이름 \t급여");
		
		for (int i = 0; i < cnt; i++) {
			s[i].print();
		}
	}
	
	void sortDataPrint(Sawon[] s, int cnt, int n) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (n == 1) {
					if (s[i].pay > s[j].pay) { // 급여 오름차순
						Sawon temp = s[i]; // 주소
						s[i] = s[j];// 주소바꾸기
						s[j] = temp;
					}
				} else {
					if (s[i].pay < s[j].pay) { // 급여 내림차순
						Sawon temp = s[i]; // 주소
						s[i] = s[j]; // 주소바꾸기(객체와 객체바꾸기)
						s[j] = temp;
					}
				}
			}
		}
	}
	
}