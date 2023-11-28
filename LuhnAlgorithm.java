import java.util.ArrayList;
import java.util.List;

public class LuhnAlgorithm {
    public static void main(String[] args) {
        int[] array = new int[]{6, 0, 7, 8, 8, 5, 0, 5, 4, 8, 0, 2, 7, 0, 7, 9};
        int evenElement = 0;
        List<Integer> oldElement = new ArrayList<>();
        List<Integer> resultEvenElement = new ArrayList<>();
        List<Integer> resultOldElement = new ArrayList<>();
        int sumResultEvenElement = 0;
        int sumResultOldElement = 0;
        int sumOldElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenElement = array[i] * 2;
                if (evenElement >= 9) {
                    resultEvenElement.add(evenElement % 10 + 1);

                } else {
                    resultOldElement.add(evenElement);
                }
            } else {
                oldElement.add(array[i] * 1);
            }
        }
        for (int i = 0; i < resultEvenElement.size(); i++) {
            sumResultEvenElement = sumResultEvenElement + resultEvenElement.get(i);

        }
        for (int i = 0; i < resultOldElement.size(); i++) {
            sumResultOldElement = sumResultOldElement + resultOldElement.get(i);

        }
        for (int i = 0; i < oldElement.size(); i++) {
            sumOldElement = sumOldElement + oldElement.get(i);

        }
        if ((sumOldElement + sumResultOldElement + sumResultEvenElement) % 10 == 0) {
            System.out.println("Credit card is valid ");
        } else {
            System.out.println("Credit card is not invalid");
        }


    }
}
