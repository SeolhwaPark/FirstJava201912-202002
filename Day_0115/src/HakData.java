//��

public class HakData {
	Hak [] hak; // �л��迭�� ��� ���� 
		
	HakData(){
	}
	HakData(Hak[] hak){
		this.hak = hak;
	}
	
	void print() {

		for(int x=0; x<hak.length; x++) {
		 System.out.println(hak[x].bun + "\t");

		 System.out.println(hak[x].name + "\t");

		 System.out.println(hak[x].score + "\t");
		 
		 /*
		  hak[x].print(); 
		  
		  */
		}
	}
	
}
