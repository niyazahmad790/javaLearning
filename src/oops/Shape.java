package oops;

abstract class Shape {
    abstract void draw();
}
 class Circle extends Shape{
     public void draw(){
            System.out.println("Draw the Circle");

        }

        public static void main(String[] args){
         Circle C = new Circle();
         C.draw();
        }





}
