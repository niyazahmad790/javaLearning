package oops;



public class  Dog extends Animal {

    String breed;// properties


     void  ageOfDog(int age ) // Methods
     {
        System.out.println( "The age of Dog is  " +  age);
    }



    public static void main(String[] args){
    Dog d = new Dog(); // Objects
    d.breed = "German Shepherd";
    d.name = "Rocky";

   Dog d1 = new Dog();
    d1.name = "Pitbull"; // second Object
    d1.breed = "Pet";



        System.out.println(d.name + ":" +  d.breed);
        System.out.println(d1.name + ":" +  d1.breed);

        d1.ageOfDog(6);
        d.ageOfDog(9);

}

}
