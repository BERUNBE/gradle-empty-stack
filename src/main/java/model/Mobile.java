package model;

public class Mobile {

    private String name;
    private String color;
    private String brand;

    private int messageLengthLimit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMessageLengthLimit() {
        return messageLengthLimit;
    }

    public void setMessageLengthLimit(int messageLengthLimit) {
        this.messageLengthLimit = messageLengthLimit;
    }

    public void call(String inputMessage) {
        if (brand == null) {
            System.out.println("Message : " + inputMessage);
        } else {
            if(inputMessage.length() > messageLengthLimit) {
                System.out.println("<" + brand + "> Message cannot be sent");
            } else {
                System.out.println("<" + brand + ">Message : " + inputMessage);
            }
        }
    }

    public void describe() {
        System.out.println("name: " + name + ", color: " + color + ", brand: " + brand);
    }
}
