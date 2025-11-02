package arrayProblems;

public class ShiftElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3 , 4};

        int first = numbers[0];
        int end = numbers[numbers.length - 1];

        for(int i = numbers.length - 1; i > 0; i--){
            numbers[i] = numbers[i - 1];
        }

//        numbers[numbers.length - 1] = first;
        numbers[0] = end;

        for(int num : numbers){
            System.out.print(num + " ");
        }


    }
}
