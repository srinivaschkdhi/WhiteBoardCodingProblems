
public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWiseDistance = 0;
        int totalDistance = 0;

        for (int i = 0; i < distance.length; i++) {
            if (start < destination && (i >= start && i < destination)) {
                clockWiseDistance += distance[i];
            }

            if (start > destination && (i >= start || i < destination)) {
                clockWiseDistance += distance[i];
            }

            totalDistance += distance[i];
        }

        return Math.min(clockWiseDistance, totalDistance - clockWiseDistance);
    }

    public int distanceBetweenBusStops2(int[] distance, int start, int destination) {
        int clockWiseDis = 0;
        int totalDis = 0;
        
        
        if(start < destination){
            for(int i = 0; i < distance.length;i++){
                if(i >= start && i < destination)
                    clockWiseDis += distance[i];
                totalDis += distance[i];
            }
        }else{
            for(int i = 0; i < distance.length;i++){
                if(i >= start || i < destination){
                    clockWiseDis += distance[i];
                }
                totalDis += distance[i];
            }
        }
        
        return Math.min(clockWiseDis,totalDis - clockWiseDis);
    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWiseDis = 0;
        int totalDis = 0;
        
        
        if(start < destination){
            for(int i = 0; i < distance.length;i++){
                if(i >= start && i < destination)
                    clockWiseDis += distance[i];
                totalDis += distance[i];
            }
        }else{
            for(int i = 0; i < distance.length;i++){
                if(i >= start || i < destination){
                    clockWiseDis += distance[i];
                }
                totalDis += distance[i];
            }
        }
        
        return Math.min(clockWiseDis,totalDis - clockWiseDis);
    }
}
