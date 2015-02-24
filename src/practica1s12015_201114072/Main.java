/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114072;

import javax.swing.ImageIcon;

/**
 *
 * @author @author EQUIPO
 */
class Main {
Barra carga;
    public Main() {
        iniciar();
    }
    
    public void iniciar(){
    ImageIcon mi = new ImageIcon(getClass().getResource("Carga.jpeg"));
        carga = new Barra(mi);
        carga.setLocationRelativeTo(null);
        carga.setp(100);
        carga.setVisible(true);
        carga.vel();
}
    
}
