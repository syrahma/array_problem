package test.array;

import java.util.Arrays;

/**
 * Created by ibbluser on 11/30/2023.
 */
public class Compute {

    static Pair getMinMax(long a[], long n)
    {
        //Write your code here



        Pair pair= new Pair(0L,0L);
        Arrays.sort(a);
        pair.first= a[0];
        pair.second= a[a.length-1];

        return pair;

    }

    public static void main(String[] args) {
        Pair pair=getMinMax(new long[]{45,65,1,3},new long[]{45,65,1,3}.length);

        System.out.println(pair.first);
        System.out.println(pair.second);
    }
}
