/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDeLosJugadores;

/**
 *
 * @author EQUIPO
 */
public class NodoListaPlantas {
    
    public String nombre, imagen, puntos, ataque;
    public NodoListaPlantas anterior;
    public NodoListaPlantas siguiente;
    
    
    public NodoListaPlantas(String nom, String img, String ptos, String ata)
    {
        nombre = nom;
        imagen = img;
        puntos = ptos;
        ataque = ata;
        anterior = siguiente = null;
    }
}
