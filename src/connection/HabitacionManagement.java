package connection;

import java.util.LinkedList;
import java.util.Scanner;

import models.Habitacion;

public class HabitacionManagement {
    LinkedList<Habitacion> list; 

    public HabitacionManagement() {
        list = new LinkedList<>(); // le esta asignando un espacio de memoria
    }

    public void add(Habitacion habitacion) {

        if (!find(habitacion.getNumeroHabitacion())) { // Simula la busqueda en BD de un habitacion
                                                       // Sp_Buscarhabitacion(numeroHabitacion)
            list.add(habitacion); // Simulación de una base de datos SP_Insertarhabitacion(habitacion)
        } else {

            System.out.println(
                    "El habitacion ya existe en la lista");
        }
    }

    public boolean find(int numeroHabitacion) {

        for (Habitacion e : list) {

            if (e.getNumeroHabitacion() == numeroHabitacion) {

                System.out.println(e);
                return true;
            }
        }
        return false;
    }

    public void delete(int numeroHabitacion) {
        Habitacion habitacionDel = null;

        for (Habitacion h : list) {

            if (h.getNumeroHabitacion() == numeroHabitacion) {
                habitacionDel = h;
            }
        }

        if (habitacionDel == null) {

            System.out.println("Id ingresado es invalido");
        } else {

            list.remove(habitacionDel);
            System.out.println(
                    "El habitacion fue removido de la lista satisfactoriamente");
        }
    }

    public Habitacion findHabitacion(int numeroHabitacion) {

        for (Habitacion e : list) {

            if (e.getNumeroHabitacion() == numeroHabitacion) {
                return e;
            }
        }

        return null;
    }

    public void update(int numeroHabitacion, Scanner input) {

        if (find(numeroHabitacion)) {
            Habitacion hab = findHabitacion(numeroHabitacion);

            System.out.print(
                    "Ingresa el nuevo Tipo de habitación ? ");
            char tipoHbaitacion = input.next().charAt(0);
            input.nextLine();
            System.out.print(
                    "Ingresa el nuevo precio ");
            double precio = input.nextDouble();
            input.nextLine();
            System.out.print(
                    "Ingresa la nuevo Estado? ");
            char estado = input.next().charAt(0);
                
            hab.setTipoHabitación(tipoHbaitacion);
            hab.setPrecio(precio);
            hab.setEstado(estado);

            System.out.println(
                    "Se actualizo el habitacion satisfactoriamente");
        } else {

            System.out.println(
                    "El codigo ingresado no se encuentra en la lista de habitacions");
        }
    }

    public void display() {

        if (list.isEmpty()) {

            System.out.println("La lista no tiene habitaciones\n");
        }

        for (Habitacion e : list) {

            System.out.println(e.toString());
        }
    }
}
