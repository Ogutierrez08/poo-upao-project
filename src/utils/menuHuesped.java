package utils;

import java.util.Scanner;

import connection.HuespedManagement;
import models.Huesped;

public class menuHuesped {
        public static void getMenu(int option) {
                HuespedManagement hr = new HuespedManagement();

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
                                                        "Ingresa el  nombre ? ");
                                        String name = input.nextLine();
                                        input.nextLine();

                                        System.out.print(
                                                        "Ingresa el  apellido? ");
                                        String apellido = input.nextLine();

                                        System.out.print(
                                                        "Ingresa la  contraseña? ");
                                        String password = input.nextLine();

                                        System.out.print(
                                                        "Ingresa la  direccion? ");
                                        String direccion = input.nextLine();

                                        System.out.print(
                                                        "Ingresa el  dni? ");
                                        int dni = input.nextInt();
                                        input.nextLine();
                                        System.out.print(
                                                        "Ingresa la  edad? ");
                                        int edad = input.nextInt();
                                        input.nextLine();
                                        System.out.print(
                                                        "Ingresa el  sexo? ");
                                        String sexo = input.nextLine();

                                        System.out.print(
                                                        "Ingresa el correo? ");
                                        String correo = input.nextLine();

                                        System.out.print(
                                                        "Ingresa la  Fecha Llegada? ");
                                        String fecLlegada = input.nextLine();

                                        System.out.print(
                                                        "Ingresa la  Fecha Salida? ");
                                        String fecSalida = input.nextLine();

                                        Huesped Huesped = new Huesped(
                                                        dni, name, apellido, edad, sexo, direccion, password, codigo,
                                                        correo, fecLlegada, fecSalida);

                                        hr.add(Huesped);
                                        System.out.println(Huesped.toString());

                                        break;

                                case 2:

                                        System.out.print(
                                                        "Cual es el codigo del Huesped ? ");
                                        int eId = input.nextInt();

                                        hr.delete(eId);

                                        break;

                                case 3:

                                        System.out.print(
                                                        "Cual es el codigo del Huesped? ");

                                        int rIdNo = input.nextInt();
                                        hr.update(rIdNo, input);

                                        break;

                                case 4:

                                        System.out.print(
                                                        "Cual es el codigo del Huesped ? ");
                                        int codigoHuesped = input.nextInt();

                                        if (!hr.find(codigoHuesped)) {
                                                System.out.println(
                                                                "El Huesped no existe\n");
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
                System.out.println("1: Agregar Huesped");
                System.out.println("2: Borrar Huesped");
                System.out.println("3: Update Huesped");
                System.out.println("4: Buscar Huesped");
                System.out.println("5: Mostrar Huespedes");
                System.out.println("9: Ir al menu principal");
                System.out.print("Selecciona una opcion : ");
        }
}
