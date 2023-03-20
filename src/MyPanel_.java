import javax.swing.*;
import java.awt.*;

/**
 * @version 1.0
 * @auther 小白学CS
 * 背景幕布，坦克绘制区域
 */
public class MyPanel_ extends JPanel {
    //定义自己的坦克
    Mytank mytank = null;

    public MyPanel_() {
        mytank = new Mytank(100, 100);//初始化我的坦克的位置
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认为黑色

        //画出坦克——封装方法
        dramTank(mytank.getX(), mytank.getY(), g, 0, 0);
        //敌人的坦克
        dramTank(mytank.getX() + 60, mytank.getY(), g, 0, 1);
    }
    //编写方法，画出坦克

    /**
     * @param x                 ,坦克的左上角横坐标
     * @param y，坦克的左上角纵坐标
     * @param g，画笔
     * @param direct，坦克的方向，上下左右
     * @param type，坦克的样式，例如颜色
     */
    public void dramTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同的类型设置不同颜色的坦克
        switch (type) {
            case 0://自己的坦克
                g.setColor(Color.yellow);
                g.drawString("is me", x + 10, y + 80);//标注那个是自己的坦克
                break;
            case 1://敌人的坦克
                g.setColor(Color.red);
                g.drawString("is fill", x + 10, y + 80);//标注那个是敌人的坦克
                break;
        }
        //根据不同的方向绘制坦克
        switch (direct) {
            case 0://向上的
                /**
                 * getX，距离左上角的横坐标
                 * getY，距离左上角的纵坐标
                 * 10，坦克的本身的宽
                 * 60，坦克的本身的高
                 * false，
                 */
                g.fill3DRect(x, y, 10, 60, false);//3D的矩形框_坦克左边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克的身体
                g.fillOval(x + 10, y + 20, 20, 20);//坦克的炮台
                g.drawLine(x + 20, y + 30, x + 20, y);//坦克的炮筒
                g.fill3DRect(x + 30, y, 10, 60, false);//坦克右边的轮子
                break;
            case 1://向下的
            case 2://向左的
            case 3://向右的
            default://无变化的
                System.out.println("无变化~");
        }
    }
}
