public class NoOf7 {
    public static void count7(int arr[][]) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]) {
        int arr[][] = {{4,7,8},{8,8,7}};
        count7(arr);
    }
}