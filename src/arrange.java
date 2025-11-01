public class arrange {
    public static void main(String[] args) {
        int[] nums = {2,7,9,15};

        for(int x = 0; x < nums.length; x++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
