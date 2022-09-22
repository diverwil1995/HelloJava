import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
    //加載圖片，撞球檯、籃球
    Image board = Toolkit.getDefaultToolkit().getImage("img/board.png");
    Image ball = Toolkit.getDefaultToolkit().getImage("img/ball.png");
    //設定籃球的x,y座標以及方向判定
    double x = 100;
    double y = 100;
    double degree = 3.14/3;

    //建立繪圖方法
    public void paint(Graphics g){
        //加入console.log，方便觀察此function有無運行
        System.out.println("窗口被畫了一次！");

        //先繪製撞球檯再畫籃球，才不會讓籃球被球檯覆蓋
        //這邊先做強制轉型，將變數x,y指定為int
        g.drawImage(board,0,0,null);
        g.drawImage(ball,(int) x,(int) y,null);

        //
        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);

        if(y > 410 || y < 80){
            degree = -degree;
        }

        if(x > 760 || x < 40){
            degree = 3.14 - degree;
        }

    }

    //視窗加載
    void launchFrame(){
        //指定視窗預設大小
        setSize(860,500);
        //指定視窗顯示位置
        setLocation(330,250);
        //指定視窗可見度
        setVisible(true);

        //以迴圈來實現圖片的持續變化
        while(true){
            //用repaint來重複調用上述的paint功能
            repaint();
            try{
                //設定休眠時間，單位為毫秒（1/1000秒）
                //故以此表示一秒鐘重繪40次
                Thread.sleep(25);
            }catch (Exception e){
                e.printStackTrace();
            }


        }

    }
    public static void main(String[] args){
        System.out.println("");
        BallGame2 game = new BallGame2();
        game.launchFrame();

    }
}