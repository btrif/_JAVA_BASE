package WEEK_08.LAB;

//  Created by Bogdan Trif on 25-05-2017 , 5:06 PM.


/**
 * Class that checks if a matrix is a normal magic square
 */

class MagicSquareChecker{

    static boolean testDiag(int[][] matrix, int dim){
        int sum = dim * (dim * dim +1) / 2;
        int sumMainDiagonal = 0;
        int sumMinorDiagonal = 0;

        for (int row = 0; row < dim; row++){
            sumMainDiagonal += matrix[row][row];

            if (sumMainDiagonal > sum)
                return false;

            sumMinorDiagonal += matrix[row][dim -1 -row];

            if (sumMinorDiagonal > sum)
                return false;
        }
        if ((sumMainDiagonal != sum)||(sumMinorDiagonal != sum))
            return false;
        return true;
    }

    static boolean testNumbers(int[][] matrix, int dim){

        // the default value is false
        boolean[] test = new boolean[dim*dim];

        int max = dim*dim;
        int element;

        for (int row = 0; row < dim; row++){
            for (int col = 0; col < dim; col++){
                element = matrix[row][col];
                if ((element > max)|| (element <= 0))
                    return false;
                if (test[element -1])
                    return false;
                test[element -1] = true;
            }
        }
        return true;
    }

    public static boolean testRow(int[] vector, int sum){
        int sumAux = 0;
        for (int i=0; i< vector.length; i++){
            sumAux += vector[i];
            if (sumAux > sum)
                return false;
        }
        if (sumAux != sum)
            return false;
        return true;
    }

    public static boolean test(int[][] matrix, int dim){

        if (!testDiag(matrix,dim))
            return false;

        if (!testNumbers(matrix,dim))
            return false;

        int sum = dim * (dim * dim +1) / 2;

        for (int row = 0; row< dim; row++){
            if(!testRow(matrix[row],sum))
                return false;
        }

        int sumAux;
        for (int col = 0; col< dim; col ++){
            sumAux = 0;
            for (int row=0; row < dim; row ++){
                sumAux += matrix[row][col];
                if (sumAux > sum)
                    return false;
            }
            if (sumAux != sum)
                return false;
        }

        return true;
    }
    public static void main(String[] args){
        int magicSquareMars[][] ={
                {11, 24, 7, 20, 3},
                {4, 12, 25, 8, 16},
                {17, 5, 13, 21, 9},
                {10, 18, 1, 14, 22},
                {23, 6, 19, 2, 15}};
        int magicSquareJupiter[][] ={
                {4, 14, 15, 1},
                {9, 7, 6, 12},
                {5, 11, 10, 8},
                {16, 2, 3,	13}};

        int magicSquareSagradaFamilia[][]={
                {1,14,14,4},
                {11,7,6,9},
                {8,10,10,5},
                {13,2,3,15}};

        if (test(magicSquareJupiter, 4)){
            System.out.println("The Jupiter Magic Square is a normal magic square");
        }
        else{
            System.out.println("The Jupiter Magic Square is NOT a normal magic square");
        }

        if (test(magicSquareMars, 5)){
            System.out.println("The Mars Magic Square is a normal magic square");
        }
        else{
            System.out.println("The Mars Magic Square is NOT a normal magic square");
        }

        if (test(magicSquareSagradaFamilia, 4)){
            System.out.println("The Sagrada Familia Magic Square is a normal magic square");
        }
        else{
            System.out.println("The Sagrada Familia Magic Square is NOT a normal magic square");
        }

    }
}


