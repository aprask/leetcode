class Solution {
    public static void main(String [] args)
    {
        int x = 121;
        System.out.print(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for(int i = 1; i < n/2; i++)
        {
            if(s.charAt(i-1)!=s.charAt(n-i)) return false;
        }
        return true;
    }
}
