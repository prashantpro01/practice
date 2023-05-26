import java.util.Scanner;

public class prqactice {
    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0; j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int test[]){
        int first =0, last=test.length-1;
        while(first<last){
            int temp = test[last];
            int tempFirst = test[first];
            test[first]=temp;
            test[last]=tempFirst;
            first++;
            last--;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("define array size");
        int n = sc.nextInt();
        int test[]=new int[n];
        System.out.println("input array");
        for (int i=0;i<test.length;i++){
            int a =sc.nextInt();
            int x=a-n;
            if(x<0){
                test[i]=0;
            }
            else{
                test[i]=x;
            }
            
        }
        System.out.println("input number ");
        int f =sc.nextInt();
        for(int i=0;i<test.length;i++){
            if(test[i]==f){
                System.out.println("element at "+(i+1));
            }
        }

        
        bubblesort(test);
        printArr(test);
        System.out.println();
        reverse(test);
        printArr(test);
        int count =0;
        System.out.println();
        
        for(int i=0;i<test.length;i++){
            if(test[i]==f){
                System.out.println("now element at "+(i+1));
                count++;

            }
        }if(count==0){
            System.out.println("no element found");
        }
    }
}
