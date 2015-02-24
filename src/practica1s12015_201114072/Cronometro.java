
package practica1s12015_201114072;
import java.awt.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Cronometro extends JLabel{

    

    Cronometro(){

        setBounds(660,30,200,60);
        setForeground(Color.BLACK);
      	setFont(new Font("Algerian",Font.BOLD,20));
    }
    int minuto=0,segundo=0,hora=0,segtot=0;
    Timer t;
    Timer t2;
    

    public void correr()
    {
     t = new Timer (100, new ActionListener ()
    {
                    @Override
    public void actionPerformed(ActionEvent e)
    {  if(segundo==59){
                    segundo=0;minuto++;
                }
                if(minuto==59){
                    minuto=0;hora++;
                }
                segundo++;segtot++;

                if(segundo<10){
                    if(minuto<10)
                        setText("Tiempo: 0"+hora+": 0"+minuto+": 0"+segundo);

                    else
                        setText("Tiempo: 0"+hora+": "+minuto+": 0"+segundo);

                }
                else{
                    if(minuto<10)
                        setText("Tiempo: 0"+hora+": 0"+minuto+": "+segundo);
                    else
                        setText("Tiempo: 0"+hora+": "+minuto+": "+segundo);
                }


                    }
    });     t.start();
    
    }
    
    public void correr2()
    {
     t2 = new Timer (500, new ActionListener ()
    {
                    @Override
    public void actionPerformed(ActionEvent e)
    {  
       
    }
    });     
     
     t2.start();
     
    }
    public void pausa(int n){
        if((n % 2)==0){t.stop();}
        else{t.start();} }

    public void reiniciar(){hora=0;minuto=0;segundo=0;segtot=0;}
    public int tot(){return segtot;}
    public int horas(){return hora;}
    public int minus(){return minuto;}
    public int segs(){return segundo;}

}

