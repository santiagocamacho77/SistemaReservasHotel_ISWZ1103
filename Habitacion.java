public class Habitacion {
    private int numero;
    private boolean disponible;
    private String tipo;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularPrecio() {
        switch (tipo.toLowerCase()) {
            case "suite":
                return 120.0;
            case "estándar":
            default:
                return 50.0;
        }
    }

    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + "): " + (disponible ? "Disponible" : "Ocupada");
    }
}
