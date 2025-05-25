
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void cargarHabitacionesDemo() {
        agregarHabitacion(new Habitacion(101, "Estándar"));
        agregarHabitacion(new Habitacion(102, "Estándar"));
        agregarHabitacion(new Habitacion(201, "Suite"));
        agregarHabitacion(new Habitacion(202, "Suite"));
    }

    public void mostrarDisponibilidad() {
        for (Habitacion h : habitaciones) {
            System.out.println(h);
        }
    }

    public void crearReserva(String cliente, int numeroHabitacion) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numeroHabitacion) {
                if (h.estaDisponible()) {
                    h.reservar();
                    Reserva r = new Reserva(cliente, h);
                    reservas.add(r);
                    r.mostrarDetalle();
                } else {
                    System.out.println("La habitación está ocupada.");
                }
                return;
            }
        }
        System.out.println("Habitación no encontrada.");
    }
}
