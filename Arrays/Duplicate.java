public class Duplicate {
    public static void bubsort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return;
    }
    public static void duplicate(int arr[]) {
        int flag = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                flag += 1;
            }        
        }
        if(flag == 0){
            System.out.print("False");
        }
        else {
            System.out.print("True");
        }
    }
    public static void main(String args[]) {
        int arr[] = {5,4,2,6,6,1,2,4};
        bubsort(arr);
        duplicate(arr);
    }
}