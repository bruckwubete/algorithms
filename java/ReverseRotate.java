import java.util.*;
public class ReverseRotate {
    public static void main(String[] args) {
        rotate(8, true);
        System.out.println(Arrays.toString(NUMBERS));
    }

    private static int[] NUMBERS = {1,2,3,4,5,6,7,8};

    public static void rotate(int n, boolean right) {
        n = n % NUMBERS.length;
        if (right) {
            n = NUMBERS.length - n;
        }
        reverse(0, n - 1);
        reverse(n);
        reverse(0);
    }

    public static void reverse(int start, int end) {
        if(start <= -1 || start >= NUMBERS.length || end <= -1 || end >= NUMBERS.length){
            return;
        }
        for(;start < end; start++, end--) {
            int temp = NUMBERS[start];
            NUMBERS[start] = NUMBERS[end];
            NUMBERS[end] = temp;
        }
    }

    public static void reverse(int start) {
        reverse(start, NUMBERS.length - 1);
    }
}