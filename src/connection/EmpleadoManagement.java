package connection;

import java.util.LinkedList; // paquete para manejar listar de objetos 
import java.util.Scanner; //paquete para manejar imputs desde consola

import models.Empleado;

public class EmpleadoManagement {
    private LinkedList<Empleado> list; // Variable de nombre List cuyo tipo es Linkedlist<Empleado>
    // = new

    public EmpleadoManagement() {
        list = new LinkedList<>(); // le esta asignando un espacio de memoria
    }

    public void add(Empleado empleado) {

        if (!find(empleado.getCodigoEmpleado())) { // Simula la busqueda en BD de un empleado
                                                   // Sp_BuscarEmpleado(codigoEmpleado)
            list.add(empleado); // Simulación de una base de datos SP_InsertarEmpleado(Empleado)
        } else {

            System.out.println(
                    "El empleado ya existe en la lista");
        }
    }

    public boolean find(int codigoEmpleado) {

        for (Empleado e : list) {

            if (e.getCodigoEmpleado() == codigoEmpleado) {

                System.out.println(e);
                return true;
            }
        }
        return false;
    }

    public void delete(int codigoEmpleado) {
        Empleado empleadoDel = null;

        for (Empleado e : list) {

            if (e.getCodigoEmpleado() == codigoEmpleado) {
                empleadoDel = e;
            }
        }

        if (empleadoDel == null) {

            System.out.println("Id ingresado es invalido");
        } else {

            list.remove(empleadoDel);
            System.out.println(
                    "El empleado fue removido de la lista satisfactoriamente");
        }
    }

    public Empleado findEmpleado(int codigoEmpleado) {

        for (Empleado e : list) {

            if (e.getCodigoEmpleado() == codigoEmpleado) {
                return e;
            }
        }

        return null;
    }

    public void update(int codigoEmpleado, Scanner input) {

        if (find(codigoEmpleado)) {
            Empleado emp = findEmpleado(codigoEmpleado);

            System.out.print(
                    "Ingresa el nuevo nombre ? ");
            String name = input.nextLine();
            input.nextLine();
            System.out.print(
                    "Ingresa el nuevo apellido ");
            String apellido = input.nextLine();

            System.out.print(
                    "Ingresa la nueva categoria? ");
            String categoria = input.nextLine();

            System.out.print(
                    "Ingresa la nueva contraseña? ");
            String password = input.nextLine();

            System.out.print(
                    "Ingresa la nueva direccion? ");
            String direccion = input.nextLine();

            System.out.print(
                    "Ingresa el nuevo dni? ");
            int dni = input.nextInt();
            input.nextLine();
            System.out.print(
                    "Ingresa la nueva edad? ");
            int edad = input.nextInt();
            input.nextLine();
            System.out.print(
                    "Ingresa el nuevo sexo? ");
            String sexo = input.nextLine();

            System.out.print(
                    "Ingresa el nuevo sueldo? ");
            double sueldo = input.nextDouble();

            emp.setNombre(name);
            emp.setApellido(apellido);
            emp.setCategoria(categoria);
            emp.setContraseña(password);
            emp.setDireccion(direccion);
            emp.setDni(dni);
            emp.setEdad(edad);
            emp.setSexo(sexo);
            emp.setSueldo(sueldo);
            System.out.println(
                    "Se actualizo el empleado satisfactoriamente");
        } else {

            System.out.println(
                    "El codigo ingresado no se encuentra en la lista de empleados");
        }
    }

    public void display() {

        if (list.isEmpty()) {

            System.out.println("La lista no tiene empleados\n");
        }

        for (Empleado e : list) {

            System.out.println(e.toString());
        }
    }
}
