package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_10 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_10();
		if(!list.isEmpty()) {
			//���
			for(int x=0; x<list.size();x++) {
				System.out.print(list.get(x).getEname() +"\t");
				System.out.print(list.get(x).getJob() +"\n");
			}
		}else {
			System.out.println("��ϵ� �ڷᰡ ����");
		}

	}

}