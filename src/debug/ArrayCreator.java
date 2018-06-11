package debug;

public class ArrayCreator {
	private Car[] cars;
	
	public ArrayCreator(int number){
		cars = new Car[number];
	}
	
	public void fillArray(){
		String b = null;
		for(int i=0; i<cars.length; i++){
			int brand = (int) (Math.random() * 5);
			int hp = (int) (Math.random() * 205);
			
			if(brand == 4){
				cars[i] = null;
			}else{
				if(brand==3)
				{
					b = "Kia";
				}else if(brand==2){
					b = "Fiat";
				}else if(brand==1){
					b = "Renault";
				}else{
					b = "Audi";
				}
				Car c = new Car(b,hp);
			cars[i] = c;
			}
		}
	}
	
	public Car[] getArray(){
		return cars;
	}
	
	public Car getCar(int i){
		return cars[i];
	}
	
	public int getSize(){
		return cars.length;
	}
}
