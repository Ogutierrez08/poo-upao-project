package utils;

import java.util.Scanner;

import connection.EmpleadoManagement;
import models.Empleado;

public class menuEmpleado {

        public static void getMenu(int option) {

                EmpleadoManagement hr = new EmpleadoManagement();

                Scanner input = new Scanner(System.in);
                do {
                        menu();
                        option = input.nextInt();

                        switch (option) {

                                case 1:

                                        System.out.print(
                                                        "Ingresa el codigo ? ");
                                        int codigo = input.nextInt();

                                        System.out.print(
                                                        "Ingresa el  nombre ? ");
                                        String name = input.nextLine();
                                        input.nextLine();

                                        System.out.print(
                                                        "Ingresa el  apellido? ");
                                        String apellido = input.nextLine();

                                        System.out.print(
                                                        "Ingresa la  categoria? ");
                                        String categoria = input.nextLine();

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
                                                        "Ingresa el  sueldo? ");
                                        double sueldo = input.nextDouble();

                                        Empleado empleado = new Empleado(
                                                        dni, name, apellido, edad, sexo, direccion, password, codigo,
                                                        sueldo, categoria);

                                        hr.add(empleado);
                                        System.out.println(empleado.toString());

                                        break;

                                case 2:

                                        System.out.print(
                                                        "Cual es el codigo del empleado ? ");
                                        int eId = input.nextInt();

                                        hr.delete(eId);

                                        break;

                                case 3:

                                        System.out.print(
                                                        "Cual es el codigo del Empleado? ");

                                        int rIdNo = input.nextInt();
                                        hr.update(rIdNo, input);

                                        break;

                                case 4:

                                        System.out.print(
                                                        "Cual es el codigo del empleado ? ");
                                        int codigoEmpleado = input.nextInt();

                                        if (!hr.find(codigoEmpleado)) {
                                                System.out.println(
                                                                "El empleado no existe\n");
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
                System.out.println("1: Agregar Empleado");
                System.out.println("2: Borrar Empleado");
                System.out.println("3: Update Empleado");
                System.out.println("4: Buscar Empleado");
                System.out.println("5: Mostrar Empleados");
                System.out.println("9: Ir al menu principal");
                System.out.print("Selecciona una opcion : ");
        }
}
