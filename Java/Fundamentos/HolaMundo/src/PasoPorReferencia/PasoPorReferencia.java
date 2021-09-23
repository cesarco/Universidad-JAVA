package PasoPorReferencia;

import clases.Persona;

/**
 *
 * @author rodri
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Cesar";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }

    public static Persona cambiaValor(Persona persona) {
        
        if (persona == null) {
            System.out.println("valor de persona invalido : null");
            return null;
        }
        persona.nombre = "KARLA";
        return persona;
    }
}
