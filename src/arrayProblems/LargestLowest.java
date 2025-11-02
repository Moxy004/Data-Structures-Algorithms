package arrayProblems;

public class LargestLowest {
    public static void main(String[] args) {
        int[] numbers = {4,67,3,22,1};
        int largest = numbers[0];
        int lowest = numbers[0];
        int second = Integer.MIN_VALUE;

        for(int x = 0; x < numbers.length; x++) {
            if (numbers[x] > largest) {
                second = largest;
                largest = numbers[x];
            } else if (numbers[x] > second && numbers[x] != largest) {
                second = numbers[x];
            }

            if(numbers[x] < lowest){
                lowest = numbers[x];
            }
        }


        System.out.println("Largest: " + largest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Second Largest: " + second);
    }
}
