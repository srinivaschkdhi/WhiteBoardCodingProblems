
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

            for (int key :
                    keysInThisRoom) {
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
}
