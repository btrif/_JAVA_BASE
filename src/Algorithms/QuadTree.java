package Algorithms;

//  Created by Bogdan Trif on 07-01-2019 , 9:04 PM.


public class QuadTree {

    public QuadTree(float x, float y, float length) {
        // (x, y) - centre point of square
        // length - length of square

        if (length == 2) {
            System.out.println("counting pixels on ..." + "  x= " + x+"   y= " + y + "   length =" + length);
            return;
        }


        // do something with this square
        // e.g. find polys that are in it

        System.out.println("x =  " + x  + "    y = " + y + "    length " +  length);

        // top left square
//        x = x-(length/4.f);
//        y = y-(length/4) ;
//        length =  length/2.f ;
        new QuadTree(x-(length/4.f), y-(length/4), length/2.f );
//        new QuadTree(x, y, length);


        // top right square
        new QuadTree(x+(length/4.f), y-(length/4.f), length/2.f);


        // bottom left square
        new QuadTree(x-(length/4.f), y+(length/4.f), length/2.f);


        // bottom right square
        new QuadTree(x+(length/4.f), y+(length/4.f), length/2.f);

    }

    public static void main(String[] args) {

        new QuadTree(4, 4 , 8 );

    }
}
