package Clase02;

public class VariablesPrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter ='\u0040';
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = " + caracter);

        System.out.println("Soporta Maximo  = " + caracter);
        System.out.println("Tipo Char Char byte a: " + Character.BYTES);
        System.out.println("Tipo Char corresponde bites a: " + Character.SIZE);
        System.out.println("Valor Maximo de un Char : " + Character.MAX_VALUE);
        System.out.println("Valor Minimo de un Char : " + Character.MIN_VALUE);

        char espacio='\u0020';
        System.out.println("espacio = " + espacio);
        char retroceso='\b';
        System.out.println("retroceso = " + retroceso);
        char tabulador='\t';
        System.out.println("tabulador = " + tabulador);
        char nuevalinea='\n';
        System.out.println("nuevalinea = " + nuevalinea);
        char retornoCarro='\r';
        System.out.println("retornoCarro = " + retornoCarro);
    }
}
