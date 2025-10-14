
public class Target {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 3, 7, 3, 9, 3, 2, 5, 7, 7};
        int target = 3;
        int count = 0;
        boolean isFound = false;

        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] == target){
                System.out.println("Target found at index: " + x);
                count++;
                isFound = true;
                break;
            }
        }

        if(isFound){
            System.out.println("The number " + target + " appeared " + count + " time(s).");
        } else {
            System.out.println("Number not found!");
        }

        System.out.println("Checking for duplicates....");
        boolean[] visited = new boolean[numbers.length];
        boolean hasDuplicate = false;

        for(int x = 0; x < numbers.length; x++){
            if(visited[x]) continue;
            int dupCount = 1;

            for(int j = x + 1; j < numbers.length; j++){
                if(numbers[x] == numbers[j]){
                    dupCount++;
                    visited[j] = true;
                }
            }

            if(dupCount > 1) {
                System.out.println(numbers[x] + " appeared " + dupCount + " time(s).");
                hasDuplicate = true;
            }
        }

        if(!hasDuplicate){
            System.out.println("No duplicates found");
        }
    }
}
