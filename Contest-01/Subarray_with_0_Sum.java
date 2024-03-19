class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int preSum[] = new int[n] ;
        preSum[0] = arr[0] ; 
        for(int i = 1 ; i < n ; i++){
            preSum[i] = preSum[i-1] + arr[i]  ;
        }
        HashMap<Integer, Integer> map = new HashMap<>() ;
        for(int i : preSum) {
            map.put(i, map.getOrDefault(i,0)+1) ;
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2 || entry.getKey() == 0){
                return true; 
            }
        }
        return false ; 
        
    }
}