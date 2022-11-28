package utils;

import java.util.Scanner;

import connection.ReservaManagement;
import models.Reserva;

public class menuReserva {
    public static void getMenu(int option) {
        ReservaManagement hr = new ReservaManagement();

        Scanner input = new Scanner(System.in);
        do {
            menu();
            option = input.nextInt();

            switch (option) {

                case 1:

                    System.out.print(
                            "Ingresa el codigo ? ");
                    int codigo = input.nextInt();
                    input.nextLine();
                    System.out.print(
                            "Ingresa la fecha de Ingreso ? ");
                    String fecIngreso = input.nextLine();

                    System.out.print(
                            "Ingresa la fecha de Salida ");
                    String fecSalida = input.nextLine();

                    System.out.print(
                            "Ingresa el numero de días? ");
                    int nroDias = input.nextInt();
                    input.nextLine();
                    System.out.print(
                            "Ingresa la cantidad de Personas? ");
                    int cantidadPersonas = input.nextInt();
                    input.nextLine();
                    System.out.print(
                            "Ingresa el tipo de habitación? ");
                    int tipoHabitación = input.nextInt();
                    
                    Reserva Reserva = new Reserva(codigo, fecIngreso, fecSalida, nroDias, cantidadPersonas,
                            tipoHabitación);

                    hr.add(Reserva);
                    System.out.println(Reserva.toString());

                    break;

                case 2:

                    System.out.print(
                            "Cual es el codigo del Reserva ? ");
                    int eId = input.nextInt();

                    hr.delete(eId);

                    break;

                case 3:

                    System.out.print(
                            "Cual es el codigo del Reserva? ");

                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);

                    break;

                case 4:

                    System.out.print(
                            "Cual es el codigo del Reserva ? ");
                    int codigoReserva = input.nextInt();

                    if (!hr.find(codigoReserva)) {
                        System.out.println(
                                "El Reserva no existe\n");
                    }

                    break;

                case 5:
                    hr.display();
                    break;

                case 9:
                    menuGeneral.getMenuGeneral(0);
                    break;
                default:

                    System.out.println("\nOpciones invalidas\n");
                    break;
            }
        } while (option != 9);
    }

    public static void menu() {

        System.out.println("MENU");
        System.out.println("1: Agregar Reserva");
        System.out.println("2: Borrar Reserva");
        System.out.println("3: Update Reserva");
        System.out.println("4: Buscar Reserva");
        System.out.println("5: Mostrar Reservas");
        System.out.println("9: Ir al menu principal");
        System.out.print("Selecciona una opcion : ");
    }
}
