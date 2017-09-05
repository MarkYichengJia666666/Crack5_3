/**
 * Created by jiayicheng on 17/8/14.
 */
public class flip {
    public int flipBit(int d){
        if(~d==0)
            return Integer.BYTES*8;
        int current=0;
        int previous=0;
        int max=1 ;
        while(d!=0)
        {
            if((d & 1)==1)
                current++;
            else if((d & 1)==0)
            {
                previous=(d & 2)==0? 0:current;
                current=0;
            }
            max=Math.max(previous+current+1,max);
            d>>>=1;
        }
        return max;
    }
}
