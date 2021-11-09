package my_oop_jar;

public class Employee {
    public String firstname;
    public String lastname;
    private int salary;
    public String dressCode;

    public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
        this.firstname = firstnameInput;
        this.lastname = lastnameInput;
        this.salary = salaryInput;
        this.dressCode = "tshirt";
    }

    public void hello() {
        System.out.println("Hello " + this.firstname);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public void setDressCode(String newDressCode) {
        this.dressCode = newDressCode;
    }

    // Add function gossip
    public void gossip(Employee c, String s) {
        System.out.printf("Hey %s', %s\n", c.firstname, s);
        return;
    }

}
