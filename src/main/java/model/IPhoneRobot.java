package model;

public class IPhoneRobot {
    private String name;

    public void callUsing(IPhone iPhone, String message) {
        iPhone.call(message);
    }
}
