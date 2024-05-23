package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int var1 = 10;
        int var2 = 2;
        int var3 = 3;
        int var4 = 4;

        int sum1 = var1 + var2;
        int sum2 = var3 + var4;

        System.out.println(sum1>sum2);

        sum1 += 1;
        sum2 -= 2;
        System.out.println(sum1>sum2);

        boolean isOddSum = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println(isOddSum);
    }
}
