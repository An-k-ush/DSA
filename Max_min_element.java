import java.util.*;
public class Max_min_element {
    public static void maxmin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            max = Integer.max(max, arr[i]);
            min = Integer.min(min, arr[i]);
        }
        System.out.print("Max is : " + max + "\nMin is : " + min);
    }
    public static void main(String args[]) {
        int arr[] = {6,2,1,4,56,2};
        maxmin(arr);
    }
}