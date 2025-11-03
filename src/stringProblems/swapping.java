package stringProblems;

public class swapping {
    public static void main(String[] args) {

        int a = 5;
        int b = 9;
        int[] result = swapValues(a,b);

        System.out.println("A = " + result[0]);
        System.out.println("B = " + result[1]);
    }

    public static int[] swapValues(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a,b};

    }
}
