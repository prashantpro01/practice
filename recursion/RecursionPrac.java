import java.util.*;
public class RecursionPrac {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n);
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    public static int nFact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = nFact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sumNatural(n - 1);
        int sum = n + snm1;
        return sum;
    }

    public static void main(String[] args) {
        // printDec(10);
        // printInc(5);
        System.out.print(sumNatural(5));

    }
}