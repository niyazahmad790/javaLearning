package oops.SchoolManagement;

public class Student extends Person {


    private String grade;
    private int marks;

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public String getGrade(){
        return grade;
    }

    public int getMarks(){
        return marks;
    }
    public void displayInfo(){
        System.out.println("Student Name :-" + getName());
        System.out.println("Age :- " + getAge());
        System.out.println("Marks :-"  + getMarks());
        System.out.println("Grade :-" + getGrade());
    }
}
