import java.util.*;

public class Lab05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String studentName = tokens[0];
            double grade = Double.parseDouble(tokens[1]);

            students.putIfAbsent(studentName, new ArrayList<>());

            students.get(studentName).add(grade);
        }

        for (Map.Entry<String, List<Double>> student : students.entrySet()) {

            System.out.printf("%s -> ", student.getKey());

            for (double s : student.getValue()) {
                System.out.printf("%.2f ", s);
            }

            System.out.printf("(avg: %.2f)%n", calculateAverage(student.getValue()));
        }
    }

    public static double calculateAverage(List<Double> numbers){
        // find the total sum
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }

        //return average
        return sum / numbers.size();
    }
}
