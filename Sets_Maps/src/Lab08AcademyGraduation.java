import java.text.DecimalFormat;
import java.util.*;

public class Lab08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            String[] inputStudentGrade = scanner.nextLine().split("\\s+");

            List<Double> studentGrades = new ArrayList<>();

            for (String studentGrade : inputStudentGrade) {
                studentGrades.add(Double.parseDouble(studentGrade));
            }

            students.putIfAbsent(studentName, new ArrayList<>());

            students.get(studentName).addAll(studentGrades);

        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##############");

        for (Map.Entry<String, List<Double>> student : students.entrySet()) {
            double avg = calculateFloatAverage(student.getValue());

            System.out.printf("%s is graduated with %s%n", student.getKey(), decimalFormat.format(avg));
        }
    }

    private static double calculateFloatAverage(List<Double> numbers) {
        float sum = 0.0f;

        for (Double number : numbers) {
            sum += number;
        }

        return sum / (double) numbers.size();
    }
}
