import java.util.Arrays;

public class Midterm {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 9, 1, 10, 4, 7, 0, 20, 3};
        output(numbers);
        sortArray(numbers);
        output(numbers);
        System.out.println(secondLargest(numbers));
    }

    private static int secondLargest(int[] numbers) {
        sortArray(numbers);
        return numbers[numbers.length-2];
    }

    private static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
    }

    private static void output(int[] numbers) {
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }    
        System.out.println();
    }

}
