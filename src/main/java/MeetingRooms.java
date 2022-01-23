import java.util.Arrays;

public class MeetingRooms {
  public boolean canAttendMeetings(Interval[] intervals){
    int[] starts = new int[intervals.length];
    int[] ends = new int[intervals.length];
    
    for(int i = 0; i < intervals.length;i++){
      starts[i] = intervals[i].start;
      ends[i] = intervals[i].end;
    }
      
      Arrays.sort(starts);
      Arrays.sort(ends);
      
      
      for(int i = 0;i < starts.length-1;i++){
          if(starts[i + 1] < ends[i]){
              return false;
          }
      }
      
      return true;
  }
}

class Interval{
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
}