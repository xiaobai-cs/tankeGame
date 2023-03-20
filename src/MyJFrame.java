import javax.swing.*;

/**
 * @version 1.0
 * @auther 小白学CS
 * 设置现实的窗口
 */
public class MyJFrame extends JFrame {
    //定义panel
    MyPanel_ mp = null;

    //MyJFrame的构造器
    public MyJFrame() {
        mp = new MyPanel_();
        this.add(mp);//把面板定义成游戏绘制区域
        this.setSize(1000, 750);//窗口大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口
        this.setVisible(true);//显示出窗口
    }

    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame();

    }
}
