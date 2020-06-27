package exam;

import model.DataDAO;
import model.EmpVO;

public class Exam_04 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		EmpVO vo = dao.exam_04();
		
		if(vo != null) {
			System.out.print(vo.getEname()+"\t");
			System.out.print(vo.getDno()+"\n");
			
		}else {
			System.out.println("등록된 자료가 없음");
		}
		
	}

}
