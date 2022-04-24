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
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebidas agua=new AguaMineral("mendoza", 2, 20, "manaos");
        Bebidas coca=new BebidasAzucaradas(3, false, 4, 25, "manaos");
        Datos Estanteria = new Datos();
        
        if (Estanteria.agregarProducto(agua)){
            System.out.println("Producto agregado");
        }else{
            System.out.println("No agregado");
        }
        
        if (Estanteria.agregarProducto(coca)){
            System.out.println("Producto agregado");
        }else{
            System.out.println("No agregado");
        }
        
        Estanteria.mostrarBebidas();
        
        
        if (Estanteria.eliminarProducto(2)){
            System.out.println("Producto eliminado");
        }else{
            System.out.println("No eliminado");
        }
        
        Estanteria.mostrarBebidas();
        
        //System.out.println(Estanteria.calcularPrecio());
        
        
    }
    
}
