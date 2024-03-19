class Solution {
    public int trap(int[] height) {
        int res = 0 ; 
        int l = 0 , r = height.length -1 ;
        int l_max = Integer.MIN_VALUE , r_max =Integer.MIN_VALUE; 
        int n = height.length ; 
        int lmax[] = new int[n] ; 
        int rmax[] = new int[n] ;
        for(int i =0 ; i < n ; i++) {
            l_max = Math.max(l_max , height[i]) ;
            lmax[i]  = l_max ;  

            r_max = Math.max(r_max , height[n-i]);
            rmax[i] = r_max;
        }
         

        for(int i =0 ; i < n ; i++){
            int min = Math.min(lmax[i]  , rmax[i]) ;
             res = res + min - height[i] ; 
        }

        return res ; 

    }
}