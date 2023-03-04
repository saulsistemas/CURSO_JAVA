package Clase02;

public class Variables {
    public static void main(String[] args) {
        //REFERENCIA
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar.toUpperCase());

        //PRIMITIVO
        int numero=10;
        boolean valor=true;

        int numero2 =15;
        if (valor){
            System.out.println(numero2);
            numero2=14;
        }
        System.out.println(numero2);
        var numero3 =20;
        System.out.println(numero3);

    }
}
