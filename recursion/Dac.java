public class Dac {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int str, int end) {
        if (str >= end) {
            return;
        }
        int mid = (str + end) / 2;
        mergeSort(arr, str, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, str, mid, end);

    }

    public static void merge(int arr[], int str, int mid, int end) {
        int temp[] = new int[end - str + 1];
        int left = str;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;

        }
        // left part
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        // right part
        while (right <= end) {
            temp[k++] = arr[right++];

        }
        // copy temp to main
        for (k = 0, left = str; k < temp.length; k++, left++) {
            arr[left] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, 3, 6, 8, 1, 4, 5 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
