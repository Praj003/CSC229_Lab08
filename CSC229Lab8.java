
package com.mycompany.csc229lab8;


public class CSC229Lab8 {
    public static boolean Prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean Digit3(int n) {
        return String.valueOf(n).contains("3");
    }

    public static int SumOfPrimesDigit3(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (Prime(i) && Digit3(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 100;
        int sumOfThrees = SumOfPrimesDigit3(n);
        System.out.println(sumOfThrees); 
    }
}