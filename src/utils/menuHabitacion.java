package utils;

import java.util.Scanner;

import connection.HabitacionManagement;
import models.Habitacion;

public class menuHabitacion {
    public static void getMenu(int option) {

        HabitacionManagement hr = new HabitacionManagement();

        Scanner input = new Scanner(System.in);
        do {
            menu();
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.print(
                            "Ingresa el Numero de Habitacion ? ");
                    int numeroHabitacion = input.nextInt();
                    input.nextLine();
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
                    input.nextLine();
                    Habitacion habitacion = new Habitacion(numeroHabitacion, tipoHbaitacion,
                            precio, estado);

                    hr.add(habitacion);
                    System.out.println(habitacion.toString());

                    break;

                case 2:

                    System.out.print(
                            "Cual es el codigo de la Habitacion ? ");
                    int eId = input.nextInt();

                    hr.delete(eId);

                    break;

                case 3:

                    System.out.print(
                            "Cual es el codigo de la Habitacion? ");

                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);

                    break;

                case 4:

                    System.out.print(
                            "Cual es el codigo de la Habitacion ? ");
                    int codigoHabitacion = input.nextInt();

                    if (!hr.find(codigoHabitacion)) {
                        System.out.println(
                                "El Habitacion no existe\n");
                    }

                    break;

                case 5:
                    hr.display();
                    break;

                case 9:

                    System.out.println(
                            "\nGracias por usar el programa de Paulito y el Juanca!\n");
                    System.exit(0);

                    break;
                default:

                    System.out.println("\nOpciones invalidas\n");
                    break;
            }
        } while (option != 9);
    }

    public static void menu() {

        System.out.println("MENU");
        System.out.println("1: Agregar Habitacion");
        System.out.println("2: Borrar Habitacion");
        System.out.println("3: Update Habitacion");
        System.out.println("4: Buscar Habitacion");
        System.out.println("5: Mostrar Habitacions");
        System.out.println("9: Salir del progrma");
        System.out.print("Selecciona una opcion : ");
    }
}
