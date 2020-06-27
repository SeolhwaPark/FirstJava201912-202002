//ERP관리시스템

public class Hak {
		int bun;
		String name;
		int score; //과목
		
		Hak(){} //생성자 오버로딩
			Hak(int bun, String name, int score){
			this.bun = bun;
			this.name = name;
			this.score = score;
			
			}
		void print() {
			System.out.println(bun + "\t"+ name + "\t"+ score);
		}
		void print(int sw) { //메소드 오버로딩
			System.out.println(sw+ "\t" + bun + "\t"+ name + "\t"+ score);
		}
	}
	

