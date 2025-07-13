import java.awt.*;
import java.awt.event.*;




class Myframe extends Frame implements Runnable {
int x,y,tx,ty;


Myframe(){

  super("Moving Ball Animation");
   x=100;
   tx=1;
   ty=1;

   y=100;

  Thread t1=new Thread(this);
  t1.start();
  addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
          System.exit(0);
      }
  });





}
public  void paint(Graphics g){
  g.setColor(Color.BLUE);
  g.fillOval(x,y,50,50);
}


    @Override
    public void run() {

       while(true){
           x+=tx;
           y+=ty;


           if(x<0 || x>450){
               tx=tx*-1;

           }
           if(y<20 || y>400){
             ty=ty*-1;


           }


          repaint();
           try {
               Thread.sleep(5);
           }
           catch (InterruptedException e){

           }
       }
    }
}



class Main{
   public static void main(String[] args) throws Exception {
   Myframe m=new Myframe();
   m.setSize(500,450);
   m.setVisible(true);
   }
}
