import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Main {

    public static void main(String[] args) throws FindFailed {
        int timeout = 20;
        Screen screen = new Screen();
        Pattern cell = new Pattern(args[0]);
        Pattern saveBtn = new Pattern(args[1]);
        Pattern closeBtn = new Pattern(args[2]);

        screen.wait(cell, timeout);
        screen.type(cell, "test");

        screen.wait(saveBtn, timeout);
        screen.click(saveBtn);

        screen.wait(closeBtn, timeout);
        screen.click(closeBtn);
    }
}
