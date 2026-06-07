package oops;

public class Car {

    String Color;
    String Brand;
    int Speed;

    void Drive(String name){
        System.out.println("Driver name " + name );
    }
    public static void main(String[] args){
        Car car1 = new Car();
        car1.Color = "Black";
        car1.Brand = "Tata";
        car1.Speed = 56;

        Car car2 = new Car();
        car2.Color = "White";
        car2.Brand = "Mahindra";
        car2.Speed = 78;

        System.out.println("Below information of Car 1");

        System.out.println("Car1 color :" + car1.Color);
        System.out.println("Car1 Brand :" + car1.Brand);
        System.out.println("Car1 Speed :" + car1.Speed);

        System.out.println("Below information of Car 2");

        System.out.println("Car2 color :" +  car2.Color);
        System.out.println("Car2 Brand :" + car2.Brand);
        System.out.println("Car2 Speed :" + car2.Speed);

        car1.Drive("Sahiba");
        car2.Drive("Ayan");

    }
}
