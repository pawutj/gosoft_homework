package my_oop_jar;

public class CEO extends Employee {
    public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }

    public int getSalary() {
        return super.getSalary() * 2;
    };

    public void work(Employee luckyEmployee) {
        this.fire(luckyEmployee);
        this.hire(luckyEmployee);
        this.seminar();
        this.golf();
    }

    public void fire(Employee luckyEmployee) {
        System.out.printf("%s has been fired! Dress with :%s\n", luckyEmployee.firstname, luckyEmployee.dressCode);
    }

    public void hire(Employee luckyEmployee) {
        System.out.printf("%s has been hired back! Dress with :%s\n", luckyEmployee.firstname, luckyEmployee.dressCode);
    }

    public void assignNewSalary(Employee luckyEmployee, int newSalary) {
        // เขียนให้ตรวจว่าเงินเดือนน้อยกว่าเดิมหรือไม่
        // หากเงินเดือนน้อยกว่าเดิมให้ขึ้นข้อความว่า <ชื่อพนักงาน>'s salary is less than
        // before!! และไม่ต้อง set เงินเดือนใหม่ให้พนักงานคนนั้น
        // หากเงินเดือนมากกว่าเดิมให้ set เงินเดือนใหม่ให้สำเร็จ และขึ้นข้อความว่า
        // <ชื่อพนักงาน>'s salary has been set to <newSalary>
        if (newSalary < luckyEmployee.getSalary())
            System.out.printf("%s's salary is less than before!!\n", luckyEmployee.firstname);
        else {
            luckyEmployee.setSalary(newSalary);
            System.out.printf("%s's salary has been set to %d\n", luckyEmployee.firstname, luckyEmployee.getSalary());
        }

    }

    private void seminar() { // simulate private method
        this.dressCode = "suit";
        System.out.println("He is going to seminar Dress with :" + this.dressCode);
    };

    private void golf() { // simulate private method
        this.dressCode = "golf_dress";
        System.out.println("He goes to golf club to find a new connection. Dress with :" + this.dressCode);
    };
}
