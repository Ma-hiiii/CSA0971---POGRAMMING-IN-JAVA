class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    private double travelAllowance;
    private double houseRentAllowance;
    public Manager(String name, int id, double salary, double travelAllowance, double houseRentAllowance) {
        super(name, id, salary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }
    public double getSalary() {
        return super.getSalary() + travelAllowance + houseRentAllowance;
    }
}
class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 50000);
        Manager mgr = new Manager("Jane Smith", 102, 70000, 5000, 8000);
        System.out.println("Employee's Salary: " + emp.getSalary());
        System.out.println("Manager's Salary: " + mgr.getSalary());
    }
}