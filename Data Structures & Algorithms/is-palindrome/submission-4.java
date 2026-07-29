class Solution {
    public boolean isPalindrome(String s) {
        int lenp=0,lent=0;
        int p=0;
        int t=s.length()-1;
        if(s.length()%2==0){
            lenp=s.length()/2;
            lent=lenp+1;
        }
        else{
            lenp=(s.length()+1)/2;
            lent=lenp;
        }
        while(p<t){
            while((p<t) && !(Character.isLetterOrDigit(s.charAt(p)))){
                p++;
            }
            while((p<t) && !(Character.isLetterOrDigit(s.charAt(t)))){
                t--;
            }
            if((Character.toLowerCase(s.charAt(p))!=Character.toLowerCase(s.charAt(t)))){
                return false;
            }
            p++;
            t--;
        }
        return true;
    }
}
