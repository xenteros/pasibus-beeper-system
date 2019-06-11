package com.github.xenteros;

class Fibonacci {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(smartfib(45));
        long end = System.currentTimeMillis();

        System.out.println((end - start));
    }

    public static long fib(int n) {
        if (n == 0) {
            return 0;
        } if (n == 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static long smartfib(int n) {
        long[] partialResults = new long[n];
        partialResults[0] = 0;
        partialResults[1] = 1;
        for (int i = 2; i < n; i++) {
            partialResults[i] = partialResults[i-1] + partialResults[i-2];
        }
        return partialResults[n-1];
    }

}
