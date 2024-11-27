public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        //Task 1
        System.out.println("Середня значення елементів масиву = "+ averageNumber(arr));
    }
    public static int averageNumber(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return sum / numbers.length;

    }
}