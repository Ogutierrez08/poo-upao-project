package utils;

import java.util.Scanner;

public class menuGeneral {
    public static void getMenuGeneral(int option) {

        Scanner input = new Scanner(System.in);
        do {
            menu();
            option = input.nextInt();

            switch (option) {

                case 1:
                    menuEmpleado.getMenu(option);

                    break;

                case 2:
                    menuHabitacion.getMenu(option);

                    break;

                case 3:
                    menuHuesped.getMenu(option);
                    break;

                case 4:
                    menuReserva.getMenu(option);
                    break;

                case 5:
                    menuUsuario.getMenu(option);
                case 9:
                    System.out.println("Gracias por visitar el programa de Paul y Juanca");
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
        System.out.println("1: Menu Empleado");
        System.out.println("2: Menu Habitacion");
        System.out.println("3: Menu Huesped");
        System.out.println("4: Menu Reserva");
        System.out.println("5: Menu Usuario");
        System.out.println("9: Salir del progrma");
        System.out.print("Selecciona una opcion : ");
    }
}
