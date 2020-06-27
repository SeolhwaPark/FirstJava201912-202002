package generics;
class Product<T,M>{
	private T kind;
	private M model;
	
	//╪бем╟ыем
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

}

class Car{
	
}
public class Exam_04 {
	public static void main(String[] args) {
		Product<String,Integer> p = new Product<String,Integer>();
		p.setKind("TV");
		p.setModel(19);
		
		Product<Car,Integer> pp = new Product<Car,Integer>();
		Car c = new Car();
		pp.setKind(c);
		pp.setModel(10);
		
		
		
		
		
		
		
	}

}
