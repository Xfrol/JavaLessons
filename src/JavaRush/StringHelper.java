package JavaRush;

public class StringHelper {

    public static String multiply(String text) {
        String result = "";
        result = (text+text+text+text+text);
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        return result;
    }

    public static void main(String[] args) {


    }
}
