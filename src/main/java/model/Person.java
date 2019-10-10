package model;

public class Person {
    private String name;

    public void callUsing(Mobile mobile, String message) {
        mobile.call(message);
    }
}
