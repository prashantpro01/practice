import java.util.*;

public class BitManipulation {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    public static int getIthBit(int n) {
        int bitMask = 1 << n;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

    }

    public static int clearLastIBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean powerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void swapNumbers(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("value of x " + x + " value of y " + y);
    }

    public static int add1InInteger(int x) {
        return -~x;
    }

    public static void main(String[] args) {

        // upper case to lower case
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }

        // add 1 to integer through bitwise operation
        System.out.println(add1InInteger(5));

        // swap numbers
        swapNumbers(5, 10);

        // fast exponentiation
        System.out.println(fastExpo(5, 3));

        // count set bit
        System.out.println(countSetBits(10));

        // power 2
        System.out.println(powerOf2(8));

        // clear bits in range
        System.out.println(clearBitsInRange(10, 2, 4));

        // clear last ith bit
        System.out.println(clearIthBit(15, 1));

        // update ith bit
        System.out.println(updateIthBit(10, 2, 1));

        // clear ith bit
        System.out.println(clearIthBit(10, 1));
        // set ith bit
        System.out.println(setIthBit(10, 2));

        // get ith bit
        System.out.println(getIthBit(2));
        // odd even q1
        oddEven(6);
        // right shift
        System.out.println((5 >> 2));
        // left shift
        System.out.println((5 << 2));
        // binary once compliment
        System.out.println((~5));
        // xor
        System.out.println((5 ^ 6));

        // or
        System.out.println((5 | 6));
        // and
        // System.out.println((5&6));
    }
}
