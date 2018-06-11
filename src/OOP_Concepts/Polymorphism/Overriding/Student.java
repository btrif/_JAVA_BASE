package OOP_Concepts.Polymorphism.Overriding;

/**
 * Created by Bogdan Trif on 02-05-2017 , 11:46 PM.
 */

//Overriding equals() (non graded activity)
//The following code implements an object that represents students from an academy which has school years:

class Student{
    private String fullName;
    private int year;
    private double mark;

    /**
     * Constructor of a new student instance
     * @param theFullName Full name of the student
     * @param theYear An integer indicating the year (must be between 1 and 5)
     */
    public Student (String theFullName, int theYear){
        fullName=theFullName;
        year=theYear;
    }

    /**
     * Sets the mark of the student for this year
     * @param theMark The new mark achieved by the student (must be between 0 and 20)
     */
    public void calify (double theMark){
        mark=theMark;
    }


    //From the academic point of view, two students are identical if they belong to the same school year
//and have achieved the same mark. Given this assumption,
//we want to override the equals() method in the Student class so that it returns true
//when a student (this) is equal to another student (given as parameter to the method).


    /**
     * Compares this student with another, given as parameter.
     * Returns true if both students belong to the same year
     * and have achieved the same mark.
     * @parameter other The other Student to which this student is compared
     */
    public boolean equals(Student other){
        return mark == other.mark && year == other.year ;
    }

    public static void main(String[] args){
        Student stud1 = new Student("Radu", 1987) ;
        Student stud2 = new Student("Sorin", 1987) ;
        System.out.println(stud1.mark);
        System.out.println("Before assigning the marks : \t" + stud1.equals(stud2) );
        stud1.calify(9.5);
        stud2.calify(8.5);
        if (! stud1.equals(stud2) ){
            System.out.println("No ! Because student " + stud1.fullName + " has a " + stud1.mark +
            " and student " + stud2.fullName + " has a " + stud2.mark);
        }
        System.out.println("After assigning the marks : \t" + stud1.equals(stud2) );
    }
}

