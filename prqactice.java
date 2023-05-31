import java.util.Scanner;

public class prqactice {
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int test[]) {
        int first = 0, last = test.length - 1;
        while (first < last) {
            int temp = test[last];
            int tempFirst = test[first];
            test[first] = temp;
            test[last] = tempFirst;
            first++;
            last--;
        }
    }

    // public static void main(String args[]){
    // Scanner sc=new Scanner(System.in);
    // System.out.println("define array size");
    // int n = sc.nextInt();
    // int test[]=new int[n];
    // System.out.println("input array");
    // for (int i=0;i<test.length;i++){
    // int a =sc.nextInt();
    // int x=a-n;
    // if(x<0){
    // test[i]=0;
    // }
    // else{
    // test[i]=x;
    // }

    // }
    // System.out.println("input number ");
    // int f =sc.nextInt();
    // for(int i=0;i<test.length;i++){
    // if(test[i]==f){
    // System.out.println("element at "+(i+1));
    // }
    // }

    // bubblesort(test);
    // printArr(test);
    // System.out.println();
    // reverse(test);
    // printArr(test);
    // int count =0;
    // System.out.println();

    // for(int i=0;i<test.length;i++){
    // if(test[i]==f){
    // System.out.println("now element at "+(i+1));
    // count++;

    // }
    // }if(count==0){
    // System.out.println("no element found");
    // }
    // }
    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void numberdiamond2(int n) {
        n = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void rohmbus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else if (j != 1 || j != n) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void hollodiamond(int n) {
        int m = (n - 1) / 2;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= m; i++) {
            for (int j = m - i; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = m - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = m - 1; i >= 1; i--) {
            for (int j = m - i; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = m - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

    }

    public static void q1D2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void q2D2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(i);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void q3D2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * j + " ");
            }
            System.out.println();
        }
    }

    public static void q4D2(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
                if (k > n) {
                    System.exit(0);
                    ;
                }
            }
            System.out.println();
        }
    }

    public static void q5D2(int n) {
        if (n % 2 == 0) {
            System.out.println("sorry cant execute please input odd number");
        } else {
            n = (n + 1) / 2;

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = n - i; j >= 0; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = n - i; j >= 0; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

    }

    public static void q1D3(int n) {
        n = (n + 1) / 2;
        for (int i = 1; i < n; i++) {
            for (int j = (n * 2) - (2 * i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 3; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1) {

                } else {
                    System.out.print(j);
                }
            }

            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int j = (n * 2) - (2 * i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 3; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1) {

                } else {
                    System.out.print(j);
                }
            }

            System.out.println();

        }
    }

    public static void q2D3(int n) {
        for (int i = n; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void q3D3(int n) {
        for (int i = 0; i <= n - 1; i++) {
            int x = i + 1;
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            if (i == 0) {
            } else {
                for (int j = x - 2; j > i; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void q4D3(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = (i * 2) - 1; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                if (j == 0) {
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = (i * 2) - 1; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {

                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    public static void q5D3(int n) {
        int arr[] = new int[n * 10];
        arr[0] = 0;
        arr[1] = 1;
        int x = 0;
        int y = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[y + 1] = arr[x] + arr[y];
                System.out.print(arr[x] + " ");
                x++;
                y++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        // rohmbus(n);
        // hollodiamond(n);
        // q1D2(n);
        // q2D2(n);
        // q3D2(n);
        // q4D2(n);
        // q5D2(n);
        // q1D3(n);
        // q2D3(n);
        // q3D3(n);
        // q4D3(n);
        q5D3(n);

    }
}
