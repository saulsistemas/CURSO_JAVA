package Clase02;

public class VariablesPrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico =true;

        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;
        float f = 1.2345e2f;
        datoLogico = d<f;

        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 ==1);

        System.out.println("esIgual = " + esIgual);
    }
}
