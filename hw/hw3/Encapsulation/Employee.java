public class Employee {
    private String name;
    private int id;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
        }
    }

    public double getSalary() {
        return salary;
    }
}
