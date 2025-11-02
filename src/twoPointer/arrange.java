package twoPointer;

public class arrange {
    public static void main(String[] args) {
        int[] nums = {9, 7, 8 ,15};
        bubbleSort(nums, false);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] nums, boolean ascending){
        for(int x = 0; x < nums.length; x++){
            for(int j = 0; j < nums.length - x - 1; j++){
                boolean condition = ascending ? nums[j] > nums[j+1] : nums[j]  < nums[j+1];

                if(condition){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }


}
