package Clase02;

public class VariablesPrimitivos {
    public static void main(String[] args) {
        byte numeroByte =127;
        System.out.println("Soporta Maximo 127 = " + numeroByte);
        System.out.println("Tipo Byte corresponde byte a: " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde bites a: " + Byte.SIZE);
        System.out.println("Valor Maximo de un byte : " + Byte.MAX_VALUE);
        System.out.println("Valor Minimo de un byte : " + Byte.MIN_VALUE);
        System.out.println("----------------------------------");
        short numeroShort = 32767;
        System.out.println("Soporta Maximo 32767 = " + numeroShort);
        System.out.println("Tipo Short corresponde byte a: " + Short.BYTES);
        System.out.println("Tipo Short corresponde bites a: " + Short.SIZE);
        System.out.println("Valor Maximo de un Short : " + Short.MAX_VALUE);
        System.out.println("Valor Minimo de un Short : " + Short.MIN_VALUE);

        System.out.println("----------------------------------");
        int numeroInt = 2147483647;
        System.out.println("Soporta Maximo 2147483647 = " + numeroInt);
        System.out.println("Tipo Int corresponde byte a: " + Integer.BYTES);
        System.out.println("Tipo Int corresponde bites a: " + Integer.SIZE);
        System.out.println("Valor Maximo de un Int : " + Integer.MAX_VALUE);
        System.out.println("Valor Minimo de un Int : " + Integer.MIN_VALUE);

        System.out.println("----------------------------------");
        long numeroLong = 9223372036854775807L;
        System.out.println("Soporta Maximo 9223372036854775807 = " + numeroLong);
        System.out.println("Tipo Long corresponde byte a: " + Long.BYTES);
        System.out.println("Tipo Long corresponde bites a: " + Long.SIZE);
        System.out.println("Valor Maximo de un Long : " + Long.MAX_VALUE);
        System.out.println("Valor Minimo de un Long : " + Long.MIN_VALUE);

        var numeroVar1 =2147483647;
        var numeroVar2 =9223372036854775807L;

        System.out.println("----------------------------------");
        float numeroFloat= 3.4028235E38F;
        System.out.println("Soporta Maximo 3.4028235E38 = " + numeroFloat);
        System.out.println("Tipo Float corresponde byte a: " + Float.BYTES);
        System.out.println("Tipo Float corresponde bites a: " + Float.SIZE);
        System.out.println("Valor Maximo de un Float : " + Float.MAX_VALUE);
        System.out.println("Valor Minimo de un Float : " + Float.MIN_VALUE);


        System.out.println("----------------------------------");
        double numeroDouble= 1.7976931348623157E308;
        System.out.println("Soporta Maximo 3.1.7976931348623157E308 = " + numeroDouble);
        System.out.println("Tipo Double corresponde byte a: " + Double.BYTES);
        System.out.println("Tipo Double corresponde bites a: " + Double.SIZE);
        System.out.println("Valor Maximo de un Double : " + Double.MAX_VALUE);
        System.out.println("Valor Minimo de un Double : " + Double.MIN_VALUE);
    }
}
