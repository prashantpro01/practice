import java.util.*;

import javax.xml.transform.stax.StAXResult;

public class JavaBasics {

    public static void printHello(){
        System.out.println("hello World");
        return;
    }

    public static int calculateSum(int a , int b){  //parameters or formal parameters
        int sum = a + b;
        
        return sum;
    }
    public static int factorial(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int binoCoff(int n, int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);

        int binCoff = nfact/(rfact*nmrfact);
        return binCoff;
    }
    //function 2 cal sum of 2 num
    public static int sum(int a, int b){
        return a+b;
    }
    //function 2 cal sum of 3 num
    public static int sum(int a,int b,int c){
        return a+b+c;
    }


    //function for prime number
    public static boolean isPrimeNum(int n){
        boolean isPrimeNum = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return isPrimeNum;
    }
    //prime num in range
    public static void primeInRange(int n){
        for (int i =2; i<=n; i++){
            if(isPrimeNum(i)){
                System.out.print(i+" ");
            }
        }
    }

    //convert binary to decimal
    public static void binToDec(int binNum){
        int myBinNum = binNum;
        int pow = 0;
        int decNum =0;
        while(binNum > 0){
            int lastDigit =binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of "+ myBinNum +" = "+decNum);
    }
    // decimal to binary
    public static void decToBin(int decNum){
        int myDecNum =decNum;
        int pow=0;
        int binNum =0;
        while(decNum > 0){
            int rem = decNum%2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("binary of "+ myDecNum +" = "+ binNum);
    }

                        //function questions
                        //1
    public static double avg3Num(double n1,double n2,double n3){
        return (n1+n2+n3)/3;
    } 
                        //2
    public static boolean isEven(int n1){
        if(n1 % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
                        //3
    public static boolean palindrome(int n1){
        int palindrome = n1 ;
        int reverse =0;
        while (palindrome !=0){
            int remainder = palindrome %10;
            reverse= reverse *10 + remainder;
            palindrome = palindrome/10;
        }
        if(reverse == n1){
            return true;
        }
        else{
            return false;
        }
    }               
                        //5
    public static int sumOfDig(int n1){
        int num = n1;
        int total = 0;
        while(num != 0){
            int remainder = num % 10;
            total = total + remainder;
            num = num/10;
        }
        return total;
    }

//advance pattern
    //hollow rectangle
    public static void hollow_rectangle(int tRows,int tCols){
        for(int i=1;i<=tRows;i++){
            for(int j=1; j<=tCols;j++){
                if(i == 1 || i == tRows || j == 1 || j == tCols ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //inveres half pyramid
    public static void inhpyramid(int tRows){
        for(int i = 1 ; i<=tRows;i++){
            for(int j= 1 ; j<=tRows-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //inverted half pyrmid with number
    public static void inv_half_py_num(int n){
        for(int i=1 ; i<= n ; i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    // floids triangle
    public static void floidsTriangle(int n){
        int count = 1;
        for(int i=1 ;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    return;
    }
    // 01 triangle
    public static void binTri(int n){
        for(int i=1 ; i<=n;i++){
            for(int j = 1; j<=i;j++){
                int count=i+j;
                if(count%2==0){
                    System.out.print(1);
                }else
                {System.out.print(0);}
            }
            System.out.println();
        }
    }
    // butterfly pattern

                                //patterns
    public static void butterpattern(int n, int i){
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1; j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    return;
    }
                                // both halfs
    public static void butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            butterpattern(n, i);;
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1;i--){
            butterpattern(n, i);
            System.out.println();
        }
    return;
    }

    //solid rohmbus pattern
    public static void solid_rohmbus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    return;
    }

    // hollow rohmbus
    public static void hollow_rohmbus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=n; j++ ){
                if(i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println( );
        }
        return;
    }

    // diamond

                            //pattern logic
    public static void diamond_pattern(int i ,int n){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void diamond(int n){
        //1st half
        for(int i=1;i<=n;i++){
            diamond_pattern(i, n);
         }
        // 2nd half
        for(int i=n;i>=1;i--){
            diamond_pattern(i, n);
        } 
    return;
    }

    // number pyramid
    public static void number_pyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=2*i-1;j++){
                if(j%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    } 
    public static void main (String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int n1 = sc.nextInt();
        // double n2 = sc.nextDouble();
        // double n3 = sc.nextDouble();
        
        number_pyramid(5);
        //diamond(4);
        //hollow_rohmbus(5);
        //solid_rohmbus(5);
        //butterfly(5);
        //binTri(5);
        
        // floidsTriangle(4);
        // inv_half_py_num(5);
        // inhpyramid(5);
        
        // hollow_rectangle(4, 5);
        // System.out.println(sumOfDig(n1));


        // System.out.println(palindrome(n1));
        // System.out.println(isEven(n1));
        
        //System.out.println("average of the values are " +avg3Num(n1,n2,n3));
        // decToBin(35);
        // System.out.println(Math.abs(n2));
        // binToDec(10001);
        // primeInRange(25);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b); //arguments of actual parameters
        // System.out.println(sum);
        // System.out.println(sum(45, 35));
        // System.out.println(sum(45, 87, 89));
        //System.out.println(binoCoff(5, 2));
        
        // int n = 4;
        // char ch='A';
        // for(int line=1; line<=n; line++){
        //     for(int chars=1; chars<=line; chars++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
