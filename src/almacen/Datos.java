/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author info5
 */
public class Datos {
    Bebidas Estanteria[][];

    public Datos() {
        this.Estanteria = new Bebidas[4][4];
    }
    public boolean agregarProducto(Bebidas b){
        boolean agregado = false;
        
        for (int i = 0; i < Estanteria.length && !agregado; i++) {
            for (int j = 0; j < Estanteria.length && !agregado; j++) {
                if(Estanteria[i][j] == null){
                    Estanteria[i][j]=b;
                    agregado=true;
                }
            }
            
        }
        return agregado;
    }
    
    
    public boolean eliminarProducto(int id){
        boolean eliminado = false;
        
        for (int i = 0; i < Estanteria.length; i++) {
            for (int j = 0; j < Estanteria.length; j++) {
                if(Estanteria[i][j] != null){
                    if(Estanteria[i][j].getId()==id){
                        Estanteria[i][j]= null;
                    }  
                    eliminado=true;
                }
            }
            
        }
        return eliminado;
    }
    
    public double calcularPrecio(){
        double precioTotal=0;
        for (int i = 0; i < Estanteria.length; i++) {
            for (int j = 0; j < Estanteria.length; j++) {
               precioTotal+=Estanteria[i][j].getPrecio();
            }     
        }
        return precioTotal;
    }
    
    
    public double calcularPrecio(String marca){
        double precioTotal=0;
        for (int i = 0; i < Estanteria.length; i++) {
            for (int j = 0; j < Estanteria.length; j++) {
                if(Estanteria[i][j].getMarca()==marca){
                    precioTotal+=Estanteria[i][j].getPrecio();
                }
            }     
        }
        return precioTotal;
    }
    
    
    public void mostrarBebidas(){       
        for (int i = 0; i < Estanteria.length; i++) {
            for (int j = 0; j < Estanteria.length; j++) {
                if(Estanteria[i][j] != null){
                    System.out.println("Fila: "+i+", columna: "+j+" "+Estanteria[i][j].toString());
                }
            }
            
        }
        
    }
}
