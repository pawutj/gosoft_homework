package my_oop_jar;

public class Employee {
    public String firstname;
    public String lastname;
    private int salary;

    public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
        this.firstname = firstnameInput;
        this.lastname = lastnameInput;
        this.salary = salaryInput;
    }

    public void hello() {
        System.out.println("Hello " + this.firstname);
    }

    public int getSalary() {
        return salary;
    }

    // Add function gossip
    public void gossip(Employee c, String s) {
        return;
    }
}
