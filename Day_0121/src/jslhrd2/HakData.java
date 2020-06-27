package jslhrd2;

public class HakData extends Hak implements Account {

	HakData(){}
	
	HakData(int bun, String name, int score){
		System.out.print("번호\t이름\t점수\t합계\t평균\n");
		System.out.println(bun +"\t"+ name+ "\t" +score +"\t" + score +"\t"+ score);
	}
	
	HakData(int bun, String name, int arr[]){
		System.out.print("번호\t이름\t점수\t\t\t\t\t합계\t평균\n");
		int sum = 0;
		double ave = 0;
		
		for(int x = 0; x<arr.length; x++) {
			sum += arr[x];
		}
		ave = sum/(double)arr.length;
		
		System.out.print(bun +"\t"+ name+ "\t" );
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+"\t");
		}
		System.out.println(sum +"\t"+ ave);
	}
	
	@Override
	public void total(int score) {	
		
	}

	@Override
	public void total(int[] score) {
		
	}
}
