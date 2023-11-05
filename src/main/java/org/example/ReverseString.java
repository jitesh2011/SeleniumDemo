package org.example;

public class ReverseString {

    public static void main(String args[])
    {
        String original="Shrisha";
        String reversed="";

        for (int i=original.length()-1;i>=0;i--)
        {
         // reversed=original.charAt(i)+reversed;
            System.out.println(i);
            System.out.println(original.charAt(i));

            reversed=reversed+original.charAt(i);
        }
        System.out.println("The reversed string of Shrisha is :"+reversed);


    }
}
