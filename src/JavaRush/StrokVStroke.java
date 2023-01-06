package JavaRush;

public class StrokVStroke {

    public static void main(String[] args) {
        String string = "Кто желает поработать?";
        int getWordCount = getWordCount(string);
        System.out.println("Количество слов в строке \"" + string + "\" равно " + getWordCount);
    }

    public static int getWordCount(String string) {
        String[]strings = string.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length ; i++) {
            count++;
        }
        return count;

    }
}
