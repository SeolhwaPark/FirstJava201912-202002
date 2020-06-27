package rensyuu;

class AA{
	int bun;
	int [] score;
	AA(){}
	AA(int bun, int[] score){
		this.bun = bun;
		this.score = score;
	}
}

class AAdata{
	AA[] var;
	
	AAdata(){}
	
	AAdata(AA[] var){
		this.var = var;
	}
	
	//메소드 추가
	
	void sourceData() { 
		System.out.println("번호\t점수");
		for(int x=0; x<var.length; x++) {
			System.out.print(var[x].bun + "\t");
			for(int y = 0; y<var[x].score.length; y++) {
				System.out.print(var[x].score[y] + "\t");
			}
			System.out.println();
		}
	}
	
	void sortData() {
		for(int x=0; x<var.length; x++) {
			for(int y = 0; y<var[x].score.length-1; y++) {
				for(int z = y + 1; z < var[x].score.length; z++ ) {
					if(var[x].score[y] > var[x].score[z]) {
						int temp = var[x].score[y];
						var[x].score[y] = var[x].score[z];
						var[x].score[z] = temp;
					}
				}
			}
		}
		sourceData();
	}
}
public class Sample_04 {
	public static void main(String[] args) {
		AA[] var = new AA[5];
		var[0] = new AA(4,new int[] {55,67,53,78,70});
		var[1] = new AA(1,new int[] {45,77,93,96,40});
		var[2] = new AA(5,new int[] {56,68,58,88,50});
		var[3] = new AA(3,new int[] {68,86,46,86,80});
		var[4] = new AA(2,new int[] {60,69,54,85,60});
		
		AAdata data = new AAdata(var);
		data.sourceData();
		/*
		 * 번호 점수 
		 * 4
		 * 1
		 */
		
		data.sortData();
		/*
		 * 점수만 오름차순 정렬
		 */
	}

}
