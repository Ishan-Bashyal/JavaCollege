class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return salary + bonus;
    }
}

public class Hw8 {
    public static void main(String[] args) {
        Employee e = new Employee(1000);
        Manager m = new Manager(1000, 300);

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}
