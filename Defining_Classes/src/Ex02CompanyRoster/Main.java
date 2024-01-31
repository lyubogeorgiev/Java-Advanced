package Ex02CompanyRoster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            String email = "n/a";
            int age = -1;

            if (tokens.length > 4){

                email = tokens[4];
            }

            if (tokens.length > 5){

                age = Integer.parseInt(tokens[5]);
            }

            Employee employee = new Employee(name, salary, position, department, email, age);

            departments.putIfAbsent(department, new ArrayList<>());

            departments.get(department).add(employee);
        }

        HashMap<String, List<Employee>> sortedMap = departments.entrySet().stream().sorted((e1, e2) -> {
                    double e2Avg = e2.getValue().stream().mapToDouble(e -> e.getSalary()).average().orElse(0.0);
                    double e1Avg = e1.getValue().stream().mapToDouble(e -> e.getSalary()).average().orElse(0.0);
                    return (int) (e2Avg - e1Avg);
                })
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        HashMap::new));

        Iterator<Map.Entry<String, List<Employee>>> iterator = sortedMap.entrySet().iterator();
        Map.Entry<String, List<Employee>> highestDepartment;
        if (iterator.hasNext()){
            highestDepartment = iterator.next();

            System.out.printf("Highest Average Salary: %s%n", highestDepartment.getKey());
            highestDepartment.getValue().forEach(e -> System.out.printf("%s %.2f %s %d%n",
                    e.getName(),
                    e.getSalary(),
                    e.getEmail(),
                    e.getAge()));
        }


    }
}
