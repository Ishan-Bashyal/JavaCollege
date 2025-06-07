class Employee {
    public void work() {
        System.out.println("Employee");
    }

    public void getSalary() {
        System.out.println("Salary");
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager");
    }

    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();        
        hrManager.getSalary();   
    }
}
