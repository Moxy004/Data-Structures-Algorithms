package arrayProblems;

public class arraySwap {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        swapping(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static int[] swapping(int[] nums){

        if(nums == null || nums.length < 2){
            return new int[]{};
        }

        int temp = nums[1];
        nums[1] = nums[nums.length - 2];
        nums[nums.length - 2] = temp;

        return nums;
    }
}
