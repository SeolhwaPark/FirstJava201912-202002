import java.util.Properties;

/*
 * 환경변수 수집
 * 운영체재관련....
 */
public class Exam_05 {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.list(System.out);
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
/*
운영체재 이름 :Windows 10
사용자 이름 :lunas
사용자 홈디렉토리 :C:\Users\lunas
 */
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("운영체재 이름 :" + osName);
		System.out.println("사용자 이름 :" + userName);
		System.out.println("사용자 홈디렉토리 :" + userHome);
	}

}
