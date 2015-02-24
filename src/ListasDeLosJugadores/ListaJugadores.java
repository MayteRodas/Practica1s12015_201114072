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
public class ListaJugadores{
    public NodoListaJugadores raiz;
    public NodoListaJugadores n;
    public ListaDatos listaDatosP = new ListaDatos();
    public ListaDatos listaDatosZ = new ListaDatos();
     
     
    public ListaJugadores()
    {
        raiz= null;
    }
    
    public void insertar(String tipo)
    {
        n = new NodoListaJugadores(tipo);
        if(raiz == null){
            
            n.siguiente = raiz;
            if(raiz != null)
            raiz.anterior = n;
            raiz = n; 
        }else
        {
           
           NodoListaJugadores temp = raiz;
            while(temp != null)
            {
                if(temp.siguiente == null)
                    break;
                temp = temp.siguiente;
            }
            temp.siguiente= n;
            n.anterior = temp;
        }
    }
    
    public GraphViz Draw()
    {
        GraphViz g = new GraphViz();
        g.addln(g.start_graph());
        
        int i = 0;
        NodoListaJugadores n = raiz;
        
        if(n!=null)
        {
            g.addln("top[ label = \""+raiz.Tipo+"\" ];");
            n = raiz.siguiente;
            while(n!= null)
            {
                g.addln("n" + i + "[ label=\"" + n.Tipo + "\"];");
                i++;
                n = n.siguiente;
            }            
        }
        
        i = 0;
        n = raiz;
        if(n!=null)
        {
            g.add("top");
            n = raiz.siguiente;
            while(n!=null)
            {
                g.add(" -> n"+i);                
                i++;
                n = n.siguiente;
            }
        }
        g.addln(";");
        return g;
    }
    
}
