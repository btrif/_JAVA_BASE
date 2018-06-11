package Generators;

//  Created by Bogdan Trif on 28-08-2017 , 8:32 PM.

/*
https://thecannycoder.wordpress.com/2014/07/04/generators/

Today we’ll look at creating generators. In simple terms, a generator is a function which returns
the next value in a sequence. Unlike an iterator, it generates the next value when needed,
rather than returning the next item of a pre-generated collection.
Some languages such as Python support generators natively via keywords such as yield.
When a generator’s next value is requested in Python, the generator function continues to run
until the next yield statement, where a value is returned.
The generator function is able to continue where it left off which can be quite confusing for the uninitiated.
So how to do something similar in Java?

We saw in the last article that we can use an IntStream to generate a simple set of numbers,
but we had to generate them all up front. That’s fine if we know how many we’re going to need.
What if we don’t, and we want to be able to get the next whenever we like?
This is where a generator comes in.

Let’s choose a simple infinite sequence, the square numbers. In a standard Java implementation
we’d end up with something like the following:
 */

public class Squares
{
    private int i = 1;

    public int next()
    {
        int thisOne = i++;
        return thisOne * thisOne;
    }

    public static void main(String args[])
    {
        Squares squareGenerator = new Squares();

        System.out.println(squareGenerator.next());
        System.out.println(squareGenerator.next());
        System.out.println(squareGenerator.next());
    }
}

/*

// This prints the first three square numbers.
// Note we could have gone further and implemented this as an iterator.

What we have here is an example of lazy evaluation in a non-functional style.
Wikipedia defines lazy evaluation as: ‘In programming language theory, lazy evaluation,
or call-by-need is an evaluation strategy which delays the evaluation of an expression
until its value is needed’.
Lazy evaluation is useful because we don’t need to worry about infinite sequences,
performing computationally expensive operations up-front, and about storage.
*/