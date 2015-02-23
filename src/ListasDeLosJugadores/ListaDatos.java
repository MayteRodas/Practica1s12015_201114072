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
public class ListaDatos {
    
    public NodoDatos raiz;
    public NodoDatos n;
    
    
    public ListaDatos()
    {
        raiz= null;
    }
    
    public void insertar(String tipo)
    {
        n = new NodoDatos(tipo);
        if(raiz == null){
            
            n.siguiente = raiz;
            if(raiz != null)
            raiz.anterior = n;
            raiz = n; 
        }else
        {
           
           NodoDatos temp = raiz;
            while(temp != null)
            {
                if(temp.siguiente == null)
                    break;
                temp = temp.siguiente;
            }
            temp.siguiente= n;
            n.anterior = temp;
        }
        
        System.out.println("inserto el dato correcto");
    }
    
    public GraphViz Draw()
    {
        GraphViz g = new GraphViz();
        g.addln(g.start_graph());
        
        int i = 0;
        NodoDatos n = raiz;
        
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
    
    private boolean estaVacia(){
     boolean vacia = false; 
     if ( raiz == null ) { 
         vacia = true; 
     }
        return vacia; 
    }


     //elimina el nodo del final de la lista
 public void eliminarFinal(NodoDatos buscar) {
    if( !estaVacia() ) { 
        NodoDatos ultimo = n.anterior;
        if
         ( ultimo.Tipo == buscar.Tipo ) { 
            System.out.println("Se elimino "+buscar.Tipo);
            raiz = null; 
            n = null;
            
        }
        else
        {  
             System.out.println("Se elimino "+buscar.Tipo);
            ultimo.siguiente = null; 
            n = ultimo;
        } 
    }
 }
 
 
 
 //devuelve una referencia al nodo buscado, si no se encuentra devuelve null 
 
 public NodoDatos buscar(String dato) {
     NodoDatos buscado = null; 
     NodoDatos iterador = raiz;
     while( buscado == null && iterador != null ) {
   
         if( iterador.Tipo.equals(dato)) {
             buscado = iterador;
             eliminarFinal(buscado);
         } 
      iterador = iterador.siguiente; 
     }
     System.out.println("Lo encontro");
      return buscado; 
      
}

    
}
