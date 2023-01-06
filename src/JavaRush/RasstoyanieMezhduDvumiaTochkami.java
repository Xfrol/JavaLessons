package JavaRush;

public class RasstoyanieMezhduDvumiaTochkami {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = ((double) x2 - (double) x1) * ((double) x2 - (double) x1) + ((double) y2 - (double) y1) * ((double) y2 - (double) y1);
        return Math.sqrt(a);
    }

    public class U {
        public static double getDistance(int x1, int y1, int x2, int y2) {
            int dx = x2 - x1;
            int dy = y2 - y1;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public static void main(String[] args) {

        }
    }
}