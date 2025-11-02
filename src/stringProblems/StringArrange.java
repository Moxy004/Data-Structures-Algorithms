package stringProblems;

public class StringArrange {
    public static void main(String[] args) {

        String s = "madam";

        if(isPalindrome(s)){
            System.out.println("Word is a palindrome");
        } else {
            System.out.println("Word is not a palindrome");
        }

        System.out.println(removeDuplicate(s));
    }

    public static boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String removeDuplicate(String s){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

}
