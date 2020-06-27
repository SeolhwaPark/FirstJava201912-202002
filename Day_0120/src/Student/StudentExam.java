package Student;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		
		//ÀÔ·Â
		
		int arr[] = {52,89,45,88,66,31,12,4,5};
		StudentHak s = new StudentHak(5,"È«±æµ¿",arr);
		s.account();
		s.scoreMax();
		s.scoreBubble();
		s.scoreSelection();
	}

}
