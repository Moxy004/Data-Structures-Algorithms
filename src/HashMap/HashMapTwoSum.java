package HashMap;

import java.util.*;

public class HashMapTwoSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] numbers = {2,7, 11, 15};
        int target = 17;

        for(int x = 0; x < numbers.length; x++){
            int needed = target - numbers[x];

            if(map.containsKey(needed)){
                System.out.println("Pair found " + numbers[x] + " + " + needed + " = " + target);
                System.out.println("Indices: [" + map.get(needed) + ", " + x + "]");
                return;
            }

            map.put(numbers[x], x);
        }

        System.out.println("No pair found!");
    }
}
