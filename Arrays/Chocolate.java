import java.util.*;
public class Chocolate {
    public static void sort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return;
    }
    public static void choc(int arr[], int m) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= arr.length - m; i++) {
            int temp = arr[i + m - 1] - arr[i];
            min = Integer.min(min, temp);
        }
        System.out.print(min);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int arr[] = {4, 56, 7, 9, 2, 3, 12};
        sort(arr);
        choc(arr, n);
        }
    }
}