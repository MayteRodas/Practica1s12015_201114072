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
public class NodoDatos {
    
    public String Tipo;
    public NodoDatos anterior;
    public NodoDatos siguiente;
    
    
    public NodoDatos(String t)
    {
        Tipo = t;
        anterior = siguiente = null;
    }
}
