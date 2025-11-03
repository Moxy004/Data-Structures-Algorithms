package stringProblems;

public class firstlast {
    public static void main(String[] args) {
        int[] nums = {2,7,9,15};
        getFirstLast(nums);

        System.out.print("Modified Array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }


    }

    public static int[] getFirstLast(int[] arr){
        if(arr == null){
            return new int[]{};
        }

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return arr;

    }
}
