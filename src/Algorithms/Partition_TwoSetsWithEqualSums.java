package Algorithms;

//  Created by Bogdan Trif on 12-10-2017 , 6:22 PM.


import java.util.Arrays;

public class Partition_TwoSetsWithEqualSums {
    public static void main (String args[])
    {
        double arr[] = {1.0, 1.584962500721156, 2.321928094887362, 2.807354922057604, 3.4594316186372973,
                3.700439718141092, 4.087462841250339, 4.247927513443585, 4.523561956057013, 4.857980995127572,
                4.954196310386875, 5.20945336562895, 5.357552004618084, 5.426264754702098, 5.554588851677638,
                5.727920454563199, 5.882643049361842, 5.930737337562887, 6.066089190457772, 6.149747119504682,
                6.189824558880018, 6.303780748177103, 6.3750394313469245, 6.475733430966398, 6.599912842187128,
                6.658211482751795, 6.6865005271832185, 6.7414669864011465, 6.768184324776926, 6.820178962415188,
                6.9886846867721655, 7.03342300153745, 7.098032082960526, 7.118941072723508, 7.219168520462161,
                7.2384047393250786, 7.294620748891627, 7.348728154231077, 7.383704292474052, 7.434628227636725,
                7.483815777264256, 7.499845887083206};
        double set1[] = new double[(1+arr.length)/2];
        double set2[] = new double[(1+arr.length)/2];

        divideInEqualSums (arr, set1, set2);
    }

    private static void divideInEqualSums(double[] arr, double[] set1, double[] set2)
    {
        int setSize = set1.length;
        Arrays.sort(arr);

        int pos1=0;
        int pos2=0;

        int i=arr.length-1;

        double sum1 = 0;
        double sum2 = 0;
        while (pos1 < setSize && pos2 < setSize)
        {
            if (sum1 < sum2)
            {
                set1[pos1] = arr[i];
                pos1++;
                sum1 += arr[i];
            }
            else
            {
                set2[pos2] = arr[i];
                pos2++;
                sum2 += arr[i];
            }
            i--;
        }

        while (i>=0)
        {
            if (pos1 < setSize)
                set1[pos1++] = arr[i];
            else
                set2[pos2++] = arr[i];
            i--;
        }

        printArrayWithSum(arr);
        printArrayWithSum(set1);
        printArrayWithSum(set2);
    }

    static void printArrayWithSum (double arr[])
    {
        double sum1 = 0;
        for (int i=0; i<arr.length; i++)
        {
            sum1 += arr[i];
            System.out.print(arr[i]+",");
        }
        System.out.println(" = " + sum1);
    }

}
