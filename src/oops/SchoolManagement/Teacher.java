package oops.SchoolManagement;

public class Teacher extends Person {

private int salary;
private String subject;

 public void setSalary(int salary){
     this.salary = salary;

 }
 public void setSubject(String subject){
     this.subject = subject;
 }

 public int getSalary(){
     return salary;

 }
    public String getSubject(){
     return subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher Name " + getName());
        System.out.println("Salary " + getSalary());
        System.out.println("Subject " + getSubject());
    }
}



