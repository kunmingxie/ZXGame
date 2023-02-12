import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Talk_inc {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException, UnsupportedFlavorException {
        int num=0;
        String whatsay="";
        int Time_int=15;
        int All_time_int=15;
        while(true)
        {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(Time_int);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(Time_int);
            Transferable canonicalNameSelection = new StringSelection(whatsay+String.valueOf(num++));
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

            //实现复制功能：将当前程序中的字符串复制到剪贴板中去
            clipboard.setContents(canonicalNameSelection, null);
            canonicalNameSelection = clipboard.getContents(null);
            //获取剪贴板上的内容
            Object obj =  canonicalNameSelection.getTransferData(DataFlavor.stringFlavor);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(Time_int);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(Time_int);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(Time_int);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(Time_int);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(Time_int);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(All_time_int);
        }

    }

}
