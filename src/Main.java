import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,3,5};
        System.out.println(countEvenInts(array));
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
}