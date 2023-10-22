import java.util.*;

public class StringPractice {

    public static void q1D2(String str) {
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + "x");
        }
    }

    public static void roundoff(double a) {
        int n = 0;
        a = Math.round(a * Math.pow(10, n))
                / Math.pow(10, n);
        System.out.println(a);

    }

    public static void fd(double p, double r, double d) {
        double cycle = 365 / d;
        System.out.println(cycle);
        // double interestamount = p * (r / 100);
        // double ipd = interestamount / 365;

        // System.out.println(cycle);
        // System.out.println(interestamount);
        // System.out.println(ipd);

        for (int i = 1; i <= cycle; i++) {
            double interestamount = p * (r / 100);
            double ipd = interestamount / 365;
            double iaapc = ipd * d;
            double tarfr = p + iaapc;
            p = tarfr;
            System.out.println(interestamount);
            System.out.println(ipd);
            System.out.println(iaapc);
            System.out.println(tarfr);
            System.out.println("new principle is" + p);

        }
    }

    public static void main(String args[]) {
        // String str = "abcd";
        // q1D2(str);

        // roundoff(13.564853);
        double p = 100000;
        double r = 5.75;
        double d = 211;
        fd(p, r, d);

        // Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        // char c = a.charAt(0);
        // // System.out.print(c);
        // int skival = c;
        // if (skival >= 97 && skival <= 122) {
        // System.out.println("lower case data input");
        // } else if (skival >= 65 && skival <= 90) {
        // System.out.println("upper case data input");
        // } else if (c >= '1' && c <= '9') {
        // System.out.println("number is input");
        // } else {
        // System.out.println("invalid input");
        // }

    }
}
