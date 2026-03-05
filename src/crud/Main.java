package crud;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        UsuarioService misUsuarios = new UsuarioService();
        //Crear Usuarios
        Usuario usuario1 = new Usuario(1, "Oswaldo", "kaoswaldo16@hotmail.com");
        Usuario usuario2 = new Usuario(2, "Ana", "Ana@hotmail.com");
        Usuario usuario3 = new Usuario(3, "Carlos", "Carlos@hotmail.com");

        //Create agregar Usuarios
        misUsuarios.agregarUsuario(usuario1);
        misUsuarios.agregarUsuario(usuario2);
        misUsuarios.agregarUsuario(usuario3);

        //Read mostrar todos los usuarios
        System.out.println("MOSTRAR TODOS LOS USUARIOS");

        ArrayList<Usuario> listaUsuarios = misUsuarios.leerUsuarios(); //Se guarda el metodo en una variable

        for (Usuario usuarioM : listaUsuarios) {
            System.out.println(usuarioM);
        }
        /* for (int i = 0; i < lista.size();i++){
           System.out.println(lista.get(i));
        } */

        //Read Buscar usuarios por id
        System.out.println("BUSCAR USUARIOS POR ID");

        Usuario encontrado = misUsuarios.buscarUsuarioId(1);
        System.out.println(encontrado);

        Usuario noEncontrado = misUsuarios.buscarUsuarioId(6);
        System.out.println(noEncontrado);

        //UPDATE actualizar usuarios
        System.out.println("ACTUALIZAR EMAIL");

        boolean actualizado = misUsuarios.actualizarEmail(2, "emailactualizado");

        if (actualizado) {
            System.out.println("Email actualizado correctamente");
        } else {
            System.out.println("Usuario no encontrado");
        }

        //Mostramos usuarios despues de actualizar

        listaUsuarios = misUsuarios.leerUsuarios();

        for (Usuario usuarioM : listaUsuarios) {
            System.out.println(usuarioM);
        }

        //DELETE
        System.out.println("Eliminar Usuario");

        boolean borrar = misUsuarios.eliminarUsuario(2);

        if(borrar){
            System.out.println("Se elimino correctamente");
        }
        else{
            System.out.println("Usuario no eliminado");
        }
        listaUsuarios = misUsuarios.leerUsuarios();

        for(Usuario usuarioM : listaUsuarios){
            System.out.println(usuarioM);
        }
    }
}

