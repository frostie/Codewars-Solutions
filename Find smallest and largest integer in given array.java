// Find smallest and largest integer in given array

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class Main 
{
    public static void main(String[] args)
    {
         int[] array = {3, 4, 7, 1};
        
         int min = java.util.Arrays.stream(array).min().getAsInt();
         int max = java.util.Arrays.stream(array).max().getAsInt();

         System.out.println("Smallest number: " + min);
         System.out.println("Largest number: " + max);
    }
}
