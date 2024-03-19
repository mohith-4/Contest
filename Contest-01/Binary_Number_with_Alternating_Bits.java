class Solution {
    public boolean hasAlternatingBits(int n) {
        
       int num =  n ^ (n>>1) ; 

       if(((num+1)&num) == 0){
        return true ; 
       }
       return false ; 
    }
}