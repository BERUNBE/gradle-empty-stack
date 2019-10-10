import model.Android;
import model.Mobile;
import model.iPhone;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.call("test message");

        iPhone iPhone = new iPhone();
        iPhone.call("test message2");

        Android android = new Android();
        android.call("test message3");
    }
}
