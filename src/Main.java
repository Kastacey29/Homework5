public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int [] arr1 = new int [3];
        arr1 [0] = 1;
        arr1 [1] = 2;
        arr1 [2] = 3;
        float [] arr2 = {1.57f, 7.654f, 9.986f};
        char [] arr3 = {'f', 25, 'h', 36};
        for (int i = 0; i < 3; i++) {
            if (i == (arr1.length - 1)) {
                System.out.println(arr1[i] + " ");
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i == (arr2.length - 1)) {
                System.out.println(arr2[i] + " ");
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i == (arr3.length - 1)) {
                System.out.println(arr3[i] + " ");
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        for (int i = arr1.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr1[i] + " ");
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        for (int i = arr2.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[i] + " ");
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        for (int i = arr3.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr3[i] + " ");
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2!=0) {
                if (i == (arr1.length - 1)) {
                    System.out.println((arr1[i] + 1) + " ");
                } else {
                    System.out.print((arr1[i] + 1) + ", ");
                }
            } else if (i == (arr1.length - 1)) {
                System.out.println(arr1[i] + " ");
            } else {
                System.out.print(arr1[i] + ", ");
        }
                }

    }
}