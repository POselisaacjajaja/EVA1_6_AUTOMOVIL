/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_automovil;

import java.awt.BorderLayout;

/**
 *
 * @author isaaczapatto
 */
public class AUTO {
    //ATRIBUTOS
    private String Marca;
    private String Modelo;
    private String NoPlacas;
    private String Placas;
    private int Año;
    private String Dueño;
    private double Adeudo;
    
    //CONSTRUCTOR
    public AUTO(){
        Marca = "None";
        Modelo = "None";
        NoPlacas = "XXX-000";
        Placas = "XXX-000";
        Año = 0000;
        Dueño = "None";  
        Adeudo = 0.0;
    }
    
    //MÉTODOS get & set c/u
    public String getMarca(){     
    return Marca;
    }
    public void setMarca(String valor){
     Marca = valor;
    }
    
    
    public String getModelo(){     
    return Modelo;
    }
    public void setModelo(String valor){
     Modelo = valor;
    }
    
    
    public String getPlacas(){     
    return NoPlacas;
    }
    public void setPlacas(String valor){
     NoPlacas = valor;
     Placas = NoPlacas.toUpperCase();
    }
    
    
    public int getAño(){     
        return Año;
    }
    public void setAño(int valor){
        Año = valor;
        if(Año <= 2000){
            Adeudo = 1500;
        }else if(Año>=2001 & Año<=2005){
            Adeudo = 2000;
        }else if(Año>=2006 & Año<=2010){
            Adeudo = 2500;
        }else if(Año>=2011 & Año<=2015){
            Adeudo = 3000;
        }else if(Año>=2016 & Año<=2023){
            Adeudo = 4000;
        }
    }
    
    
    public String getDueño(){
        return Dueño;
    }
    public void setDueño(String valor){
        Dueño = valor;
    }
    
    
    

    
    
    public void imprimirDatos(){
        
        System.out.println("Marca: " + Marca); 
        System.out.println("Modelo: " + Modelo); 
        System.out.println("Placas: " + Placas); 
        System.out.println("Año: " + Año); 
        System.out.println("Dueño: " + Dueño); 
        System.out.println("Adeudo: $" + Adeudo);
    }
}
