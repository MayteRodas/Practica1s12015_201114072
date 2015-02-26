/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114072;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author EQUIPO
 */
public class Tablero extends javax.swing.JFrame {

    /**
     * Creates new form Tablero
     */
    
    Barra carga;
    ImageIcon mi = new ImageIcon(getClass().getResource("Carga.jpeg"));
    Matriz matriz[][]=new Matriz[12][8];
    int minuto=0,segundo=0,hora=0,segtot=0;
    Timer t;
    Timer t2;
    int conteo=0;
    
    
//    ImageIcon img1 = new ImageIcon(getClass().getResource("/imagenes/P1.jpg"));
//    ImageIcon img2 = new ImageIcon(getClass().getResource("/imagenes/P2.jpg"));
//    ImageIcon img3 = new ImageIcon(getClass().getResource("/imagenes/Z3.jpg"));
//    ImageIcon img4 = new ImageIcon(getClass().getResource("/imagenes/Z4.jpg"));
//    ImageIcon img5 = new ImageIcon(getClass().getResource("/imagenes/P5.png"));
//    ImageIcon fondo = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
    
    
    
    public Tablero() {
        initComponents();
        
        
        for(int i=0; i<12; i++){
        final int ii=i;
            for(int j=0; j<8; j++){ 
                final int jj=j;
                
                
                matriz[ii][jj]=new Matriz();
                matriz[ii][jj].setBounds(110+ii*40,110+jj*40,40,40);
                matriz[ii][jj].setVisible(true);
                matriz[ii][jj].setBackground(Color.gray);
                matriz[ii][jj].addActionListener(new java.awt.event.ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        matriz[ii][jj].addKeyListener(new KeyAdapter(){
                            @Override
                            public void keyPressed(KeyEvent evt) {
//                                     
                                
                                int x=ii;
                                int y=jj;
                                int []vector = {0,0,0,0,0,0,0,0,0,0,0,0};

                                    if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
                                        vector[0]=matriz[x][y].estado;
                                        vector[1]=matriz[x][y-1].estado;
                                        vector[2]=matriz[x-1][y-1].estado;
                                        vector[3]=matriz[x-1][y].estado;
                                        
                                        matriz[x][y].estado=vector[1];
                                        matriz[x][y-1].estado=vector[2];
                                        matriz[x-1][y-1].estado=vector[3];
                                        matriz[x-1][y].estado=vector[0];   
//                                       pintarMatriz();
                                       
                                       
                                    }
//                                    
                                    else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
                                        vector[0]=matriz[x][y].estado;
                                        vector[1]=matriz[x-1][y].estado;
                                        vector[2]=matriz[x-1][y-1].estado;
                                        vector[3]=matriz[x][y-1].estado;

                                        matriz[x][y].estado=vector[1];
                                        matriz[x-1][y].estado=vector[2];
                                        matriz[x-1][y-1].estado=vector[3];
                                        matriz[x][y-1].estado=vector[0];   
//                                       pintarMatriz();

                                    }
                                    
                                    if((matriz[x][y].estado==matriz[x][y].estado)&&(matriz[x][y].estado==matriz[x-1][y].estado)&&(matriz[x][y].estado==matriz[x-1][y-1].estado)&&(matriz[x][y].estado==matriz[x][y-1].estado)){
                                        matriz[x][y].estado=0;
                                        matriz[x-1][y].estado=0;
                                        matriz[x-1][y-1].estado=0;
                                        matriz[x][y-1].estado=0; 
                                        conteo=conteo+50;
//                                        pintarMatriz();
                                    }
                                    else{
                                        if((matriz[x][y].estado==matriz[x][y].estado)&&(matriz[x][y].estado==matriz[x-1][y].estado)&&(matriz[x][y].estado==matriz[x][y-1].estado)&&(matriz[x][y].estado==matriz[x-1][y-1].estado)){
                                            matriz[x][y].estado=0;
                                            matriz[x-1][y].estado=0;
                                            matriz[x][y-1].estado=0;
                                            matriz[x-1][y-1].estado=0; 
                                            conteo=conteo+50;
//                                            pintarMatriz();
                                            
                                        }
                                    }
                            }
                        });
                    }
                });

                fondito.add(matriz[ii][jj]);
     
           }
        }
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondito.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondito, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondito, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondito;
    // End of variables declaration//GEN-END:variables
}
