
public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = {23,5,6,7, -4, 5};
        int min = numbers[0];
        int max = numbers[0];


        for(int num : numbers){
            if(num > max) max = num;
            else if(num < min) min = num;
        }

        System.out.println(max);
        System.out.println(min);
    }
}
