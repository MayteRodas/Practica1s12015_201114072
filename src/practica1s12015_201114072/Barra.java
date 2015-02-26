package practica1s12015_201114072;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Barra extends JWindow {
  public static Cronometro crono=new Cronometro();
  BorderLayout border = new BorderLayout();
  JLabel im = new JLabel();
  JPanel s  = new JPanel();
  FlowLayout southPanelFlowLayout = new FlowLayout();
  JProgressBar progressBar = new JProgressBar(0,100);
  ImageIcon imageIcon;
  Timer t;
    String la=" ";
    int i;

  public Barra(ImageIcon ima) {
    this.imageIcon = ima;
    dib();
  }

  public void dib() {
    im.setIcon(imageIcon);
    this.getContentPane().setLayout(border);
    s.setLayout(southPanelFlowLayout);
    s.setBackground(Color.BLACK);
    this.getContentPane().add(im, BorderLayout.CENTER);
    this.getContentPane().add(s, BorderLayout.SOUTH);
    s.add(progressBar, null);
    this.pack();
  }

  public void setp(int max){

    progressBar.setMaximum(max);
    progressBar.setForeground(Color.BLACK);
    progressBar.setBackground(Color.WHITE);
    progressBar.setPreferredSize(new Dimension(600,30));
    progressBar.setBorderPainted(false);
    progressBar.setFocusable(false);
    progressBar.setFont(new Font("Baskerville Old Face",Font.ITALIC,16));

  }

  public void setpr(int pro)
  {
     int progreso = pro;
        progressBar.setValue(progreso);}

  public void setpro(String mes, int p)
  {
     int progreso = p;
     String m = mes;
    setpr(p);
    progressBar.setValue(progreso);
    setm(m);  }

  public void setm(String me)
 {
    if (me==null){
      me = "";
      progressBar.setStringPainted(false);}
    else{
      progressBar.setStringPainted(true);}

    progressBar.setString(me); }

public void vel(){

   
        for (long j=0; j<3000; ++j)
      {

      }
         t = new Timer (200, new ActionListener ()
{
                    @Override
    public void actionPerformed(ActionEvent e)
    {
         if(i==1){la="Iniciando...  ";
        }
        if(i==60){la="Cargando Interfaz...  ";
        }
        if(i==80){la="Abriendo Aplicacion...  ";
       
        }
        if (i==100){
             CreacionJugadores cj = new CreacionJugadores();
             cj.setLocationRelativeTo(null);
             cj.setVisible(true);
             Barra.this.setVisible(false);
        }
                        setpro(la +i, i);
                   i++; }
});
     
t.start();
    }
}