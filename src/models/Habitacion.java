package models;

public class Habitacion {
    private int numeroHabitacion;
    private char tipoHabitación;
    private double precio;
    private char estado;

    public Habitacion(int numeroHabitacion, char tipoHabitación, double precio, char estado) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitación = tipoHabitación;
        this.precio = precio;
        this.estado = estado;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public char getTipoHabitación() {
        return tipoHabitación;
    }

    public void setTipoHabitación(char tipoHabitación) {
        this.tipoHabitación = tipoHabitación;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Información de Habitaciones: "+ "\n" +"NumeroHabitacion : " + numeroHabitacion 
        + "TipoHabitación: " + tipoHabitación 
        + "Precio: " + precio 
        + "Estado: " + estado + "\n";
    }
    
}
