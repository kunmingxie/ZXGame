import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Talk {
    public static void main(String[] args) throws AWTException, InterruptedException {
        while(true)
        {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(25);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(25);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(25);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(25);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(25);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(25);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(25);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(25);
        }

    }

}
