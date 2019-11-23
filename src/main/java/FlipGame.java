public class FlipGame {
  public List<String> generatePossibleNextMoves(String s){
      List<String> possibleStates = new ArrayLis<String>();
      int i = 0;
      while(i < s.length()){
        int nextMove = (i == 0)?s.indexOf("++"):s.indexOf("++",i);
        if(nextMove == -1){
          return possibleStates;
         }
         
         String nexState = s.substring(0,nextMove)+"--"+s.substring(nextMove+2);
         possibleStates.add(nextState);
         i = nextState + 1;
     }
     
     return possibleStates;
   }
 }  
