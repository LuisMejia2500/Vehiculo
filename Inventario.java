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

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Inventario {


    public  ArrayList<Vehiculo> vehiculos;

    public Inventario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Inventario() {
        vehiculos= new ArrayList();
    }
    
    public void agregarVehiculos(Vehiculo v){
        vehiculos.add(v);
    }
    public void listarVehiculos(){
                vehiculos.forEach((v) -> {
            System.out.println(v);
        });
        }
    
  public static void main(String[] args){
        long total_VehiculosGlobal=100;
        long cantidadGlobalP=0,cantidadGlobalCo=0;
        int valid = 3;
        Inventario inventories = new Inventario();
        Scanner sc = new Scanner(System.in);
        do{
            String datUser = sc.nextLine();
            String[] tests = datUser.split("&");
            valid = Integer.parseInt(tests[0]);
                        switch (valid) {
                case 1:
                    
                    String parametro1 = tests[1];
                    String parametro2 = tests[2];
                    String parametro3 = tests[3];
                    String parametro4 = tests[4];
                    String parametro5 = tests[5];
               
                    if (parametro1.equals("Comercial")) {
                        Comercial carroComercial = new Comercial(parametro1, parametro2, parametro3, parametro4, parametro5);
                        
                        inventories.agregarVehiculos(carroComercial);
                    } else {
                        Particular carroParticular = new Particular(parametro1, parametro2, parametro3, parametro4, parametro5);                       
                        inventories.agregarVehiculos(carroParticular);
                    }
               
                    
                    break;
                case 2:
                    System.out.println("***Inventario de vehículos ***");
                    inventories.listarVehiculos();  
                    break;
                case 3:
                    String p = tests[2];
                    String c=tests[4];
                    long parti=Integer.parseInt(p);
                    long compra_iva=0;
                    long comer=Integer.parseInt(c);
                    long total_Vehiculos=parti+comer;
                    long total_Comercial=0, total_Particular=0, total_Compra;
                    
                    long valor_Iva=20;
                    if(total_VehiculosGlobal<=0| total_Vehiculos>100){
                    System.out.println("Lo sentimos no tenemos stock suficiente");
                    System.out.println("---");
                    }else{
                        if(total_Vehiculos>20){
                            valor_Iva=0;
                            total_Comercial=comer*4000000000000;
                            total_Particular=parti*300000000000000000;
                            total_Compra=(total_Comercial+total_Particular)+valor_Iva;
                            System.out.println("CONCESIONARIO UNCAR");
                            System.out.println("UNCAR - UNIVA");
                            System.out.println("NIT: 899.999.063");
                            System.out.println("Cliente: "+ tests[5]);
                            System.out.println("Vehículo Cant Precio");
                            System.out.println("Particular x"+parti+ " $30000000");
                            System.out.println("Comercial x"+comer+ " $40000000");
                            System.out.println("Iva: $"+valor_Iva);
                            System.out.println("Total:  $"+total_Compra);
                            System.out.println("---");
                            total_VehiculosGlobal=total_VehiculosGlobal-total_Vehiculos;
                            cantidadGlobalCo=cantidadGlobalCo+comer;
                            cantidadGlobalP=cantidadGlobalP+parti;
                        }else{
                            for(int i=1; i<total_Vehiculos; ++i){
                                valor_Iva-=1;

                            }
                            
                            total_Comercial=comer*40000000;
                            total_Particular=parti*30000000;
                            compra_iva=total_Comercial+total_Particular;
                            valor_Iva=(valor_Iva*compra_iva)/100;
                            total_Compra=(total_Comercial+total_Particular)+valor_Iva;
                            System.out.println("CONCESIONARIO UNCAR");
                            System.out.println("UNCAR - UNIVA");
                            System.out.println("NIT: 899.999.063");
                            System.out.println("Cliente: "+ tests[5]);
                            System.out.println("Vehículo Cant Precio");
                            System.out.println("Particular x"+parti+ " $30000000");
                            System.out.println("Comercial x"+comer+ " $40000000");
                            System.out.println("Iva: $"+valor_Iva);
                            System.out.println("Total:  $"+total_Compra);
                            System.out.println("---");
                            total_VehiculosGlobal=total_VehiculosGlobal-total_Vehiculos;
                            cantidadGlobalCo=cantidadGlobalCo+comer;
                            cantidadGlobalP=cantidadGlobalP+parti;
                            
                            
                            
                           
                        }
                    
                    }
                   
                    break;
                case 4:
                    System.out.println("Particular: " + (100-cantidadGlobalP));
                    System.out.println("Comercial: "+ (100-cantidadGlobalCo));
                    System.out.println("---");
                    break;
                    
                case 5:
                    break;
                        }
            }while (valid != 5);
        
        
        }
        }
    
