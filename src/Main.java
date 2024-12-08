import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 8.1
        int[] array = {2,2,0};
        System.out.println(countEvenInts(array));

        //Task 8.1
        System.out.println(catDog("1cat1cadodog"));

        //Task 8.2
        int[] array2 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(array2));

        //Task 8.4
        int[] array3 = {1, 2, 2, 13, 2};
        System.out.println(sumWithoutUnlucky13(array3));

        //Task 8.5
        int[] array4 = {2, 10, 7, 2};
        System.out.println(differenceLargestSmallest(array4));

        //Task 8.6
        System.out.println(doubleChars("AAbb"));

        //Task 8.7
        System.out.println(countHi("ABChi hi"));

        //Task 8.8
        System.out.println(countCode("aaacodebbb"));

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

    public static String doubleChars(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    public static int countHi(String str) {
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i<charArray.length-1; i++){
            if (charArray[i] == 'h' && charArray[i+1] == 'i'){
                count++;
            }
        }

        return count;
    }

    public static int countCode(String str) {
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i<charArray.length-1; i++){
            if (charArray[i] == 'c' && charArray[i+1] == 'o' && charArray[i+3] == 'e'){
                count++;
            }
        }

        return count;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
String substring = str.substring(i, i+3);
            if (substring.equals("cat")) {
                cat++;
            } else if (substring.equals("dog")) {
                dog++;
            }
        }
        return cat == dog;
    }
}