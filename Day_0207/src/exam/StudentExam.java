package exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class StudentExam {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:\\data\\data.txt"));
		TreeSet<Student> set = new TreeSet<Student>();

		while (true) {
			String data = br.readLine();
			if (data == null)
				break;
			String[] arr = data.split(",");
			Student s = new Student(arr);
			set.add(s);
		}

		PrintWriter pwf = new PrintWriter(new BufferedWriter(new FileWriter("c:\\data\\dataout.txt")));
		System.out.println("번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
		for (Student s : set) {
			System.out.println(s);
			pwf.println(s);
		}
		pwf.close();
	}
}
