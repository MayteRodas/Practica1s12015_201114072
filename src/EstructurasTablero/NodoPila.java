/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasTablero;

/**
 *
 * @author EQUIPO
 */
public class NodoPila {
    public NodoPila siguiente;
    String nombre;
    int puntos;
    String ataque;
    String imagen;

    public NodoPila(String nombre, int puntos, String ataque, String imagen) {
        this.siguiente = null;
        this.nombre = nombre;
        this.puntos = puntos;
        this.ataque = ataque;
        this.imagen = imagen;
    }
}
