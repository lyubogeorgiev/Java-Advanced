package Ex07Google;

public class Company {
    private final String name;
    private final String department;
    private final double salary;

    public Company(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%n%s %s %.2f",
                this.name,
                this.department,
                this.salary);
    }
}
