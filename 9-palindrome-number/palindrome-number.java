class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int rev=0;
        while(x>0){
            int temp=x%10;
            rev=rev*10+temp;
            x=x/10;
        }
        if(rev==a) {
            return true;
        }
        return false;
    }
}