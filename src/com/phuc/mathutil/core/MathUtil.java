package com.phuc.mathutil.core;

public class MathUtil {
    // trong class nay cung cap cho ai do nhieu ham xu li Toan hoc
    // clone class Math cua JDK
    // ham thu vien xai chung cho ai do, ko xai chung cho gi do
    // chon thiet ke la ham static

    // ham tinh giai thua !!!
    // n! = 1*2*3*4...n
    // ko co giai thua cho so am
    //0! = 1! 
    // giai thua ham do thi doc dung, tang nhanh v
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 to 20!");
        }

        if (n == 0 || n == 1) {
            return 1; // ket thuc cuoc choi som
        }
        long product = n;
        for (int i = 2; i < n; i++) {
            product *= i;

        }
        return product;

    }
}
