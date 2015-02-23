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
public class Cola {
    
    public NodoCola adelante;
    public NodoCola atras;
    
    public Cola()
    {
        atras = adelante = null;
    }
    
    public void Insert(NodoCola n)
    {
        if(adelante ==null)        
            adelante = n;        
        else        
            atras.siguiente = n;
        
        atras = n;
    }
    
    public void Pop()
    {
        NodoCola tmp;
        if(adelante != null)
        {
            tmp = adelante;
            adelante = adelante.siguiente;
        }                
    }
    
    public GraphViz Draw()
    {
        GraphViz g = new GraphViz();
        g.addln(g.start_graph());
        g.addln("rankdir = LR;");
        
        int i = 0;
        NodoCola n = adelante;
        
        if(n!=null)
        {
            g.addln("top[ label = \""+adelante.nombre+"\" ];");
            n = adelante.siguiente;
            while(n!= null)
            {
                g.addln("n" + i + "[ label=\"" + n.nombre + "\"];");
                i++;
                n = n.siguiente;
            }            
        }
        
        i = 0;
        n = adelante;
        if(n!=null)
        {
            g.add("top");
            n = adelante.siguiente;
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
