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
public class BebidasAzucaradas extends Bebidas {
    private float porcentajeAzucar;
    private boolean promocion;
    
    public BebidasAzucaradas(){}

     public BebidasAzucaradas(float porcentajeAzucar, boolean promocion, float cantidad, float precio, String marca) {
        super(cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public float getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(float porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    } 
    
    /*public double getPrecio(){
        if(isPromocion()){
            return super.getPrecio()*0.9;
        }else{
            return super.getPrecio();
        }
    }*/

    @Override
    public String toString() {
        return super.toString() +"Bebidas Azucaradas " + "porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion ;
    }
    
}
