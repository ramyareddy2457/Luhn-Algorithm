import java.util.Arrays;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        int[] array = new int[] {2, 7, 11, 15};
        int[] output = gettargetNumber(array, 18);
        System.out.println(Arrays.toString(output));

    }

    public static int[] gettargetNumber(int[] array, int target) {
        int i = 0;
        int j = array.length-1;
        int[] x = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int k = 0; k < array.length; k++) {
            if (!map.containsKey(array[k])) {
                map.put(array[k], k+1);
            } else if (array[k] * 2 == target) {
                x[0] = map.get(array[k]);
                x[1] = k+1;
                return x;
            }
        }
        Arrays.sort(array);
        while (i<j) {
            if (array[i] + array[j] > target) {
                j--;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                x[0] = map.get(array[i])-1;
                x[1] = map.get(array[j])-1;
                if (x[0] > x[1]) {
                    int temp = x[1];
                    x[1] = x[0];
                    x[0] = temp;
                }
                return x;


            }
        }
        return x;
    }
}
