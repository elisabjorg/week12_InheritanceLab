package Management;

import Staff.Employee;


public class Manager extends Employee {

    private String deptName;

    public Manager (String name, int NInumber, double salary, String deptName) {
        super(name, NInumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
