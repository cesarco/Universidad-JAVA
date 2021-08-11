
import java.util.Scanner;

//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rodri
 */
//public class HolaMundo {
//    public static void main(String args[]){
//        //Definimos la variable
//        int miVariableEntera = 19;
//        System.out.println(miVariableEntera);
//        //Modificamos el valor de la varible
//        miVariableEntera = 7;
//        System.out.println(miVariableEntera);
//        
//        String miVariableCadena = "Saludos";
//        System.out.println(miVariableCadena);
//        
//        miVariableCadena = "Adios";
//        System.out.println(miVariableCadena);
//        
//        // var - Inferancia de tipos en Java
//        var miVariableEntera2 = 15;
//        System.out.println(miVariableEntera2);
//        
//        var miVariableCadena2 = "Cesar";
//        System.out.println(miVariableCadena2);
//        System.out.println("miVariableCadena2 = " + miVariableCadena2);
//        
//        //Valores permitidos en el nombre de variables
//        var miVariable = 1;
//        var _miVariable = 2;
//        var $miVariable = 3;
//        //var áVariable = 10; No se recomienda utilizar
//        //var #miVariable = 2; No se permite utilizar caracteres especiales
//    }
//}
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        var usuario = "Cesar";
//        var titulo = "Ingeniero";
//        var union = usuario + " " + titulo;
//        System.out.println("union = " + union);
//        
//        var i = 3;
//        var j = 4;
//        
//        System.out.println(i + j); // Se realiza la suma de numeros
//        System.out.println(i + j + usuario); // De izquierda a derecha evalua las expresiones
//        
//        System.out.println(usuario + i + j); // contexto cadena, todo lo toma como cadena
//        System.out.println(usuario + (i + j));// Prioridad de parentesis, modifica
//    }
//}
// Caracteres Especiales en Java
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        var nombre = "Karla";
//
//        System.out.println("Nueva linea: \n" + nombre);
//        System.out.println("Tabulador: \t" + nombre);
//        System.out.println("Retroceso: \b\b" + nombre);
//        System.out.println("Comilla simple: \'" + nombre + "'");
//        System.out.println("Comilla doble: \"" + nombre + "\"");
//    }
//}
// Scanner en Java
//public class HolaMundo {
//    
//    public static void main(String args[]){
//        System.out.println("Escribe tu Nombre: ");
//        Scanner consola = new  Scanner(System.in);
//        var usuario = consola.nextLine();
//        System.out.println("usuario = " + usuario);
//        System.out.println("Escribe el Titulo: ");
//        var titulo = consola.nextLine();
//        System.out.println("Resultado: " + titulo + " " + usuario);
//    }
//}
// Tipos Primitivos
//public class HolaMundo {
//    
//    public static void main (String args[]){
//        /*
//        Tipos primitivos enteros: byte, short, int, long
//        */
//        
//        byte numeroByte = (byte)129;
//        System.out.println("numeroByte = " + numeroByte);
//        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
//        System.out.println("Valor maximo byte " + Byte.MAX_VALUE);
//        
//        short numeroShort = (short)32768;
//        System.out.println("numeroShort = " + numeroShort);
//        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
//        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
//        
//        int numeroInt = (int)2147483647L;
//        System.out.println("numeroInt = " + numeroShort);
//        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
//        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
//        
//        long numeroLong = 9223372036854775807L;
//        System.out.println("numeroLong = " + numeroShort);
//        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
//        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
//
//    }
//}
//public class HolaMundo {
//    public static void main (String args[]){
//        /*
//        tipos primitivos de tipo flotante: float y double
//        */
//        
//        float numeroFloat = (float)3.4028235E38D;
//        System.out.println("numeroFloat = " + numeroFloat);
//        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
//        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
//        
//        double numeroDouble = 1.7976931348623157E308;
//        System.out.println("numeroDouble = " + numeroDouble);
//        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
//        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
//    }
//    
//}
// Inferencia de Tipos con Var y Tipos Primitivos
//public class HolaMundo {
//    
//    public static void main (String args[]) {
//        var numeroEntero = 10;
//        System.out.println("numeroEntero = " + numeroEntero);
//        
//        var numeroDouble = 10.0;
//        System.out.println("numeroDouble = " + numeroDouble);
//        
//        var numeroFloat = 10.0F;
//        System.out.println("numeroFloat = " + numeroFloat);
//    }
//}
//Tipos Primitivos Tipo Char
//public class HolaMundo {
//    
//    public static void main(String args[]) {
//        char miCaracter = 'a';
//        System.out.println("miCaracter = " + miCaracter);
//        
//        char varChar = '\u0021';
//        System.out.println("varChar = " + varChar);
//        
//        char varCharDecimal = 33;
//        System.out.println("varCharDecimal = " + varCharDecimal);
//        
//        char varCharSimbolo = '!';
//        System.out.println("varCharSimbolo = " + varCharSimbolo);
//        
//        var varChar1 = '\u0021';
//        System.out.println("varChar1 = " + varChar1);
//        
//        var varCharDecimal2 = 33;
//        System.out.println("varCharDecimal2 = " + varCharDecimal2);
//        
//        var varCharSimbolo3 = '!';
//        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
//        
//        int varEnteraSimbolo = '!';
//        System.out.println("varEnteraSimbolo = " + varEnteraSimbolo);
//        
//        int letra = 'A';
//        System.out.println("letra = " + letra);
//    }
//}
// Tipos Primitivos Tipo boolean
//public class HolaMundo {
//    
//    public static void main(String args[]) {
//        boolean varBoolean = true;
//        System.out.println("varBoolean = " + varBoolean);
//        
//        if(varBoolean) { 
//            System.out.println("La bandera es verdadera");
//        }
//        else {
//            System.out.println("La bandera es falsa");
//        }
//        var edad = 18;
//        //var esAdulto = edad >= 18;
//        if(edad >= 18){
//            System.out.println("Eres mayor de edad");
//        }
//        else{
//            System.out.println("Eres menor de edad");
//        }
//        
//    }
//}
// Conversion de Tipos Primitivos en Java
//public class HolaMundo {
//    
//    public static void main(String args[]) {
//        //Conversion tipo string a un tipo int
//        var edad = Integer.parseInt("20");
//        //var edad = "20";
//        System.out.println("edad = " + (edad + 1    ));
//        
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //Pedir un valor
//        
//        var consola = new Scanner(System.in);
////        System.out.println("Proporciona  tu edad: ");
////        edad = Integer.parseInt(consola.nextLine());
////        System.out.println("edad = " + edad);
//        
//        var edadTexto = String.valueOf(edad);
//        System.out.println("edadTexto = " + edadTexto);
//                
//        var caracter = "Hola".charAt(3);
//        System.out.println("caracter = " + caracter);
//        
//        System.out.println("Proporciona un caracter ");
//        caracter = consola.nextLine().charAt(0);
//        System.out.println("caracter = " + caracter);
//    }
//}
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        System.out.println("Proporciana el nombre: ");
//        Scanner consola = new Scanner(System.in);
//        var nombre = consola.nextLine();
//
//        System.out.println("Proporciona el id: ");
//        consola = new Scanner(System.in);
//        var id = consola.nextLine();
//
//        System.out.println("Proporciona el precio: ");
//        consola = new Scanner(System.in);
//        var precio = consola.nextLine();
//
//        System.out.println("Propociona el envio gratuito: ");
//        consola = new Scanner(System.in);
//        var envio = consola.nextLine();
//
//        System.out.println(nombre + " #" + id);
//        System.out.println("precio: "+"$"+precio);
//        System.out.println("Envio Gratuito: " + envio);
//
//    }
//}
//Operadores aritmeticos en Java
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        int a = 3, b = 2;
//        var resultado = a + b;
//        System.out.println("resultado suma = " + resultado);
//        
//        resultado = a - b;
//        System.out.println("resultado resta = " + resultado);
//        
//        resultado = a * b;
//        System.out.println("resultado multiplicaion = " + resultado);
//        
//        var resultado2 = 3.0 / b;
//        System.out.println("resultado division = " + resultado2);
//        
//        resultado = a % b;
//        System.out.println("resultado modulo = " + resultado);
//        
//        if (b % 2 ==0)
//            System.out.println("Es numero par");
//        else
//            System.out.println("Es numero impar");
//        
//
//    }
//}
// Operadores de Asignacion
//public class HolaMundo {
//    
//    public static void main(String args[])  {
//        int a = 3, b = 2;
//        int c = a + 5 - b;
//        System.out.println("c = " + c);
//        
//        a += 1; // a = a + 1
//        System.out.println("a = " + a);
//        
//        a += 3;
//        System.out.println("a = " + a);
//        
//        a -= 2;
//        System.out.println("a = " + a);
//        
//        a *= 3;
//        System.out.println("a = " + a);
//        
//        a /= 2;
//        System.out.println("a = " + a);
//        
//        a %= 2;
//        System.out.println("a = " + a);
//                
//    }
//}
// Operadores unarios en Java
//public class HolaMundo  {
//    public static void main(String args[]){
//        var a = 3;
//        var b = -a;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        
//        var c = true;
//        var d = !c;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        
//        //incremento
//        //preincremento (simbolo antes de la variable
//        
//        var e = 3;
//        var f = ++e;  // Primero se incrementa la varible y despues se usa su valor
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
//        
//        //2.postincrementto (Simbolo despues de la variable
//        var g = 5;
//        var h = g++;  // Primero se utiliza el valor y despues se incrementa
//        System.out.println("g = " + g);  // Teniamos pendiente un incremento
//        System.out.println("h = " + h);
//        
//        // decremento
//        //1. Predecremento
//        var i = 2;
//        var j = --i;
//        System.out.println("i = " + i);  // ya esta decrementada
//        System.out.println("j = " + j);
//        
//        //2.postdecremento
//        
//        var k = 4;
//        var l = k --;  // Primero se usa el valor de la variable y queda pendiente decremento
//        System.out.println("k = " + k);  // Tenia pendiente un decremento
//        System.out.println("l = " + l);
//               
//                
//    } 
//
//}
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        var a = 3;
//        var b = 2;
//
//        var c = (a == b);
//        System.out.println("c = " + c);
//
//        var d = a != b;
//        System.out.println("d = " + d);
//
//        var cadena = "Hola";
//        var cadena2 = "Hola";
//
//        var e = cadena == cadena2;  // compara refencias de objetos
//        System.out.println("e = " + e);
//
//        var f = cadena.equals(cadena2);
//        System.out.println("f = " + f);
//
//        var g = a >= b;  // mayor que > o el mayor o igual >= 
//        System.out.println("g = " + g);
//
//        if (a % 2 == 0) {
//            System.out.println("Es numero par");
//        } else {
//            System.out.println("Es numero impar");
//        }
//         var edad = 17;
//         var adulto = 18;
//         
//         if(edad >= adulto){
//             System.out.println("Es un adulto");
//         }
//         else{
//             System.out.println("Es menor de edad");
//         }
//
//    }
//}
// Operadores condicionales
//public class HolaMundo  {
//    
//    public static void main(String args[])  {
//        var a = 8;
//        var valorMinimo = 0;
//        var valorMaximo = 10;
//        
//        var resultado = a >= valorMinimo &&  a <= valorMaximo;
//        System.out.println("resultado = " + resultado);
//        if(resultado){
//            System.out.println("Dentro del rango");
//        }
//        else{
//            System.out.println("Fuera del rango");
//        }
//           
//        var vacaciones = false;
//        var diaDescanso = true;
//        
//        if(vacaciones || diaDescanso){
//            System.out.println("Padre puede asistir al juego del hijo");
//        }
//        else {
//            System.out.println("El padre esta ocupado");
//        }
//    }
//}
// Operador Ternario en JAVA
//public class HolaMundo {
//    
//    public static void main(String args[]) {
//        var resultado = (1 > 2) ? "Verdadero" : "Falso";
//        System.out.println("resultado = " + resultado);
//        
//        var numro = 9;
//        
//        resultado = (numro % 2 == 0)? "Numero par" : "numero impar";
//        System.out.println("resultado = " + resultado);
//    }
//}
// Precedencia de operadores
//public class HolaMundo {
//    
//    public static void main(String args[]) {
//        var x = 5;
//        var y = 10;        
//        var z = ++x + y--;
//        
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        
//        var resultado = 4 + 5 * 6 / 3;  // 4 + ((5 * 6) / 3)
//        System.out.println("resultado = " + resultado);
//        
//        resultado = (4 + 5) * 6 / 3;
//        System.out.println("resultado = " + resultado);
//    }
//}
/*
En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:

alto (int)
ancho (int)

El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
Proporciona el alto:
Proporciona el ancho:
Area: <area>
Perimetro: <perimetro>
Las fórmulas para calcular el área y el perímetro de un Rectángulo son:

Área: alto * ancho

Perímetro: (alto + ancho) * 2

Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
Questions for this assignment
¿Cuál es el código del requerimiento solicitado?
 */
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        System.out.println("Proporciona el alto: ");
//        Scanner consola = new Scanner(System.in);
//        var alto = Integer.parseInt(consola.nextLine());
//
//        System.out.println("Proporciona el ancho: ");
//        consola = new Scanner(System.in);
//        var ancho = Integer.parseInt(consola.nextLine());
//
//        var resultadoArea = alto * ancho;
//
//        var resultadoPerimetro = (alto + ancho) * 2;
//
//        System.out.println("Area  = " + resultadoArea);
//        System.out.println("Perimetro = " + resultadoPerimetro);
//
//    }
//}
/*
Solicitar al usuario dos valores:

numero1 (int)

numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

Proporciona el numero1:
Proporciona el numero2:
El numero mayor es:
<numeroMayor>
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
 */
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        System.out.println("Proporciona el numero 1: ");
//        Scanner numero = new Scanner(System.in);
//        var numero1 = Integer.parseInt(numero.nextLine());
//
//        System.out.println("Proporcina el numero 2");
//        numero = new Scanner(System.in);
//        var numero2 = Integer.parseInt(numero.nextLine());
//
//        if (numero1 > numero2) {
//            System.out.println("El numero mayor es: ");
//            System.out.println(numero1);
//        } else {
//            System.out.println("El numero mayor es: ");
//            System.out.println(numero2);
//        }
//
//    }
//}
// Sentencia de control if - else en Java
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        var condicion = false;
//
//        if (condicion == true) {
//            System.out.println("Condicion verdadera");
//        } else {
//            System.out.println("Condicion falsa");
//
//        }
//
//        var numero = 5;
//        var numeroTexto = " Numero desconocido";
//
//        if (numero == 1) {
//            numeroTexto = "Numero uno";
//        } 
//        else if (numero == 2) {
//            numeroTexto = "Numero dos";
//
//        } 
//        else if (numero == 3) {
//            numeroTexto = "Numero tres";
//        }
//        else if (numero == 4){
//            numeroTexto = "Numero cuatro";
//           
//        }
//        else{
//            numeroTexto = "Numero no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//
//    }
//}
// Calculo estación del año con if-else
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        System.out.println("Digite el numero del mes que desea consultar su estacion");
//
//        Scanner consola = new Scanner(System.in);
//        var mes = Integer.parseInt(consola.nextLine());
//        var estacion = "Estacion desconocida";
//
//        if (mes == 1 || mes == 2 || mes == 12) {
//            estacion = "Invierno";
//        } else if (mes == 3 || mes == 4 || mes == 5) {
//            estacion = "Primavera";
//        } else if (mes == 6 || mes == 7 || mes == 8) {
//            estacion = "Verano";
//        } else if (mes == 9 || mes == 10 || mes == 11) {
//            estacion = "Otonio";
//        }
//        System.out.println("estacion = " + estacion);
//
//    }
//}
// Sentencia de control switch en Java
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        var numero = 3;
//        var numeroTexto = "Valor desconocido";
//
//        switch (numero) {
//            case 1:
//                numeroTexto = "Numero uno";
//                break;
//            case 2:
//                numeroTexto = "Numero dos";
//                break;
//            case 3:
//                numeroTexto = "Numero tres";
//                break;
//            case 4:
//                numeroTexto = "Numero cuantro";
//                break;
//            default:
//                numeroTexto = "Caso no encontrado";
//
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//
//    }
//}
// Cálculo estacion del año con Switch
//public class HolaMundo {
//
//    public static void main(String args[]) {
//        System.out.println("Progama para saber las estaciones del año segun el mes");
//        System.out.println("Digite un numero del mes");
//        Scanner consola = new Scanner(System.in);
//        var mes = Integer.parseInt(consola.nextLine());
//        var estacion = " Estacion desconocida";
//        switch (mes) {
//            case 1:
//            case 2:
//            case 12:
//                estacion = "Invierno";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                estacion = "Primavera";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                estacion = "Verano";
//                break;
//            case 9:
//            case 10:
//            case 11:
//                estacion = "Otonio";
//                break;
//
//        }
//        System.out.println("estacion = " + estacion);
//
//    }
//}
/*
El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A

Si está entre 8 y menor a 9: imprimir una B

Si está entre 7 y menor a 8: imprimir una C

Si está entre 6 y menor a 7: imprimir una D

Si está entre 0 y menor a 6: imprimir una F

cualquier otro valor debe imprimir: Valor desconocido

Por ejemplo:

Proporciona un valor entre 0 y 10:
A
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
 */
public class HolaMundo {

    public static void main(String args[]) {

        System.out.println("Digite un numero del mes");
        Scanner consola = new Scanner(System.in);
        var nota = Integer.parseInt(consola.nextLine());
        var texto = "Valor desconocido";

        if (nota == 9 || nota == 10) {
            texto = "A";
        } else if (nota == 8 && nota < 9) {
            texto = "B";
        } else if (nota == 7 && nota < 8) {
            texto = "C";
        } else if (nota == 6 && nota < 7) {
            texto = "D";
        } else if (nota == 0 || nota < 6) {
            texto = "F";
        }
        System.out.println("texto " + texto);

    }

}
