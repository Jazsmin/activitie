/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritos;

/**
 *
 * @author UTBIS
 */
public class carritos2 {
       private String modelo;
       private String Color;
       private String ID;
       private double Precio;
       
        public carritos2 (String modelo, String Color, String ID, double Precio){
           this.modelo=modelo;
           this.Color=Color;
           this.ID=ID;
           this.Precio=Precio;
      }//end of carritos 2

    public String getModelo() {
        System.out.println("Modelo: ");
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        System.out.println("Color: ");
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getID() {
        System.out.println("ID: ");
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrecio() {
        System.out.println("Precio: ");
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
        
}
