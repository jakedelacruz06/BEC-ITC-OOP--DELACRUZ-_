public class statmethod {
    public static double Average(double... num) {
        if (num.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double number : num) {
            sum += number;
        }

        return sum / num.length;
    }
}