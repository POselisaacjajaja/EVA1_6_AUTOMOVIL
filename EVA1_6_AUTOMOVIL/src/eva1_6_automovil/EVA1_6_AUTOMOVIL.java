/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AUTO auto1 = new AUTO();

       
       auto1.setMarca("Nissan");
       auto1.setModelo("blancoxd");
       auto1.setPlacas("cum-420");
       auto1.setAño(2023);
       auto1.setDueño("William M. Buttlicker");
       
       
       auto1.imprimirDatos();
    }
    
}
