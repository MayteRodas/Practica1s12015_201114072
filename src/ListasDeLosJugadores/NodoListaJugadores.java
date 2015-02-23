/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDeLosJugadores;
import practica1s12015_201114072.*;

/**
 *
 * @author EQUIPO
 */
public class NodoListaJugadores{
    
    public String Tipo;
    NodoListaJugadores anterior;
    NodoListaJugadores siguiente;
    public static ListaDatos listaD = new ListaDatos();
    
    public NodoListaJugadores(String t)
    {
        Tipo = t;
        anterior = siguiente = null;
    }
    
}
