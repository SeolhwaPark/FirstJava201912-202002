import java.util.Properties;

/*
 * ȯ�溯�� ����
 * �ü�����....
 */
public class Exam_05 {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.list(System.out);
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
/*
�ü�� �̸� :Windows 10
����� �̸� :lunas
����� Ȩ���丮 :C:\Users\lunas
 */
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("�ü�� �̸� :" + osName);
		System.out.println("����� �̸� :" + userName);
		System.out.println("����� Ȩ���丮 :" + userHome);
	}

}
