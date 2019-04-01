package Staff;

public abstract class Employee {

    private String name;
    private int NInumber;
    private double salary;

    public Employee(String name, int NInumber, double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNInumber() {
        return NInumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double salary) {
        if (salary > 0)
        this.salary += salary;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
