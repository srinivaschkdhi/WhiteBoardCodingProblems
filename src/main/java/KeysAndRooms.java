
import java.util.List;
import java.util.Stack;


public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean seen[] = new boolean[rooms.size()];
        seen[0] = true; // first room visited by default

        Stack<Integer> collectedKeysFromVisitedRooms = new Stack<>();
        collectedKeysFromVisitedRooms.add(0); // first room key by default

        while (!collectedKeysFromVisitedRooms.isEmpty()) {
            int currKey = collectedKeysFromVisitedRooms.pop();

            List<Integer> keysInThisRoom = rooms.get(currKey); // collect keys from this room.

            for (int key :  keysInThisRoom) {
                if (!seen[key]) { // if room is not seen, see the room and collect keys from it.
                    seen[key] = true;
                    collectedKeysFromVisitedRooms.add(key);
                }
            }
        }

        for (boolean visited : seen) {
            if (!visited) {
                return false;
            }
        }

        return true;
    }

    public boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        boolean seen[] = new boolean[rooms.size()];
        Stack<Integer> collectedKeysFromVisitedRooms = new Stack<>();
        
        collectedKeysFromVisitedRooms.add(0); // you have first room key by default

        while (!collectedKeysFromVisitedRooms.isEmpty()) {
            
            int currKey = collectedKeysFromVisitedRooms.pop();
            seen[currKey] = true;

            List<Integer> keysInThisRoom = rooms.get(currKey); // collect keys from this room.

            for (int key :  keysInThisRoom) {
                if (!seen[key]) { // add keys to stack . to avoid repeation.to avoid going to visited room 
                    // again dont take keys of already visited room.
                    collectedKeysFromVisitedRooms.add(key);
                }
            }
        }

        for (boolean visited : seen) {
            if (!visited) {
                return false;
            }
        }

        return true;
    }
    
    public boolean canVisitAllRooms3(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int key = stack.pop();
            visited[key] = true;

            List<Integer> keys = rooms.get(key);

            for (int k : keys)
                if (!visited[k])
                    stack.push(k);
        }

        for (boolean visit : visited)
            if (!visit)
                return false;
        return true;
    }
}
