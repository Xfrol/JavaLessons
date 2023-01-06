package JavaRush;

public class A_Mne_Tak_Nyzhno {

    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {

        if(number instanceof Byte){
            byte b;
            b = (byte) number;
            return  b/2 + "b";
        }
        else if (number instanceof Integer) {
            int i;
            i = (int) number;
            return i/3+ "";
        }
        else if( number instanceof Double){
            double d;
            d = (double)number;
            return d*20+"";
        }
        else {
            return UNEXPECTED_TYPE;
        }


    }
}
