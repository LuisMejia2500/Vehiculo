/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo_master;

/**
 *
 * @author gustavo
 */
public class Particular  extends Vehiculo{
    
     String color;  

    public Particular(String velocidad, String pasajeros, String placa, String tipo, String color) {
        super(velocidad, pasajeros, placa, tipo);
        this.color=color;
    }

    @Override
    public String toString() {
        String c = "\t" + "Vehículo " + this.velocidad + " - " + "Placa: " + this.tipo + "\n\t" + "velocidad: " + this.placa + " km/h" + "\n\t" + "pasajeros: " + this.pasajeros + "\n\t" + "color: " + this.color;
         return c;
    }
    
   
    
}
