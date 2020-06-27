package test02;
abstract class Animal{
	String kind;
	
	void test() {
		System.out.print("��� �մϴ�.");
	}
	abstract void sound();
}

class Cat extends Animal{
	@Override //�ֳ����̼� == �ּ�
	void sound() {
		System.out.println("�ɳ�");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("�ۿ�");
	}
	
}

public class Exam_11 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		Dog d = new Dog();
		d.sound();
		
		Animal an = new Cat();
		an.sound();
		an = new Dog();
		an.sound();
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		animalSound(new Cat());
		animalSound(new Dog());
	}
	
	static void animalSound(Animal a) {
		a.sound();
	}

}
