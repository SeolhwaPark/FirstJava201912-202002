package oracle.exam2;
import java.util.List;

import oracle.dao.SaDAO;
import oracle.dto.EmpVO;

public class Exam_02 {
	public static void main(String[] args) {
		SaDAO sa = new SaDAO();
		List<EmpVO> list = sa.deptList();
		if(list.size()==0) {
			System.out.println("등록된 자료가 없음");
		}else {
			for(int x=0; x<list.size(); x++) {
				System.out.print(list.get(x).getEno() +"\t");
				System.out.print(list.get(x).getEname() +"\t");
				System.out.print(list.get(x).getJob() +"\t");
			}
		}
		
	}

}
