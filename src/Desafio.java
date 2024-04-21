import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        Locale español = new Locale("es");

        String nombre = "salvador lopez baltazar";
        String tipoDeCuenta = "Corriente";
        double saldo = 12825;
        int opcion =0;

        //Menu
        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1.- Consultar Saldo
                2.- Retirar
                3.- Depositar
                9.- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: "+formatoImporte.format(saldo)  );
                    break;
                case 2:
                    System.out.println("¿Cantidad a Retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("SALDO INSUFICIENTE");
                    }else{
                        saldo -= valorARetirar;
                        System.out.println("El nuevo Saldo es: " + formatoImporte.format(saldo));
                    }
                    break;
                case 3:
                    System.out.println("¿Cantidad a Depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El nuevo Saldo es: " + formatoImporte.format(saldo));
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios\n");
                    break;

                default:
                    System.out.println("*****Opcion no valida*****");
            }

        }

        System.out.println("////////////////////////////////////////////////////");
        System.out.println("           BANCO DEL GATO MAMALON");
        System.out.println("////////////////////////////////////////////////////\n");

        System.out.println("Cliente: \t" + nombre);
        System.out.println("Cuenta: \t" + tipoDeCuenta);
        System.out.println("SALDO: \t\t" + formatoImporte.format(saldo) + " MXN\n");
        System.out.println("////////////////////////////////////////////////////\n");

    }
}
