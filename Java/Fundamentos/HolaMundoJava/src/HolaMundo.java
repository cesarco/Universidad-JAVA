//
//import java.util.Scanner;

Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {   //main permite ejecutar el programa
        System.out.println("Cesar Luis Rodriguez Solera");
    }
}
//
//public class HolaMundo {

//    public static void main(String args[]) {//main permite ejecutar el programa
////definimos la variable
//        int miVariableEntera = 10; //10 = literal numerica
//        System.out.println(miVariableEntera);
//       // modificamos el valor de la variable
//        miVariableEntera = 5;
//        System.out.println(miVariableEntera);
//        String miVariableCadena = "Saludos Cesar";
//        System.out.println(miVariableCadena);
//        miVariableCadena = "Adios Cesar";
//        System.out.println("miVariableCadena = " + miVariableCadena); // soutv + tab
//        //var - Inferencia de tipos en Java
//        var miVariableEntera2 = 15;
//        System.out.println("miVariableEntera2 = " + miVariableEntera2);
//        var miVariableCadena2 = "Hello World from Colombia";
//        System.out.println("miVariableCadena2 = " + miVariableCadena2);
//        //Valores permitidos en el nombre de variablea 
//        var $miVariable = 3;
//        var _miVariable = 4;
//        var áVariable = 9;
//        no se recomienda utilizar
//var #miVariable = 2;
//        no se permite utlizar caracteres especiales
//    }
//}
//public class HolaMundo {
// public static void main(String args[]) {
// var usuario = "Cesar";
// var titulo = "Ingeniero";
// var union = titulo + " " + usuario;
// System.out.println("union = " + union);
//  var i = 3;
//  var j = 4;
//  System.out.println(i + j); // Se realiza la suma de numeros
//  System.out.println(i + j + usuario); // primero hace la suma y despues la concatenacion | evaluacion de izq a der, realiza suma
//  System.out.println(usuario + i + j); // Contexto cadena, los toma como cadena
//  System.out.println(usuario + (i + j)); // uso de parentesis modican la prioridad en la evaluacion
// }
//}
//public class HolaMundo {
// public static void main(String args[]){
//v//ar nombre = "Karla";
//System.out.println("Nueva linea: \n " + nombre); //salto de linea \n
//System.out.println("Tabulador: \t" + nombre);  //tabulador \t
//System.out.println("Retroceso: \b\b" + nombre);
//System.out.println("comilla simple: \'" + nombre + "'");
//System.out.println(" Comilla doble: \" " + nombre + "\"");
//  }
//}
//public class HolaMundo {
// public static void main(String args[]) {
// System.out.println("Escriba tu Nombre: ");
// Scanner consola = new Scanner(System.in);
// var usuario = consola.nextLine();
// System.out.println("usuario = " + usuario);
//System.out.println("Digite el titulo");
//var titulo = consola.nextLine();
//System.out.println("Resultado: " + titulo + " " + usuario);
//}
//}
//public class HolaMundo {
//  public static void main (String args[]){
//System.out.println("Proporcioa el titulo: ");
// Scanner consola = new Scanner(System.in);
// var titulo = consola.nextLine();
// System.out.println("Proporciona el Autor: ");
// var autor = consola.nextLine();
//  System.out.println(titulo + " Fue escrito por " + autor);
// }
//}
//Tipos primitivos
/*
public class HolaMundo {

    public static void main(String args[]) {
        /*
        tipos prinitivos enteros: byte, short, int, long
 */

 /*byte numeroByte = (byte) 129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte = " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

    }
}
 */
 /*
public class HolaMundo {

    public static void main(String args[]) {
        /*
        Tipos primitivos de tipo flotante: float y double
 */
 /*   float numeroFloat = (float) 10;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float " + Float.MAX_VALUE);

        double numeroDouble = 11;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

    }
}
 */
 /*
public class HolaMundo{
    
    public static void main(String args[]){
      /*
        Inferencia de tipos con Var y tipos Primitivos
 */
 /*     var NumeroEntero = 10;
        System.out.println("NumeroEntero = " + NumeroEntero);
        
        var numeroDoble = 10.25;
        System.out.println("numeroDoble = " + numeroDoble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
 */
 /*
public class HolaMundo {

    public static void main(String args[]) {
        /*
        Tipos primitivos tipo char
 */
 /*
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);

        var varCharDecimal2 = 33; // podemos hacer una conversion var varCharDecimal = (char) 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int variableEneteraSimbolo = '!';
        System.out.println("variableEneteraSimbolo = " + variableEneteraSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        
        

    }
}
 */
 /*
public class HolaMundo {

    public static void main(String args[]) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean == true){
            System.out.println("La bandera es Verdadera");
        }
        else{
            System.out.println("La bandera es Falsa");
        }
        
        var edad = 10;
        //var esAdulto = edad >= 18;
        if(edad >= 18){
             System.out.println("edad = " + edad);
            
        }
        else{
            System.out.println("Eres menor de edad");
        }
       
    }
}
 */
//public class HolaMundo {
//
//    public static void main(String args[]) {
////        //Convertin tipo String a un tipo int
//        var edad = Integer.parseInt("20");
//        //var edad = "20";
//        System.out.println("edad = " + (edad + 1) );
////        
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //Pedir un valor
//        
//        var consola = new Scanner(System.in);
////        System.out.println("Proporciona tu Edad: ");
////        edad = Integer.parseInt (consola.nextLine());
////        System.out.println("edad = " + edad);
////        
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        
//        var caracter = "Hola".charAt(3);
//        System.out.println("caracter = " + caracter);
//        
//        System.out.println("Proporciona un caracter");
//        caracter = consola.nextLine().charAt(0);
        //     System.out.println("caracter = " + caracter);
//        var nombre = "Juan";
//        System.out.println(nombre);
//        nombre = "Carlos";
//        System.out.println(nombre);

//    }
//}
