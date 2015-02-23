/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasTablero;
import practica1s12015_201114072.*;

/**
 *
 * @author EQUIPO
 */
public class Pila {
     public NodoPila cima;
    
    public Pila()
    {
        cima = null;
    }
    
    public void Push(NodoPila n)
    {        
        n.siguiente = cima;
        cima = n;
    }
    
    public NodoPila Pop()
    {
        if(cima == null)
            return null;
        NodoPila tmp = cima;        
        cima = cima.siguiente;
        return tmp;
    }
    
    public GraphViz Draw()
    {
        GraphViz g = new GraphViz();
        g.addln(g.start_graph());
        g.addln("rankdir = LR;");
        
        int i = 0;
        NodoPila n = cima;
        
        if(n!=null)
        {
            g.addln("top[ label = \""+cima.nombre+"\" ];");
            n = cima.siguiente;
            while(n!= null)
            {
                g.addln("n" + i + "[ label=\"" + n.nombre + "\"];");
                i++;
                n = n.siguiente;
            }            
        }
        
        i = 0;
        n = cima;
        if(n!=null)
        {
            g.add("top");
            n = cima.siguiente;
            while(n!=null)
            {
                g.add(" -> n"+i);                
                i++;
                n = n.siguiente;
            }
        }
        g.addln(";");
        
        g.addln(g.end_graph());
        
        return g;
    }
}
