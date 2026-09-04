class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0, j=s.length()-1;

        while(i < j){
            char ch = s.charAt(i);
            char chh = s.charAt(j);
            if((ch >= 'a' && ch <='z') || (ch >= '0' && ch <='9'))     {
                if((chh >= 'a' && chh <='z') || (chh >= '0' && chh <='9'))         {
                    if(ch != chh) return false;
                }else{
                    j--;
                    continue;
                }
            }else{
                i++;
                continue;
            }
            i++;
            j--;
        }

        return true;
    }
}
