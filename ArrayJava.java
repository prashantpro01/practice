import java.util.*;

public class ArrayJava {
    
    public static void update(int marks[]){
        
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
        
        return;
    }

    public static int linerSearch(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        
        
        return -1;
    }

    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // -smallest
        
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }

    public static int binarySearch(int sortedArr[],int key){
        int start = 0, end = sortedArr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparison
            if(sortedArr[mid]==key){
                return mid;
            }
            if(sortedArr[mid]< key){ //right
                start = mid+1;
            }else{  //right
                end = mid-1;
            }
        }
        
        return -1;
    }

    public static void reverse(int numbers[]){
        int first =0,last=numbers.length-1;
        while(first<last){
            //swap
            int temp =numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }

    public static void pairs_in_array(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    public static void print_subarrays(int numbers[]){
            for (int i =0;i <numbers.length ;i++){
                for (int j=i+1; j<numbers.length;j++){
                    for(int k=i;k<=j;k++ ){
                        System.out.print(numbers[k]+" ");                        
                    }
                    System.out.println();
                }
                System.out.println();
            }
    } 

    public static void max_subarray_sum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //CALCULATE PREFIX
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        
        for (int i=0;i<numbers.length;i++){
            for(int j =i;j<numbers.length;j++){
                sum = 0;
                // for(int k=i;k<=j;k++){
                //     sum = sum+numbers[k];
                //     }
                sum = i==0?prefix[0]:prefix[j]-prefix[i-1];
                if(sum>largest){
                    largest = sum;
                }
            }
            }
            System.out.println("max sub array sum is" + largest);
        }
                            //kadan exception handling
    public static void kadanAlgoException(int numbers[]){
        int counter = 0 ;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]<0){
                counter++;
                if(counter==numbers.length){
                    max_subarray_sum(numbers);
                    return;
                }
            }
        }
    }
                                //khadan algo
    public static void kadanAlgo(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int crr = 0;
        for(int i=0; i<numbers.length;i++){
            crr = crr+numbers[i];
            if(crr<0){
                crr=0;
            }
            ms= Math.max(crr, ms);
        }
        if(ms!=0){                 //extra case for -ve array case.
            System.out.println("max sub array sum"+ms);}
            else{
                kadanAlgoException(numbers);  //exception calling.
            }
    }

    public static void main(String args[] ){
        int numbers[]={-2,-3,-4,8,-2,-1,-5,-3};
        //kadans
        kadanAlgo(numbers);
        //max subarray sum
        // max_subarray_sum(numbers);
        //print subarrays

        // print_subarrays(numbers);
                
        //pairs in an array
        
        // pairs_in_array(numbers);
        
        // //reverse an array

        // int numbers[]={2,4,5,1,8,10,15,16,17,3};
        // reverse(numbers);
        // for(int i=1; i<numbers.length; i++){
        //     System.out.print(numbers[i]+ " ");
        // }

        // //binary search
        
        // int sortedArr[]={1,2,3,4,5,6,7,8,9,11,22,33,44,55,66};
        // int key=11; 
        // System.out.println(binarySearch(sortedArr, key));

        // // linear search

        // int numbers[]={2,4,5,1,8,10,15,16,17,3};
        // System.out.println(largestNumber(numbers));

        
        
        // int key =99;

        // int index =linerSearch(numbers,key);
        // System.out.println("key is at "+ index);
        
        
        // int marks[]={95,96,99,105};
        // update(marks);
        // for(int i=0; i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }



        //syntax of array
        // int marks[]= new int[50];

        // int numbers[]={1,2,3,4};

        // String fruits[]={"apple","mango"};
    
        
        
    
    }
    
}
