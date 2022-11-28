package connection;

import java.util.LinkedList;
import java.util.Scanner;

import models.Reserva;

public class ReservaManagement {
    private LinkedList<Reserva> list; 

    public ReservaManagement() { 
        list = new LinkedList<>(); // le esta asignando un espacio de memoria
    }

    public void add(Reserva reserva) {

        if (!find(reserva.getCodigo())) { // Simula la busqueda en BD de un Reserva Sp_BuscarReserva(codigoReserva)
            list.add(reserva); // Simulación de una base de datos SP_InsertarReserva(Reserva)
        } else {

            System.out.println(
                    "La Reserva ya existe en la lista");
        }
    }

    public boolean find(int codigoReserva) { 

        for (Reserva r : list) {

            if (r.getCodigo() == codigoReserva) {

                System.out.println(r);
                return true;
            }
        }
        return false;
    }

    public void delete(int codigoReserva) {
        Reserva ReservaDel = null;

        for (Reserva r : list) {

            if (r.getCodigo() == codigoReserva) {
                ReservaDel = r;
            }
        }

        if (ReservaDel == null) {

            System.out.println("Id ingresado es invalido");
        } else {

            list.remove(ReservaDel);
            System.out.println(
                    "La Reserva fue removida de la lista satisfactoriamente");
        }
    }

    public Reserva findReserva(int codigoReserva) {

        for (Reserva r : list) {

            if (r.getCodigo() == codigoReserva) {
                return r;
            }
        }

        return null;
    }

    public void update(int codigoReserva, Scanner input) {

        if (find(codigoReserva)) {
            Reserva res = findReserva(codigoReserva);

            System.out.print(
                    "Ingresa la nueva fecha de Ingreso ? ");
            String fecIngreso = input.nextLine();

            System.out.print(
                    "Ingresa la nueva fecha de Salida ");
            String fecSalida = input.nextLine();

            System.out.print(
                    "Ingresa el numero de días? ");
            int nroDias = input.nextInt();
            input.nextLine();
            System.out.print(
                    "Ingresa la nueva cantidad de Personas? ");
            int cantidadPersonas = input.nextInt();
            input.nextLine();
            System.out.print(
                    "Ingresa el nuevo tipo de habitación? ");
            int tipoHabitación = input.nextInt();
            
            res.setFecIngreso(fecIngreso);
            res.setFecSalida(fecSalida);
            res.setNroDias(nroDias);
            res.setCantidadPersonas(cantidadPersonas);
            res.setTipoHabitación(tipoHabitación);


            System.out.println(
                    "Se actualizo la Reserva satisfactoriamente");
        } else {

            System.out.println(
                    "El codigo ingresado no se encuentra en la lista de Reservas");
        }
    }

    public void display() {

        if (list.isEmpty()) {

            System.out.println("La lista no tiene Reservas\n");
        }

        for (Reserva e : list) {

            System.out.println(e.toString());
        }
    }
}
