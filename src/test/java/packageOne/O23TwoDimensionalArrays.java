package packageOne;

import java.util.Arrays;

public class O23TwoDimensionalArrays {

    public static void main(String[] args) {
        int twoD[][]=new int[2][2];
twoD[0][0]=10;
twoD[1][1]=20;
twoD[1][0]=30;
        System.out.println(Arrays.deepToString(twoD));

    }
}
