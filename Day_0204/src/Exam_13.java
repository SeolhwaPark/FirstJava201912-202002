import java.util.HashMap;
import java.util.Map;

/*
 * Map Ű�� ��
 * Ű���� �⺻�ڷ����� �״�� ������
 */
public class Exam_13 {
	public static void main(String[] args) {
		// Map<String, Integer>
		Map<String, String> map = new HashMap<String, String>();

		map.put("Java", "90"); // id,pw
		map.put("Jvp", "96");
		map.put("Servlet", "88");
		map.put("Spring", "59");
		map.put("Linux", "95");

		String id = "Java";
		String pass = "90";
		if (map.containsKey(id)) { // �����ϴ��� Ȯ���ϴ°�
			System.out.println("ID�� ����");
			if (map.get(id).equals(pass)) { // �̾ƿ� ��
				System.out.println("�α���");
			} else {
				System.out.println("��й�ȣ ����");
			}
		} else {
			System.out.println("ID�� ����");
		}

	}
}
