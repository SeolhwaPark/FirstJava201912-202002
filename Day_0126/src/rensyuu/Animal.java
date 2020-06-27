package rensyuu;

public class Animal {
	String name = "tokujirou";
	String color = "white";
	
	public String getInfo() {
		return this.getInfo("%s는 %s색의 햄스터입이다.");
	}
	
	public String getInfo(String format) {
		return String.format(format, this.name, this.color);
	}
}


