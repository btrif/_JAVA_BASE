package WEEK_06.Errors;

/**
 * Created by Bogdan Trif on 08-05-2017 , 7:52 PM.
 */
public class Car {
    private String brand;
    private String horsepower;

    public Car(String brand, String horsepower) {
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public String getHorsePower(String brand)    {
        if( brand.equals("Volvo") ) {
        return horsepower+20 ;
    } else {
        return horsepower ;
    }

}
}
