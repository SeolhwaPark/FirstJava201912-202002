package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_06 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_06();
		if(!list.isEmpty()) {
			//출력
			for(int x=0; x<list.size();x++) {
				System.out.print(list.get(x).getEname() +"\t");
				System.out.print(list.get(x).getJob() +"\t");
				System.out.print(list.get(x).getHiredate() +"\n");
			}
		}else {
			System.out.println("등록된 자료가 없음");
		}
	}

}
