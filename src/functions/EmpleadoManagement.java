package functions;

import java.util.LinkedList;
import java.util.Scanner;

import models.Empleado;

public class EmpleadoManagement {
    LinkedList<Empleado> list;

    public EmpleadoManagement() {
        list = new LinkedList<>();
    }

    public void add(Empleado empleado) {

        if (!find(empleado.getCodigoEmpleado())) {
            list.add(empleado);
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
            String dni = input.nextLine();

            System.out.print(
                    "Ingresa la nueva edad? ");
            String edad = input.nextLine();

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
                    "Record Updated Successfully");
        } else {

            System.out.println(
                    "Record Not Found in the Student list");
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
