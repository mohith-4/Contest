class Solution {
    public boolean isPowerOfFour(int n) {
        
        double log = Math.log(n)/Math.log(4) ;
        System.out.println(log) ; 
        if(log - Math.floor(log) == 0)
            return true ;

    return false ; 
    }
}