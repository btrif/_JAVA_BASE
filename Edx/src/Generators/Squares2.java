package Generators;

//  Created by Bogdan Trif on 28-08-2017 , 8:31 PM.

/*
Let’s expand on the example to allow getting a batch of results.
This is easy – create a nextN function which calls next() a number of times and returns
the results in say a List:
 */

import java.util.ArrayList;
import java.util.List;

public class Squares2
{
    private int i = 1;

    public int next()
    {
        int thisOne = i++;
        return thisOne * thisOne;
    }

    public List<Integer> nextN(int n)
    {
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            l.add(next());
        }

        return l;
    }

    public static void main(String args[])
    {
        Squares2 squareGenerator = new Squares2();

        squareGenerator.nextN(10).forEach(System.out::println);
    }
}


/*
A few points:

Notice in the nextN function there is the empty diamond in the new ArrayList statement.
This was added in Java 7 to save having to state the type both on the left and the right hand side;
the compiler now works it out.
List is an Iterable, and Iterable now has a forEach() method which was added in Java 8.
We could use stream() as before to create a stream,
but if all we want to do is pass the contents to a function forEach() does nicely.
Now, to save having to write nextN for every sequence we make,
we could create a new type which extends Iterator providing the nextN function.

The only problem we face here is that we have to save the batch in a list before we can operate on it.
Java 8 provides another way.
 */