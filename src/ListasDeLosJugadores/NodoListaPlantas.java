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
    
    public String tipo, imagen;
    public NodoListaPlantas anterior;
    public NodoListaPlantas siguiente;
    
    
    public NodoListaPlantas(String t, String img)
    {
        tipo = t;
        imagen = img;
        anterior = siguiente = null;
    }
}
