package utils;

import java.util.Scanner;

import connection.UsuarioManagement;
import models.Usuario;

public class menuUsuario {

    public static void getMenu(int option) {
        UsuarioManagement hr = new UsuarioManagement();

        Scanner input = new Scanner(System.in);
        do {
            menu();
            option = input.nextInt();

            switch (option) {

                case 1:

                    System.out.print(
                            "Ingresa el DNI ? ");
                    int codigo = input.nextInt();

                    System.out.print(
                            "Ingresa el  nombre ? ");
                    String name = input.nextLine();
                    input.nextLine();

                    System.out.print(
                            "Ingresa el  apellido? ");
                    String apellido = input.nextLine();

                    System.out.print(
                            "Ingresa la  edad? ");
                    int edad = input.nextInt();

                    System.out.print(
                            "Ingresa el  sexo? ");
                    String sexo = input.nextLine();

                    System.out.print(
                            "Ingresa la  contraseña? ");
                    String password = input.nextLine();

                    System.out.print(
                            "Ingresa la  direccion? ");
                    String direccion = input.nextLine();

                    Usuario Usuario = new Usuario(codigo, name,apellido,edad,sexo,direccion,password);

                    hr.add(Usuario);
                    System.out.println(Usuario.toString());

                    break;

                case 2:

                    System.out.print(
                            "Cual es el codigo del Usuario ? ");
                    int eId = input.nextInt();

                    hr.delete(eId);

                    break;

                case 3:

                    System.out.print(
                            "Cual es el codigo del Usuario? ");

                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);

                    break;

                case 4:

                    System.out.print(
                            "Cual es el codigo del Usuario ? ");
                    int codigoUsuario = input.nextInt();

                    if (!hr.find(codigoUsuario)) {
                        System.out.println(
                                "El Usuario no existe\n");
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
        System.out.println("1: Agregar Usuario");
        System.out.println("2: Borrar Usuario");
        System.out.println("3: Update Usuario");
        System.out.println("4: Buscar Usuario");
        System.out.println("5: Mostrar Usuarios");
        System.out.println("9: Ir al menu principal");
        System.out.print("Selecciona una opcion : ");
    }
}
