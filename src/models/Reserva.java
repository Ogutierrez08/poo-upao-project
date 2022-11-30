package models;

public class Reserva {
    private int codigo;
    private String fecIngreso;
    private String fecSalida;
    private int nroDias;
    private int cantidadPersonas;
    private int tipoHabitación;

    public Reserva(int codigo, String fecIngreso, String fecSalida, int nroDias, int cantidadPersonas,
            int tipoHabitación) {
        this.codigo = codigo;
        this.fecIngreso = fecIngreso;
        this.fecSalida = fecSalida;
        this.nroDias = nroDias;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoHabitación = tipoHabitación;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(String fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public String getFecSalida() {
        return fecSalida;
    }

    public void setFecSalida(String fecSalida) {
        this.fecSalida = fecSalida;
    }

    public int getNroDias() {
        return nroDias;
    }

    public void setNroDias(int nroDias) {
        this.nroDias = nroDias;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getTipoHabitación() {
        return tipoHabitación;
    }

    public void setTipoHabitación(int tipoHabitación) {
        this.tipoHabitación = tipoHabitación;
    }

    @Override
    public String toString() {
        return "Información de Reservas : " + "\n" 
                + "Codigo: " + codigo  + "\n"
                + "FecIngreso: " + fecIngreso + "\n"
                + "FecSalida: " + fecSalida + "\n"
                + "NroDias: " + nroDias  + "\n"
                + "CantidadPersonas: " + cantidadPersonas + "\n"
                + "TipoHabitación: " + tipoHabitación + "\n";
    }

}
