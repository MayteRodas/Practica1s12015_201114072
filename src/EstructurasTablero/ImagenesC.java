/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasTablero;
import ListasDeLosJugadores.*;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author EQUIPO
 */
public class ImagenesC extends JLabel{
    
 public ImagenesC(ListaPlantas lista){
        
        //este siclo solo sirve para saber cuantos nodos existen
        NodoListaPlantas raiz = lista.getPrimero();
        int i=0;
        while(raiz!=null){
            i++;
            raiz = raiz.siguiente;
        }
        
        //este pedaso le da las propiedades
        this.setVisible(true);
        this.setBounds(0, 0, 300, (i*100)+30);
        this.setPreferredSize(new Dimension(700, (i*100)+30));
        this.setLayout(null);
                
        //este siclo inerta los jlabels en el panel 
        raiz = lista.getPrimero();
        i=0;
        while(raiz!=null){
            
            ImageIcon a = new ImageIcon(raiz.imagen);
            java.awt.Image b = a.getImage();
            ImageIcon c = new ImageIcon(b.getScaledInstance(80, 80, java.awt.Image.SCALE_DEFAULT));

            JLabel imagen = new JLabel(c);
            imagen.setBounds(5, 5+(i*100), 80, 80);
            imagen.setVisible(true);
            this.add(imagen);

            JLabel nombre = new JLabel("NOMBRE: "+raiz.nombre);
            nombre.setBounds(95, 10+(i*100), 200, 25);
            nombre.setVisible(true);
            this.add(nombre);
            
            JLabel puntos = new JLabel("PUNTOS: "+raiz.puntos);
            puntos.setBounds(95, 10+(i*200), 200, 25);
            puntos.setVisible(true);
            this.add(puntos);
            
            JLabel ataque = new JLabel("ATAQUE: "+raiz.ataque);
            ataque.setBounds(95, 10+(i*300), 200, 25);
            ataque.setVisible(true);
            this.add(ataque);

            i++;
            raiz = raiz.siguiente;
        }
    }
}
