package models;

public class Huesped extends Usuario {
    private int codigoHuesped;
    private String correo;
    private String fecLlegada;
    private String fecSalida;

    public Huesped(String dni, String nombre, String apellido, String edad, String sexo, String direccion,
            String contraseña, int codigoHuesped, String correo, String fecLlegada, String fecSalida) {
        super(dni, nombre, apellido, edad, sexo, direccion, contraseña);
        this.codigoHuesped = codigoHuesped;
        this.correo = correo;
        this.fecLlegada = fecLlegada;
        this.fecSalida = fecSalida;
    }

    public int getCodigoHuesped() {
        return codigoHuesped;
    }

    public void setCodigoHuesped(int codigoHuesped) {
        this.codigoHuesped = codigoHuesped;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecLlegada() {
        return fecLlegada;
    }

    public void setFecLlegada(String fecLlegada) {
        this.fecLlegada = fecLlegada;
    }

    public String getFecSalida() {
        return fecSalida;
    }

    public void setFecSalida(String fecSalida) {
        this.fecSalida = fecSalida;
    }

    public String toString() {
        return "Huesped [codigoHuesped=" + codigoHuesped + ", correo=" + correo + ", fecLlegada=" + fecLlegada
                + ", fecSalida=" + fecSalida + "]";
    }

}
