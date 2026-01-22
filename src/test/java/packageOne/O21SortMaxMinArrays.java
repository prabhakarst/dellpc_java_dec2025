package packageOne;

import java.util.Arrays;

public class O21SortMaxMinArrays {
    public static void main(String[] args) {
        int ages[]={2,56,89,1,67};

        //ascending order
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        //print particular index values
        System.out.println(ages[2]);

        //greatest value
        System.out.println(ages[ages.length-1]);

        //length
        System.out.println("arrays length "+ages.length);

        //partial sorting
       Arrays.sort(ages,1,3);
        System.out.println(Arrays.toString(ages));
    }
}
