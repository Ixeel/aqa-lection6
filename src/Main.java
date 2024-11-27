import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        //Task 1
        System.out.println("Середня значення елементів масиву = "+ averageNumber(arr));
        //Task 2
        minAndMax(arr);

        //Task 3
        revertArr(arr);

        //Task 4
        checkIfNumIsPresent(arr, 2);
    }
    public static int averageNumber(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return sum / numbers.length;

    }
    public static void minAndMax(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int max = numbers[numbers.length - 1];
        int min = numbers[0];
        System.out.println("min = " + min + " max = " + max);
    }
    public static void revertArr(int[] numbers) {
        System.out.print("Масив в зворотньому порядку: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void checkIfNumIsPresent(int[] numbers, int find_number) {
        if (Arrays.binarySearch(numbers, find_number) >= 0) {
            System.out.println("\nЧисло " + find_number + " присутнє в масиві " + Arrays.toString(numbers));
        } else {
            System.out.println("\nЧисло " + find_number + " не присутнє в масиві " + Arrays.toString(numbers));
        }
    }
}