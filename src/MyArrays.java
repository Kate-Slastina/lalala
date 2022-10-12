import java.util.Scanner;

public class MyArrays {
    public static double avgOf4Digit(int... args) {
        int k = 0, sum = 0;
        boolean f = true;
        for (int i : args) {
            if (i >= 1000 && i <= 9999) {
                sum += i;
                k++;
                f = false;
            }

        }
        if (f) return -1;
        else return sum / k;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) array[i] = in.nextInt();
        System.out.println(MyArrays.minToBegin(array));
    }
    public static int[] minToBegin(int arr[]){
        int min = 1_000_000_000, j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                j = i;
            }
            for (int k = j; k > 1; k--) {
                arr[k] = arr[k - 1];
            }
            arr[0] = min;
        }
        return arr;
    }

}