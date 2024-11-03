public class Employee {

    String id;
    String name;
    float salary;


    public Employee() {

    }
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
       if(salary <= 0){
           System.out.println("Invalid salary");
           return;
       }
        this.salary = salary;
    }

    public float getAnnualSalary () {
        return (this.salary*12);
    }
    
    public void  raisedSalary(int percent ) {

        if(percent <= 0){
            System.out.println("Invalid percentage");
            return;
        }
        this.salary += this.salary*(float)(percent)/100;

        System.out.println("Salary raised to : " + this.salary);

    }

    public void print() {

        System.out.println("__________________");
        System.out.println("| Employee details |");
        System.out.println("|   Name: " + getName());
        System.out.println("|   ID: " + getId());
        System.out.println("|   Salary: " + (int)getSalary());
        System.out.println("|   Annual Salary: " + (int)getAnnualSalary());
        System.out.println("__________________");

    }

}
