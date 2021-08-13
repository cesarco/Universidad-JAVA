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
    
    // Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecuntando constructor");
    }
    

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);

    }

    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return (a + b);

    }
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;  // el arg1 se asigna al atributo this.a
        this.b = arg2;
        return this.sumarConRetorno();
    }
}
