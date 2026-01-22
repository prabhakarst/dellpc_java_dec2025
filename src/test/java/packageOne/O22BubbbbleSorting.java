package packageOne;

import org.apache.commons.codec.binary.Base16OutputStream;

import java.util.Arrays;

public class O22BubbbbleSorting {
    public static void main(String[] args) {
        int a4[] = {2, 1, 90, 76, -9};
        int temp;
        for (int i = 0; i < a4.length; i++) {
            for (int j = i + 1; j < a4.length; j++) {

                if (a4[i] > a4[j]) {
                    temp = a4[i];
                    a4[i] = a4[j];

                    a4[j] = temp;


                } else {

                }

            }
        }
System.out.println(Arrays.toString(a4));

    }

}