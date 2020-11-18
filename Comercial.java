/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package vehiculo_master;

/**
 *
 * @author gustavo
 */
public class Comercial extends Vehiculo{
     String cargaMaxima;  

    public Comercial(String velocidad, String pasajeros, String placa, String tipo,String cargaMaxima) {
        super(velocidad, pasajeros, placa, tipo);
        this.cargaMaxima=cargaMaxima;
    }

    @Override
    public String toString() {
        String s = "\t" + "Vehículo " + this.velocidad + " - " + "Placa: " + this.tipo + "\n\t" + "velocidad: " + this.placa + " km/h" + "\n\t" + "pasajeros: " + this.pasajeros + "\n\t" + "Carga máxima: " + this.cargaMaxima +"kg";
        return s;
        
    }
    
}