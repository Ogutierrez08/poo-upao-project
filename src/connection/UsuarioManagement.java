package connection;

import java.util.LinkedList;
import java.util.Scanner;

import models.Usuario;

public class UsuarioManagement {
    LinkedList<Usuario> list; 
    public UsuarioManagement() { 
        list = new LinkedList<>(); 
    }

    public void add(Usuario usuario) {

        if (!find(usuario.getDni())) { 
            list.add(usuario); 
        } else {

            System.out.println(
                    "El Usuario ya existe en la lista");
        }
    }

    public boolean find(int codigoUsuario) { 

        for (Usuario u : list) {

            if (u.getDni() == codigoUsuario) {

                System.out.println(u);
                return true;
            }
        }
        return false;
    }

    public void delete(int codigoUsuario) {
        Usuario UsuarioDel = null;

        for (Usuario u : list) {

            if (u.getDni() == codigoUsuario) {
                UsuarioDel = u;
            }
        }

        if (UsuarioDel == null) {

            System.out.println("Id ingresado es invalido");
        } else {

            list.remove(UsuarioDel);
            System.out.println(
                    "El Usuario fue removido de la lista satisfactoriamente");
        }
    }

    public Usuario findUsuario(int codigoUsuario) {

        for (Usuario e : list) {

            if (e.getDni() == codigoUsuario) {
                return e;
            }
        }

        return null;
    }

    public void update(int codigoUsuario, Scanner input) {

        if (find(codigoUsuario)) {
            Usuario u = findUsuario(codigoUsuario);

            System.out.print(
                    "Ingresa el nuevo nombre ? ");
            String name = input.nextLine();

            System.out.print(
                    "Ingresa el nuevo apellido ");
            String apellido = input.nextLine();

            System.out.print(
                    "Ingresa la nueva contraseña? ");
            String password = input.nextLine();

            System.out.print(
                    "Ingresa la nueva direccion? ");
            String direccion = input.nextLine();

            System.out.print(
                    "Ingresa el nuevo dni? ");
            int dni = input.nextInt();
            input.nextLine();
            System.out.print(
                    "Ingresa la nueva edad? ");
            int edad = input.nextInt();
            input.nextLine();
            System.out.print(
                    "Ingresa el nuevo sexo? ");
            String sexo = input.nextLine();


            u.setNombre(name);
            u.setApellido(apellido);
            u.setContraseña(password);
            u.setDireccion(direccion);
            u.setDni(dni);
            u.setEdad(edad);
            u.setSexo(sexo);
           
            System.out.println(
                    "Se actualizo el Usuario satisfactoriamente");
        } else {

            System.out.println(
                    "El codigo ingresado no se encuentra en la lista de Usuarios");
        }
    }

    public void display() {

        if (list.isEmpty()) {

            System.out.println("La lista no tiene Usuarios\n");
        }

        for (Usuario e : list) {

            System.out.println(e.toString());
        }
    }
}
