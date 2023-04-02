public class Main {
    public static void main(String[] args) {

        //Declarar una variable y decir si es un numero positivo o negativo
        //Declarar una variable y decir si es un numero par o impar
        int numero = 0;
        if (numero >= 0) {
            System.out.println("El número es postivo");
        } else {
            System.out.println("El número es negativo");
        }

        int numero2 = 0;
        if (numero2 %2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("Es número es impar");
        }
        //Decir si un numero esta entre 0 y 100

        numero=-10;
        if (numero >= 0 && numero <= 100) {
            System.out.println("El numero esta entre 0 y 100");
        } else {
            System.out.println("El numero  esta entre 0 y 100");
        }
        public static void main(String[] args) {
            //Declarar una variable y decir si es un número positivo o negativo
            int numero=-10, numero1=9;
            if(numero>=0){
                System.out.println("Es positivo");
            }else{
                System.out.println("Es negativo");
            }

            //Declarar una variable y decir si es un número par o impar

//        int numero1=9;
            if(numero1%2==0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
            //Decir si un número está entre 0 y 100
            numero=101;
            if(numero>=0 && numero<=100){
                System.out.println("El número está entre 0 y 100");
            }else{
                System.out.println("El número no está entre 0 y 100");
            }
            //Los articulos raton y teclado tienen el 10% de descuento
            String nombreArticulo = "Raton";
            double descuento = 0.1, precio = 20;
            if(nombreArticulo.toLowerCase()equals("raton") || nombreArticulo.toLowerCase()equals("teclado")){
                System.out.println("El descuento es: "+descuento*precio);
            }else{
                System.out.println("NO tiene  descuento");
            }



        }

    }
}