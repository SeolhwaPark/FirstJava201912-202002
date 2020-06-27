package Student;

public class Student implements Comparable<Student> {
	int score;
	String hakbun,name;
	
	Student(String hakbun){
		this.hakbun=hakbun;
	}
	Student(String hakbun,String name,String score){
		this.hakbun=hakbun;
		this.name=name;
		this.score=Integer.parseInt(score);
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return hakbun.equals(s.hakbun);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return hakbun.hashCode();
	}
	
	
	@Override
	public String toString() {
		char grade=' ';
		if(score>=90) grade ='A';
		else if(score>=80) grade ='B';
		else if(score>=70) grade ='C';
		else if(score>=60) grade ='D';
		else if(score<60) grade ='F';	
		if(hakbun.length()==4) {
			return hakbun.charAt(0)+"-"+hakbun.charAt(1)+"-"+hakbun.charAt(2)+hakbun.charAt(3)
					+"\t"+name+"\t\t"+score+"\t"+grade;
		}
		else return hakbun.charAt(0)+"-"+hakbun.charAt(1)+"-"+hakbun.charAt(2)
					+"\t"+name+"\t\t"+score+"\t"+grade;
	}
}
