package models;

public class Usuario {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String direccion;
    private String contraseña;
    
    public Usuario(int dni, String nombre, String apellido, int edad, String sexo, String direccion,
            String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.contraseña = contraseña;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo="
                + sexo + ", direccion=" + direccion + ", contraseña=" + contraseña + "]";
    }

    
}
