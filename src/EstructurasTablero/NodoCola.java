/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasTablero;

/**
 *
 * @author EQUIPO
 */
public class NodoCola {
    String nombre;
    int puntos;
    String ataque;
    String imagen;
    
    NodoCola siguiente;

    public NodoCola(String nombre, int puntos, String ataque, String imagen) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.ataque = ataque;
        this.imagen = imagen;
        siguiente = null;
    }
  
}
