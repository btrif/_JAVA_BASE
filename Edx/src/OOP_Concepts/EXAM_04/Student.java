package OOP_Concepts.EXAM_04;

/**
 * Created by Bogdan Trif on 02-05-2017 , 10:09 AM.
 */
public class Student {
    static int counter = 0;
    int id;

    public Student() {
        id = counter;
        counter++;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s1.id + "" + s2.id + "" + s3.id);
        System.out.println(s1.counter + "" + s2.counter + "" + s3.counter);
    }
}
