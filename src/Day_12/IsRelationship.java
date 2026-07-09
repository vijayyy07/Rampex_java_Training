package Day_12;

public class IsRelationship {
    pubilc static void main(String[]args){
        Vehicle v1=new Vehicle();
        Vehicle c1=new Car();
        Vehicle v2=new Car();
        v2.start();
    }
}
class Vehicle{
    pubilc void start(){
        System.out.println("Car Started...");
    }
    public void drive(){

    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("car driving...");
    }
}
