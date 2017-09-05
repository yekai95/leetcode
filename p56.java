package first;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class p56 {
public List<Interval> merge(List<Interval> intervals) {
        int len=intervals.size();
        if(len<=1)return intervals;
        Collections.sort(intervals,new IntervalsComparator());
        Interval newInterval=intervals.get(0);
        List<Interval> res=new ArrayList<Interval>();
        for(int i=1;i<len;i++)
        {
            Interval interval=intervals.get(i);
            if(newInterval.end<interval.start)
            {
               res.add(newInterval);
               newInterval=interval;
            }else
            {
                newInterval=new Interval(newInterval.start,Math.max(newInterval.end,interval.end));
            }
        }
        res.add(newInterval);
        return res;
    }
}
class IntervalsComparator implements Comparator<Interval>
{
    public int compare(Interval i1,Interval i2)
    {
       return i1.start-i2.start;
    }
}
class Interval {
	   int start;
	   int end;
	   Interval() { start = 0; end = 0; }
	   Interval(int s, int e) { start = s; end = e; }
	}