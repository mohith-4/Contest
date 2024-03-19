
class Sol
{
    int isPossible (String S)
    {
       HashMap<Character , Integer> map = new HashMap<>() ;
       
       for(char ch : S.toCharArray()){
           map.put(ch, map.getOrDefault(ch,0)+ 1) ;
       }
       
       int oddCount = 0 ;
       
       for(int val : map.values()){
           if(val%2 != 0){
               oddCount++ ; 
           }
       }
       if(oddCount > 1){
           return 0 ; 
       }
       return 1 ; 
    }
}