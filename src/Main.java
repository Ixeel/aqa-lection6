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

        //Task 8.3
        int[] arraySumIgnore = {1, 2, 2};
        System.out.println(sumIgnoreSections(arraySumIgnore));

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

        //Task 8.9
        System.out.println(endsWith("abc", "abXabc"));
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

    public static int sumIgnoreSections(int [] array) {
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i< array.length; i++){
            if (array[i] == 6){
                flag = true;
            }
            if (!flag){
                sum = sum + array[i];
            }
            else if (array[i] == 7 && flag){
                flag = false;
            }
        }
        return sum;
    }

    public static boolean endsWith(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() > str2.length()) {
            return str1.endsWith(str2);
        } else {
            return str2.endsWith(str1);
        }
    }

}