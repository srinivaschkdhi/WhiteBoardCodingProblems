public class PaintHouse {
  public int minCost(int[][] costs){
    if(costs == null || costs.length == 0)
      return 0;
      
      int n =  costs.length;
      for(int i = 0;i < costs.length; i++){
        costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
        costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
        costs[i][2] += Math.min(costs[i-1][0],costs[i-1][11]);
       }
       
       return Math.min(costs[n-1][2],(Math.min(costs[n-1][0],costs[n-1][1])));
      }
    }  
