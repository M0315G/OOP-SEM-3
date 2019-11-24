public class Prac8e {
    public static void main(String[] args) {
        SportCar ferrariXSF5 = new SportCar();

        ferrariXSF5.display();
    }
    
}

class Car{ 
    double speed = 0;
    int noOfGears = 5;

    Car(){
        speed = 30;
        noOfGears = 5;
    }

    void display(){
        System.out.println("Speed: " + speed);
        System.out.println("No of gears: " + noOfGears);
    }

}

class SportCar extends Car{
    String AirBallonType;

    SportCar(){
        speed = 50;
        noOfGears = 7;
        AirBallonType = new String("Type1");
    }

    void display(){
        super.display();
        System.out.println("AirBallonType: " + AirBallonType);
    }


}