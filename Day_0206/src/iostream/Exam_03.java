package iostream;

import java.io.File;

public class Exam_03 {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work\\test.txt");
		if (f.exists()) {
			f.deleteOnExit(); //메인프로그램 종료시 삭제
			System.out.println("파일명:" + f.getName());
			System.out.println("파일경로:" + f.getPath());//파일이름도 나옴
			System.out.println("파일경로:" + f.getParent()); //걍 경로만 나옴
			System.out.println("파일크기:" + f.length()+"kb");
			System.out.println("파일최고수정일:" + f.lastModified());
		}else {
			System.out.println(f.getName() + "가 없음");
		}
		
		
		
	}

}
