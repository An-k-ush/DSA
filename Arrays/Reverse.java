public class Reverse {
    public static void printarr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rev(int arr[]) {
        for(int i = 0; i <= (arr.length - 1)/2; i++ ) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static void main(String args[]) {
        int arr[] = {3,5,5,9,2,1};
        rev(arr);
        printarr(arr);
    }    
}
