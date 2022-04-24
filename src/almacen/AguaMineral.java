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
public class AguaMineral extends Bebidas {
    private String origen;
    
    public AguaMineral(){}

    public AguaMineral(String origen, float cantidad, float precio, String marca) {
        super(cantidad, precio, marca);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() +" AguaMineral " + "origen=" + origen ;
    }
    
    
    
    
}
