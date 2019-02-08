 

import java.util.Arrays;
public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        
        int max = integers[0];
        for (int i=1;i<integers.length;i++){
            if (integers[i]> max){
                max = integers[i];
        }}return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int x = Math.max(integers[0],integers[1]);
        int y = Math.max(integers[2],x);
        return y;
    }
}
