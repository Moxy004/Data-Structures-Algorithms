package twoPointer;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static int[] moveZeroes(int[] nums){
        if(nums == null || nums.length < 2) return new int[]{};

        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast] != 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
        return nums;
    }
}
