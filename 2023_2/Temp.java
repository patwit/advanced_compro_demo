public class Temp {
    public static void main(String[] args) {
            int[] arr1 = {3, 8, 5, 7, 2, 9};
            int[] arr2 = {4, 0, 1, 9, 5, 8};
            int sum = 0;
            for (int i = 0; i < 6; i++) {
                System.out.println("Sum is " + sum);
                if (arr1[i] % 2 == 0) {
                    continue;
                }
                if (arr1[i] < arr2[i]) {
                    sum = sum + arr1[i];
                }else {
                    sum = sum - arr2[i];
                }
                System.out.println("Sum is " + sum);
            }
    }
}
