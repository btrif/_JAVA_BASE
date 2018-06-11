package EDX_UC3Mx_Part_II.WEEK_07.EXAM_07;

//  Created by Bogdan Trif on 23-05-2017 , 7:47 PM.


class Foo {
    int n_even = 0;
    int n_odd  = 0;

    public void count(int number){
        if (number%2 == 0)
            n_even++;
        else
            n_odd++;
    }


    public static void main(String[] args) {
        Foo a = new Foo();
        a.count(5) ;

    }

}
