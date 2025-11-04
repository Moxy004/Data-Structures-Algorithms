package arrayProblems;

public class MaxMinSwap {
    public static void main(String[] args) {
        int[] nums = {7, 2, 9, 4, 1, 6};

//        swapMinMax(nums);
        swapAdjacent(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }

    }

    public static int[] swapMinMax(int[] nums){
        int min = nums[0], max = nums[0];
        int maxIndex = 0, minIndex = 0;

        if(nums == null || nums.length < 2){
            return new int[]{};
        }

        for(int x = 0; x < nums.length; x++){
            if(nums[x] > max){
                max = nums[x];
                maxIndex = x;
            } else if (nums[x] < min){
                min = nums[x];
                minIndex = x;
            }
        }

        int temp = nums[maxIndex];
        nums[maxIndex] = nums[minIndex];
        nums[minIndex] = temp;

        return nums;
    }

    public static int[] swapAdjacent(int[] nums){

        if(nums == null || nums.length < 2){
            return new int[]{};
        }

        for(int x = 0; x < nums.length - 1; x+=2){
            int temp = nums[x];
            nums[x] = nums[x + 1];
            nums[x + 1] = temp;
        }

        return nums;
    }
}
