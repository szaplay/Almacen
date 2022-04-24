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
abstract class Bebidas {
    
    private static int idActual=1;
    
    private int id;
    private float cantidad;
    private float precio;
    private String marca;
    
    public Bebidas(){}

    public Bebidas( float cantidad, float precio, String marca) {
        this.id = idActual++;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", marca=" + marca ;
    }
    
    
}
