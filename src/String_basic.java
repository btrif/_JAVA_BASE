/**
 * Created by Bogdan Trif on 03-05-2017 , 12:03 PM.
 */
public class String_basic {

    public static void main(String[] args){
        String s1=new String ("I'm learning how to compare Strings");
        String s2=new String ("I'm learning how to compare Strings");

//       Even if the s1 s2 Strings are COMPLETELY IDENTICAL the result is that they are
//      different because they are instances of two different classes, therefore they
//        are two DIFFERENT OBJECTS and correspond to different memory

        if (s1 == s2) {
            System.out.println ("s1 and s2 are the same");
        }else{
            System.out.println ("s1 and s2 are different");
        }

//      This Method will return TRUE, because they compare sequencently the strings
//        character with character even if they represent two different objects
        if ( s1.equals(s2) ){
            System.out.println ("s1 and s2 are the same");
        } else {
            System.out.println ("s1 and s2 are different");
        }

        // Here the Strings are Identical because they are variables and not instances
//        of a class
        String s3 ="I'm learning how to compare Strings";
        String s4 ="I'm learning how to compare Strings";
        if ( s3.equals(s4) ){
            System.out.println ("s3 and s4 are the same");
        } else {
            System.out.println ("s3 and s4 are different");
        }

        int a[] = {1, 2, 3, 4};
        String s = "1234";
        System.out.println("\nLength of string a : \t" + a.length );
        System.out.println("Length of string s : \t" + s.length() );
        System.out.println();

        String literal = "This is a literal";
        System.out.println( literal.substring(0,4) );
        System.out.println( literal.substring(5,9) );
        System.out.println( literal.substring(10) );
        System.out.println(  );
        System.out.println( "".length() );
        System.out.println( "Index Method : \t" + "This is a literal".indexOf('T') );
        System.out.println( "Index Method starting from an index : \t" + "This is a literal".indexOf('i', 3) );

//The compareTo method of the class String compares two strings lexicographically (alphabetically).
//In this regard, respond to the following questions. The answer is correct if it matches the expected number.
        System.out.println();

        System.out.println("This is a literal".compareTo("This is a literal") );
//    The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object)
//    method would return true.

        System.out.println("This is a literal".compareTo("This is a litera") );
//    The character sequence represented by this String object is compared lexicographically
//    to the character sequence represented by the argument string.
//    The result is a positive integer if this String object lexicographically follows the argument string.
//    As there is no index position at which they differ,
//    then the shorter string lexicographically precedes the longer string.
//    In this case, compareTo returns the difference of the lengths of the strings -- that is, the value:


        System.out.println("This is a literal".compareTo("This is a literals") );
//The character sequence represented by this String object is compared lexicographically
// to the character sequence represented by the argument string.
// The result is a negative integer if this String object lexicographically precedes the argument string.
//        As there is no index position at which they differ,
// then the shorter string lexicographically precedes the longer string.
// In this case, compareTo returns the difference of the lengths of the strings -- that is, the value:
//"This is a literal".length()-"This is a literals".length()


        System.out.println("These are not literals".compareTo("This is a literal") );

//The character sequence represented by this String object is compared lexicographically
//to the character sequence represented by the argument string.
//The result is a positive integer if this String object lexicographically follows the argument string.
//As the two strings have different characters at one or more index positions,
// let k be the smallest such index, i.e.: 2;
// then the string whose character at position 2 has the smaller value,
// as determined by using the < operator, lexicographically precedes the other string.
//Thus, compareTo returns the difference of the two character values at position k in the two string --that is,
// the value:
//"These are not literals".charAt(2)-"This is a literal".charAt(2)
//This is, the distance between 'e' and 'i' in the alphabet is 4. Shortly, 'e' - 'i' is -4.

    }
}
