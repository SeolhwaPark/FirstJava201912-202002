package student;

public class HakExam {

	public static void main(String[] args) {
		Hak h = new Hak();
		h.setNumber(1);
		h.setName("ȫ�浿");		
		h.setKor(100);
		h.setEng(100);
		h.setMat(100);
		
		System.out.println("��ȣ :"+ h.getNumber());
		System.out.println("�̸� :"+ h.getName());
		System.out.println("���� :"+ h.getKor());
		System.out.println("���� :"+ h.getEng());
		System.out.println("���� :"+ h.getMat());
	}

}
