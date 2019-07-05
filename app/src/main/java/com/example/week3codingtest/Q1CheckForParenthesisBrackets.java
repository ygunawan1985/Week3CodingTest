package com.example.week3codingtest;

public class Q1CheckForParenthesisBrackets {

    static int top = -1;
    static char[] characters = new char[100];

    public static void main(String[] args) {

        //should be correct
        char test1[] = {'{', '(',')','}','[',']', '[', '{', '}', ']'};

        //should be incorrect
        char test2[] = {'{', ')', '(',')','}','[',']', ')'};

        //should be correct
        char test3[] = {'(', '{', '}', ')', '[', ']'};

        //should be incorrect
        char test4[] = {'[', ']', '{', ']', '}', '['};

        if (checkForCorrectOrder(test1))
            System.out.println("Correct");
        else
            System.out.println("Not Correct");

        if (checkForCorrectOrder(test2))
            System.out.println("Correct");
        else
            System.out.println("Not Correct");

        if (checkForCorrectOrder(test3))
            System.out.println("Correct");
        else
            System.out.println("Not Correct");

        if (checkForCorrectOrder(test4))
            System.out.println("Correct");
        else
            System.out.println("Not Correct");
    }

    public static boolean checkForCorrectOrder(char[] test) {

        for(int i = 0; i < test.length; i++)
        {
            if (test[i] == '[' || test[i] == '{' || test[i] == '(')
                push(test[i]);

            if (test[i] == ']' || test[i] == '}' || test[i] == ')')
            {
                if (isEmpty())
                {
                    return false;
                } else if (!isMatching(pop(), test[i]))
                {
                    return false;
                }
            }

        }

        if (isEmpty())
            return true;
        else
            return false;
    }

    public static void push(char aCharacter){
        characters[++top] = aCharacter;
    }

    public static char pop(){
        char aCharacter = characters[top];
        top--;
        return aCharacter;
    }

    public static boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    static boolean isMatching(char char1, char char2)
    {
        if (char1 == '(' && char2 == ')')
            return true;
        else if (char1 == '{' && char2 == '}')
            return true;
        else if (char1 == '[' && char2 == ']')
            return true;
        else
            return false;
    }

}
