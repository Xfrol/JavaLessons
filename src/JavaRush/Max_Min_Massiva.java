package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Max_Min_Massiva {

   public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum ;

        int[] array = new int[20];

       for (int i = 0; i < array.length;i++) {
           int number = Integer.parseInt(reader.readLine());
           array[i] = number;
       }
       IntStream intStream = Arrays.stream(array);
       OptionalInt optionalInt = intStream.max();
       maximum = optionalInt.getAsInt();

       IntStream intStream1 = Arrays.stream(array);
       OptionalInt optionalInt1 = intStream1.min();
       minimum = optionalInt1.getAsInt();



        System.out.print(maximum + " " + minimum);
    }
}
