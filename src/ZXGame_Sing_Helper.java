import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author hand
 * @version 1.0
 * @date 2022/11/4 12:53
 */
public class ZXGame_Sing_Helper {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException, AWTException {
        LinkedList<String>linkedList_q=new LinkedList();
        LinkedList<String>linkedList_a=new LinkedList();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("Q.txt")));
        while (true)
        {
            String q=bufferedReader.readLine();
            String a=bufferedReader.readLine();
            if(q==null&&a==null)
            {
                break;
            }
            linkedList_q.add(q);
            linkedList_a.add(a);

        }
        bufferedReader.close();
        while (true)
        {
            System.out.println("*****请输入搜索内容*****");
            Scanner scanner=new Scanner(System.in);
            String query=scanner.nextLine();
            for (int i = 0; i < linkedList_q.size(); i++) {
                if(linkedList_q.get(i).contains(query))
                {
                    System.out.println(linkedList_q.get(i));
                    Transferable canonicalNameSelection = new StringSelection(linkedList_a.get(i).substring(3,linkedList_a.get(i).length()));
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

                    //实现复制功能：将当前程序中的字符串复制到剪贴板中去
                    clipboard.setContents(canonicalNameSelection, null);
                    canonicalNameSelection = clipboard.getContents(null);
                    //获取剪贴板上的内容
                    Object obj =  canonicalNameSelection.getTransferData(DataFlavor.stringFlavor);
                    System.out.println(obj);
                    Scanner temp=new Scanner(System.in);
                    String s=temp.nextLine();
                    if(s.equals("1"))
                    {
                        break;
                    }

                    if(s.equals("2"))
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
                    }
                }
            }

            System.out.println("\n");
//好帅
            //second update
        }
    }
}
