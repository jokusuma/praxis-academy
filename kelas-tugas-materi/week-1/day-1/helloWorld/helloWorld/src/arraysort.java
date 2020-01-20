//https://stackoverflow.com/questions/5570882/how-to-use-java-util-arrays
import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        String[] simpsons = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
        Arrays.sort(simpsons);
        for (String s : simpsons) {
            System.out.print(s + " ");
        }
        // int[] numbers = {5,6,3,8,2,1};
        // Arrays.sort(numbers);
        // for (int i : numbers){
        //     System.out.println( i + " ");
        // }
    }
}