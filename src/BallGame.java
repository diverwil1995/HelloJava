import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("img/ball.png");
    Image board = Toolkit.getDefaultToolkit().getImage("img/board.png");

    double x = 100; //母球橫坐標
    double y = 100; //母球縱座標
    boolean right = true;

    public void paint(Graphics g){
        System.out.println("窗口被畫了一次！");
        g.drawImage(board,0,0,null);
        g.drawImage(ball,(int) x,(int) y,null);

        if(right){
            x = x + 10;
        }else {
            x = x - 10;
        };

        if(x > 762){
            right = false;
        }else if(x < 32) {
            right = true;
        }

    }
    void launchFrame(){
        setSize(860,500);
        setLocation(330,250);
        setVisible(true);

        while(true){
            repaint();
            try{
                Thread.sleep(25);
            }catch (Exception e){
                e.printStackTrace();
            }


        }

    }
    public static void main(String[] args){
        System.out.println("");
        BallGame game = new BallGame();
        game.launchFrame();

    }
}
