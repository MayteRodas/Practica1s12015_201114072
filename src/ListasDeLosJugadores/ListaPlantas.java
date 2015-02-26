/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDeLosJugadores;

import practica1s12015_201114072.GraphViz;

/**
 *
 * @author EQUIPO
 */
public class ListaPlantas {
    
      public NodoListaPlantas raiz;
      public NodoListaPlantas n;
    
    
    public ListaPlantas(){
        raiz = null;
    }

    public NodoListaPlantas getPrimero() {
        return raiz;
    }
    
    private boolean estaVacia(){
         boolean vacia = false; 
         if ( raiz == null ) { 
             vacia = true; 
         }
            return vacia; 
    }
    
    public void insertar(String dato, String imagen, String puntos, String ataque){
        if(estaVacia()){
            raiz = new NodoListaPlantas(dato, imagen, puntos, ataque);
        }else{
            NodoListaPlantas temp = raiz;
            while(temp.siguiente!=null){
                temp = temp.siguiente;
            }
            temp.siguiente = new NodoListaPlantas(dato, imagen, puntos, ataque);
        }
    }
    
    public void recorrer(){
        NodoListaPlantas temp = raiz;
        while(temp!=null){
            System.out.println(temp.nombre);
            temp = temp.siguiente;
        }     
    }
    
    public GraphViz Draw()
    {
        GraphViz g = new GraphViz();
        g.addln(g.start_graph());
        
        int i = 0;
       NodoListaPlantas n = raiz;
        
        if(n!=null)
        {
            g.addln("top[ label = \""+raiz.nombre+"\" ];");
            n = raiz.siguiente;
            while(n!= null)
            {
                g.addln("n" + i + "[ label=\"" + n.nombre + "\"];");
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
