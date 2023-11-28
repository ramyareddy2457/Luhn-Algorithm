import java.util.Arrays;

public class Test2 {
    public static void main(String args[]) {
        int[] array = new int[]{5, 6, 1, 5};
        for (int i = 0; i <= array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                int k = array[i] + array[j];
                if (k == 10) {
                    int[] newArray = new int[]{i + 1, j+1};
                    System.out.println(Arrays.toString(newArray));
                }

            }

        }
    }
}
