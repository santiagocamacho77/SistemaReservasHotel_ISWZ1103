import java.time.LocalDate;

public class Reserva {
    private String cliente;
    private Habitacion habitacion;
    private LocalDate fecha;

    public Reserva(String cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = LocalDate.now();
    }

    public void mostrarDetalle() {
        System.out.println("✅ Reserva de " + cliente + " en habitación " + habitacion.getNumero()
                + " (" + habitacion.getTipo() + ") el " + fecha + ". Precio: $" + habitacion.calcularPrecio());
    }
}