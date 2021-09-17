package Algorithms;

//  Created by Bogdan Trif on 11-07-2018 , 2:31 PM.


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixExpressionGeneratorSansRecursion {

    private static final String [] OPERATORS = new String[] {"*", "+", "/", "-"};

    public static void main(String[] args) {
        List<String> x = new ArrayList<String>();
        x.add("1");
        x.add("2");
        x.add("3");
        x.add("4");



        for (String ex : generateAllPostfixExpressions(x)){
            System.out.println(ex);
        }
    }

    /**
     * Assumes input is a list of single digit positive numbers.
     * @param operands
     * @return list of all possible postfix expressions for the given list of operands
     */
    private static List<String> generateAllPostfixExpressions(List<String> operands) {
        List<String> allPossiblePostFixExprs = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(""); //start with a empty partial expression
        int finalPFExprLength = 2*operands.size() - 1;
        int sizeOfOperands = operands.size();

        while (!stack.isEmpty()) {
            String partialExpr = stack.pop();
            int partialExprLength = partialExpr.length();

            if (partialExprLength == finalPFExprLength) {
                allPossiblePostFixExprs.add(partialExpr);
                continue;
            }

            int noOfOprdsConsumed = 0;
            for (char c : partialExpr.toCharArray())
                noOfOprdsConsumed += Character.isDigit(c) ? 1 : 0;

            if (2*noOfOprdsConsumed - partialExprLength > 1)
                for (String op : OPERATORS)
                    stack.push(partialExpr + op);

            if (noOfOprdsConsumed != sizeOfOperands)
                stack.push(partialExpr + operands.get(noOfOprdsConsumed));
        }

        return allPossiblePostFixExprs;
    }
}
