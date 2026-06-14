package oops.SchoolManagement;

public abstract class Person {
    public abstract void displayInfo();
    private String name;
    private int age;

    //Setter

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args){

        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(22);
        s1.setGrade("A");
        s1.setMarks(95);
        s1.displayInfo();

        Teacher t1 = new Teacher();
        t1.setName("Sahil");
        t1.setSubject("Code");
        t1.setSalary(78000);
        t1.displayInfo();
    }
}
