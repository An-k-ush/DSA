public class Kadane {
    public static void maxsubarr(int arr[]) {
        int max = 0;
        int temp = 0;
        int flag = 0;
        int maxneg = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                flag++;
            }
            maxneg = Integer.max(arr[i], maxneg);
        }
        if(flag == arr.length) {
            max = maxneg;
        }
        else {
        for(int i = 0; i < arr.length; i++) {
                temp += arr[i];
                if(temp < 0) {
                    temp = 0;
                }
                max = Integer.max(max, temp);
            }
        }
        System.out.print(max);
    }
    public static void main(String args[]) {
        int arr[] = {-9, 3, -4, 1, -5, 3};
        maxsubarr(arr);
    }
}
