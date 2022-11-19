package models;

public class Reserva {
    private int codigo;
    private String fecIngreso;
    private String fecSalida;
    private int nroDias;
    private int CantidadPersonas;
    private int tipoHabitación;

    public Reserva(int codigo, String fecIngreso, String fecSalida, int nroDias, int cantidadPersonas,
            int tipoHabitación) {
        this.codigo = codigo;
        this.fecIngreso = fecIngreso;
        this.fecSalida = fecSalida;
        this.nroDias = nroDias;
        CantidadPersonas = cantidadPersonas;
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
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        CantidadPersonas = cantidadPersonas;
    }

    public int getTipoHabitación() {
        return tipoHabitación;
    }

    public void setTipoHabitación(int tipoHabitación) {
        this.tipoHabitación = tipoHabitación;
    }

}
