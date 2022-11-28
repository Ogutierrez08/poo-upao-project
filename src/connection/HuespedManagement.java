package connection;

import java.util.LinkedList;
import java.util.Scanner;

import models.Huesped;

public class HuespedManagement {
    private LinkedList<Huesped> list; 

    public HuespedManagement() { 
        list = new LinkedList<>(); // le esta asignando un espacio de memoria
    }

    public void add(Huesped huesped) {

        if (!find(huesped.getCodigoHuesped())) { // Simula la busqueda en BD de un Huesped Sp_BuscarHuesped(codigoHuesped)
            list.add(huesped); // Simulación de una base de datos SP_InsertarHuesped(Huesped)
        } else {

            System.out.println(
                    "El Huesped ya existe en la lista");
        }
    }

    public boolean find(int codigoHuesped) { 

        for (Huesped h : list) {

            if (h.getCodigoHuesped() == codigoHuesped) {

                System.out.println(h);
                return true;
            }
        }
        return false;
    }

    public void delete(int codigoHuesped) {
        Huesped HuespedDel = null;

        for (Huesped h : list) {

            if (h.getCodigoHuesped() == codigoHuesped) {
                HuespedDel = h;
            }
        }

        if (HuespedDel == null) {

            System.out.println("Id ingresado es invalido");
        } else {

            list.remove(HuespedDel);
            System.out.println(
                    "El Huesped fue removido de la lista satisfactoriamente");
        }
    }

    public Huesped findHuesped(int codigoHuesped) {

        for (Huesped h : list) {

            if (h.getCodigoHuesped() == codigoHuesped) {
                return h;
            }
        }

        return null;
    }

    public void update(int codigoHuesped, Scanner input) {

        if (find(codigoHuesped)) {
            Huesped hue = findHuesped(codigoHuesped);

            System.out.print(
                    "Ingresa el nuevo Tipo de correo ? ");
            String correo = input.nextLine();

            System.out.print(
                    "Ingresa la nueva fecha de llegada ");
            String fecLlegada = input.nextLine();

            System.out.print(
                    "Ingresa la nueva fecha de salida? ");
            String fecSalida = input.nextLine();

            
            hue.setCorreo(correo);
            hue.setFecLlegada(fecLlegada);
            hue.setFecSalida(fecSalida);

            System.out.println(
                    "Se actualizo el Huesped satisfactoriamente");
        } else {

            System.out.println(
                    "El codigo ingresado no se encuentra en la lista de Huespeds");
        }
    }

    public void display() {

        if (list.isEmpty()) {

            System.out.println("La lista no tiene Huespedes\n");
        }

        for (Huesped e : list) {

            System.out.println(e.toString());
        }
    }
}
