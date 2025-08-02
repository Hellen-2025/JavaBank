import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Crear un objeto para leer datos del teclado

        System.out.println("Bienvenido Cajero");

        // Ingreso de datos por el usuario
        System.out.print("Ingrese el número de cuenta: ");
        String accountNumber = input.nextLine();

        System.out.print("Ingrese su PIN: ");
        int pin = input.nextInt();

        // Validación simple del PIN
        if (pin != 1234) {
            System.out.println("PIN incorrecto. Acceso denegado.");
            return; // Termina el programa si el PIN es incorrecto
        }

        double balance = 1500.75;
        System.out.println("Saldo actual: $" + balance);

        // Ingreso de transacciones
        System.out.print("¿Cuántas transacciones desea registrar? ");
        int cantidad = input.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el monto de la transacción #" + (i + 1) + " (puede ser negativo para retiro): ");
            double monto = input.nextDouble();
            balance += monto;
        }

        // Mostrar estado final
        String status = (balance < 0) ? "Deuda" : "Saldo Disponible";
        System.out.println("Estado de cuenta: " + status);
        System.out.println("Saldo final: $" + balance);

        input.close(); // Cerrar el scanner (buena práctica)
    }
}



//        boolean isActive = true;
//        char initial = 'A';
//        byte age = 30;
//        short smallNumber = 32000;
//        long bigNumber = 10000000000L;
//        float temperature = 36.6f;
// balance: saldo de la cuenta.
// accountNumber: número de cuenta (como texto).
// pin: código de seguridad (PIN).
// isActive: si la cuenta está activa o no.
// initial: una letra inicial (podría ser del cliente).
// age, smallNumber, bigNumber, temperature: ejemplos para mostrar cómo se declaran
// diferentes tipos de datos primitivos en Java.



