public class objstat{
    public static void main(String[] args) {
        double[] values = { 5.2, 19.0, 5.3 };

        // Use the static method to calculate the average
        double average = statmethod.Average(values);

        System.out.println("Average: " + average);
    }
}