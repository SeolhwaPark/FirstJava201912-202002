package exam;

import java.util.*;

import model.DataDAO;
import model.EmpVO;

public class Exam_12 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		List<EmpVO> vo = dao.exam_12();
		
		if(vo != null) {
			for(int x =0; x<vo.size();x++) {
			System.out.print(vo.get(x).getEname()+"\t");
			System.out.println();
			}
			
		}else {
			System.out.println("등록된 자료가 없음");
		}
		

	}

}
