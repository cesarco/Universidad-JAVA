/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author rodri
 */
public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
    }
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return (a + b);
        
    }
}
