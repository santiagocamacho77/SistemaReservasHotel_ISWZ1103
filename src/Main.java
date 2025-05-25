import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("Hotel Cielo Verde");
        hotel.cargarHabitacionesDemo();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n===== MENÚ DE OPCIONES =====");
            System.out.println("1. Ver disponibilidad de habitaciones");
            System.out.println("2. Crear una nueva reserva");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    hotel.mostrarDisponibilidad();
                    break;
                case 2:
                    System.out.print("Ingrese su nombre: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingrese el número de habitación a reservar: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    hotel.crearReserva(nombreCliente, numero);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.");
            }
        }
        scanner.close();
        System.out.println("Gracias por usar el sistema de reservas.");
    }
}
