package models;

public class Empleado extends Usuario {
    private int codigoEmpleado;
    private double sueldo;
    private String categoria;

    public Empleado(String dni, String nombre, String apellido, String edad, String sexo, String direccion,
            String contraseña, int codigoEmpleado, double sueldo, String categoria) {
        super(dni, nombre, apellido, edad, sexo, direccion, contraseña);
        this.codigoEmpleado = codigoEmpleado;
        this.sueldo = sueldo;
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String toString() {
        return "Empleado [codigoEmpleado=" + codigoEmpleado + ", sueldo=" + sueldo + ", categoria=" + categoria + "]";
    }

}
