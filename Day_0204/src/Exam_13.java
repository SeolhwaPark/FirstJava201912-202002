import java.util.HashMap;
import java.util.Map;

/*
 * Map 키와 값
 * 키에는 기본자료형을 그대로 못넣음
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
		if (map.containsKey(id)) { // 포함하는지 확인하는거
			System.out.println("ID가 있음");
			if (map.get(id).equals(pass)) { // 뽑아온 값
				System.out.println("로그인");
			} else {
				System.out.println("비밀번호 없음");
			}
		} else {
			System.out.println("ID가 없음");
		}

	}
}
