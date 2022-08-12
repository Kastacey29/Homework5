import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int [] arr1 = new int [] {1,2,3};
        float [] arr2 = {1.57f, 7.654f, 9.986f};
        char [] arr3 = {'f', 25, 'h', 36};
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ", ");
        }
            System.out.println(arr1[arr1.length - 1]);

        for (int i = 0; i < arr2.length-1; i++) {
            System.out.print(arr2[i] + ", ");
        }
            System.out.println(arr2[arr2.length - 1]);

        for (int i = 0; i < arr3.length-1; i++) {
            System.out.print(arr3[i] + ", ");
        }
            System.out.println(arr3[arr3.length - 1]);

        for (int i = arr1.length-1; i > 0; i--) {
            System.out.print(arr1[i] + ", ");
        }
            System.out.println(arr1[0]);
        for (int i = arr2.length-1; i > 0; i--) {
            System.out.print(arr2[i] + ", ");
        }
            System.out.println(arr2[0]);
        for (int i = arr3.length-1; i > 0; i--) {
            System.out.print(arr3[i] + ", ");
        }
            System.out.println(arr3[0]);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] = arr1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}