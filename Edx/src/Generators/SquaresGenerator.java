package Generators;

//  Created by Bogdan Trif on 31-08-2017 , 9:13 PM.


import java.util.function.IntSupplier;
import java.util.stream.IntStream;


/*
Now, to save having to write nextN for every sequence we make,
we could create a new type which extends Iterator providing the nextN function.

The only problem we face here is that we have to save the batch in a list before we can operate on it.
Java 8 provides another way. Let’s go back and start again with the following code:


public class Squares3
{
        public static void main(String args[])
        {
                IntStream.rangeClosed(1, 10).map(i -> i * i)
                         .forEach(System.out::println);
        }
}

This uses IntStream to get the indexes of the sequence in a stream and calls map to convert them
into their squares. The problem is that to get more squares than the tenth we need to duplicate
the pipeline and start it off from the right place.
Let’s look at another way without using a range:


public static void main(String args[])
{
        IntStream myStream = IntStream.iterate(1, i -> i + 1);

        myStream.limit(10).map(i -> i * i)
                          .forEach(System.out::println);
}
This also generates the first 10 square numbers. This time it uses the iterate function.
This takes two parameters, the first is our initial value, and the second is a function defining
how to get to the next value from the previous.
It’s a good place to use a lambda function. We can even dispense of the map function
since we can undo squaring easily in iterate to get what the last index was:


public static void main(String args[])
{
        IntStream myStream = IntStream.iterate(1,
                i -> ((int) Math.pow(Math.sqrt(i) + 1, 2)));

        myStream.limit(10).forEach(System.out::println);
}

This solves one of the problems of having to buffer beforehand.
However, we need to use the limit operator on the stream to limit it to 10 items,
otherwise it would keep on going. Unfortunately this is a problem,
since once we’ve got the 10 the stream is ‘operated on’ and we can’t use it again to generate more.
If we try, we get an IllegalStateException. We’d have to create another stream to get more.

So how do we get around the problem of the stream being used up?
Instead of using IntStream’s iterate function, we can use generate instead.
IntStream’s generate function takes an instance of an IntSupplier.
IntSupplier has a getAsInt() function which returns the next int in the sequence which
is very much like our next() function.
Here is an example that prints the first 20 square numbers in two batches:

*/


public class SquaresGenerator {

    private static class SqSupplier implements IntSupplier    {
        int i = 0;

        @Override
        public int getAsInt()
        {
            i++;
            return i * i;
        }
    }

    public static void main(String args[])  {

        SqSupplier square = new SqSupplier();
        IntStream myStream = IntStream.generate(square);
//        IntStream myStream2 = IntStream.generate(sqSupplier);

        myStream.limit(10).forEach(System.out::println);
        System.out.println("-------------");
//        myStream2.limit(10).forEach(System.out::println);
    }
}