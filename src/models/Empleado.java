package models;

public class Empleado extends Usuario {
    private int codigoEmpleado;
    private double sueldo;
    private String categoria;

    public Empleado(int dni, String nombre, String apellido, int edad, String sexo, String direccion,
            String contraseña, int codigoEmpleado, double sueldo, String categoria) {
        super(dni, nombre, apellido, edad, sexo, direccion, contraseña);
        this.codigoEmpleado = codigoEmpleado;
        this.sueldo = sueldo;
        this.categoria = categoria;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
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

    @Override
    public String toString() {
        return "Información de empleados: " + "\n" + "CodigoEmpleado : " + codigoEmpleado + "\n" + "Sueldo : " + sueldo
                + "\n" + "Categoria: " + categoria + "\n";
    }

}
