package crud;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        UsuarioService misUsuarios = new UsuarioService();

        Usuario usuario1 = new Usuario(1, "Oswaldo", "kaoswaldo16@hotmail.com");
        Usuario usuario2 = new Usuario(2, "Ana", "Ana@hotmail.com");
        Usuario usuario3 = new Usuario(3, "Carlos", "Carlos@hotmail.com");

        //Metodo agregar Usuarios

        misUsuarios.agregarUsuario(usuario1);
        misUsuarios.agregarUsuario(usuario2);
        misUsuarios.agregarUsuario(usuario3);

        //Metodo Read leer usuarios por id

        Usuario encontrado = misUsuarios.buscarUsuarioId(1);
        System.out.println(encontrado);

        Usuario noEncontrado = misUsuarios.buscarUsuarioId(6);
        System.out.println(noEncontrado);

        //Metodo Read todos los usuarios
        ArrayList<Usuario> lista = misUsuarios.leerUsuarios(); //Se guarda el metodo en una variable

        for (Usuario usuarioM : lista) {
            System.out.println(usuarioM);
        }

        /*
        for (int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }
        */

        //Metodo actualizar usuarios
        System.out.println("METODO ACTUALIZAR");
        System.out.println("Mostramos usuarios ante de actualizar");

        for (Usuario usuarioM : misUsuarios.leerUsuarios()) {
            System.out.println(usuarioM);
        }

        boolean actualizar = misUsuarios.actualizarEmail(2, "emailactualizado");

        if (actualizar) {
            System.out.println("Email actualizado");
        } else {
            System.out.println("Email no actualizado ");
        }
        System.out.println("Mostramos usuarios despues de actualizar");

        for (Usuario usuarioM : misUsuarios.leerUsuarios()) {
            System.out.println(usuarioM);
        }

        //Metodo delete
        System.out.println("Metodo delete");

        for (Usuario usuarioM : misUsuarios.leerUsuarios()) {
            System.out.println(usuarioM);
        }

        boolean borrar = misUsuarios.eliminarUsuario(2);

        if(borrar){
            System.out.println("Se elimino correctamente");
        }
        else{
            System.out.println("Usuario no eliminado");
        }

        for(Usuario usuarioM : misUsuarios.leerUsuarios()){
            System.out.println(usuarioM);

        }
    }
}

