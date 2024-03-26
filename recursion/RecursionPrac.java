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

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        return fnm1 + fnm2;
    }

    public static int tilingProb(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vetical
        int fnm1 = tilingProb(n - 1);
        // horizontal
        int fnm2 = tilingProb(n - 2);

        int toways = fnm1 + fnm2;
        return toways;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int pairingProblem(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // chose
        // single
        int fnm1 = pairingProblem(n - 1);
        // pair
        int fnm2 = pairingProblem(n - 2);
        int pairWays = (n - 1) * fnm2;
        // total ways
        return fnm1 + pairWays;
    }

    public static void printBinaryWithoutConsicutive(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // condition
        printBinaryWithoutConsicutive(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryWithoutConsicutive(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // printDec(10);
        // printInc(5);
        // System.out.print(fib(10));
        // System.out.println(tilingProb(5));
        // String str = "aaabbccffggddjjkklleerrmmnnbbkkiiyyjj";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(pairingProblem(3));
        printBinaryWithoutConsicutive(3, 0, "");

    }
}