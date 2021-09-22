
package PasoPorValor;

/**
 *
 * @author rodri
 */
public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        CambioValor(x);
        System.out.println("x cabio = " + x);
        
    }
    
    public static void CambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
