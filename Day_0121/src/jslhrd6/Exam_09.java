package jslhrd6;

class Student1{
	int bun;
	String name;
	int score;
	
	public Student1(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}

	void print() {
		System.out.println(bun +  "\t" + name +  "\t" +score+ "\n");
	}
	
	@Override
	public String toString() {
		return bun +  "\t" + name +  "\t" + score;
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(1,"全辨导",90);
		Student1 s2 = new Student1(1,"全辨导",90);
		//System.out.print(s1.bun + "\t");
		//System.out.print(s1.name + "\t" );
		//System.out.print(s1.score + "\t");
		
		//String str = new String("AAAA");
		System.out.println("s1 :" + s1.hashCode());
		System.out.println("s2 :" + s2.hashCode());
		
		String str = "AAA";
		String str2 = new String("AAA");
		System.out.println("str :" + str.hashCode());
		System.out.println("srt2 :" + str2.hashCode());
	}

}
