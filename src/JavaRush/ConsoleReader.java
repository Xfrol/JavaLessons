package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString= reader.readLine();
        return readString;


    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readInt = Integer.parseInt(reader.readLine());
        return readInt;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double readDouble = Double.parseDouble(reader.readLine());
        return readDouble;


    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean readBoolen = Boolean.parseBoolean(reader.readLine());
        return readBoolen;


    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    }
}
