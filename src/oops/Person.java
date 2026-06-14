package oops;

import java.security.PrivateKey;

public class Person {

    private String name;
    private int age;


    public void setName(String name){
        this.name = name;

    }
   public String getName(){
       return name;

   }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public static void main(String[] args){
       Person p1 = new Person();
       p1.setName("Ayan");
       p1.setAge(11);

        System.out.println("Name is " + p1.getName());
        System.out.println("Age is " + p1.getAge());


}

}
