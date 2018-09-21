package com.company;

public class Main {

    public static void main(String[] args)
    {
        String input = "abcdefg";
        System.out.println("input = "+input);
        System.out.println("oddCharacters = "+oddCharacters(input));
        System.out.println("evenCharacters = "+evenCharacters(input));
        System.out.println("evenFirstOddLast = "+evenFirstOddLast(input));
    }
    public static String oddCharacters(String input)
    {
        int index = 1;
        String output = "";
        while (index < input.length());
        {
            output = output + input.substring(index, index+1);
            index = index + 2;
        }
        return output;
    }
    public static String evenCharacters(String input)
    {
        int index = 2;
        String output = "";
        while (index < input.length());
        {
            output = output + input.substring(index, index+1);
            index = index + 2;
        }
        return output;
    }
    public static String evenFirstLast(String input)
    {
        return evenCharacters(input) + oddCharacters(input);
    }
}

