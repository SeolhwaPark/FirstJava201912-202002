
public class GakuseiData {
	Gakusei[] gaku;
	int cnt;
	
	GakuseiData(){
	}
	
	GakuseiData(Gakusei[] gak, int cnt){
		gaku = gak;
		this.cnt = cnt;		
	}
	
	void gakuseiRank(Gakusei[] gak, int cnt){
		for(int x = 0; x < cnt ; x++) {
			int r = 1;
			for(int y = 0; y < cnt; x++) {
				if(gaku[x].tot < gaku[y].tot) {
				r++;
				}
			}
			gaku[x].rank = r;
		}
	}
	
	void sortRank(Gakusei[] gak, int cnt){
		for(int x = 0; x< cnt -1 ; x++) {
			for(int y = x +1 ; y < cnt ; y++) {
				if(gaku[x].rank > gaku[y].rank) {
					Gakusei temp = gaku[x];
					gaku[x] = gaku[y];
					gaku[y] = temp;
				}
			}
		}
	}
	
	void gakuseiPrint(){
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x=0; x<cnt ; x++) {
			System.out.print(gaku[x].bunho + "\t");
			System.out.print(gaku[x].name + "\t");
			System.out.print(gaku[x].kor + "\t");
			System.out.print(gaku[x].eng + "\t");
			System.out.print(gaku[x].mat + "\t");
			System.out.print(gaku[x].tot + "\t");
			System.out.print(gaku[x].ave + "\t");
			System.out.print(gaku[x].rank + "\n");			
		}
	}

	
	
	
	}

