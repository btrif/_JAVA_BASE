package EDX_UC3Mx_Part_II.WEEK_09.Class_Diagram_I;

//  Created by Bogdan Trif on 29-05-2017 , 10:55 AM.


public abstract class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String toString() {
        return "Color " + name;
    }

    public abstract GrayscaleColor toGrayscale();

}
