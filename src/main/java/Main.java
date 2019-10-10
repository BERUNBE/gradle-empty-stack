import model.*;

public class Main {
    public static void main(String[] args) {

        Android android = new Android();
        android.setColor("green");
        android.setName("kupals");


        IPhone iPhone = new IPhone();
        iPhone.setColor("green");
        iPhone.setName("kupals");
//        mobile.describe();
//        mobile.call("test message");

        Person tao = new Person();
        tao.callUsing(iPhone, "Hello?");
        tao.callUsing(android, "Hello?");

        IPhoneRobot drone = new IPhoneRobot();
//        drone.callUsing(android, "Hello?"); //cannot compile
        drone.callUsing(iPhone, "Hello?");

    }
}
