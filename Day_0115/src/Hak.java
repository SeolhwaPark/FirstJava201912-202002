//ERP�����ý���

public class Hak {
		int bun;
		String name;
		int score; //����
		
		Hak(){} //������ �����ε�
			Hak(int bun, String name, int score){
			this.bun = bun;
			this.name = name;
			this.score = score;
			
			}
		void print() {
			System.out.println(bun + "\t"+ name + "\t"+ score);
		}
		void print(int sw) { //�޼ҵ� �����ε�
			System.out.println(sw+ "\t" + bun + "\t"+ name + "\t"+ score);
		}
	}
	

