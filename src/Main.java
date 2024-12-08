import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 8.1
        int[] array = {2,2,0};
        System.out.println(countEvenInts(array));

        //Task 8.2
        int[] array2 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(array2));

        //Task 8.4
        int[] array3 = {1, 2, 2, 13, 2};
        System.out.println(sumWithoutUnlucky13(array3));

        //Task 8.5
        int[] array4 = {2, 10, 7, 2};
        System.out.println(differenceLargestSmallest(array4));

    }
    public static int countEvenInts(int [] array) {
        int count = 0;
        for(int i: array){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
    public static int centeredAverage(int[] arr) {
        int min = 0;
        int max = 0;
        int sum = 0;

        for (int num : arr) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        sum = sum - min;
        sum = sum - max;

        return sum / (arr.length - 2);
    }

    public static int sumWithoutUnlucky13(int [] array) {
        int sum = 0;
        for (int j : array) {
            if (j != 13) {
                sum = sum + j;
            } else {
                return sum;
            }

        }
        return sum;
    }

    public static int differenceLargestSmallest(int [] array) {
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length-1];

        return max-min;
    }
}