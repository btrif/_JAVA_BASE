package debug;

public class Car {

	private String brand;
	private int hp;
	
	public Car(String brand, int hp){
		this.brand = brand;
		this.hp = hp;
	}
	
	public String getBrand(){
		return this.brand;
	}
	
	public int getHP(){
		return this.hp;
	}
}
