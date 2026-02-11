/*
Objetivo del ejercicio,Crear una clase que gestione usuarios en memoria, usando ArrayList<Usuario>,
separando la lógica de negocio del modelo (Usuario).
Esto simula el comportamiento de un service de backend real, pero sin Spring aún.
📌 Consigna
1️⃣ Crear la clase UsuarioService Debe ser una clase independiente de Usuario.
Su responsabilidad es gestionar usuarios, no representarlos.) para recorrer la lista
La clase debe tener: Un atributo privado que sea una lista de usuarios
Inicializada correctamente para poder usarse desde el inicio
(piensa: “esto simula una base de datos en memoria”)
3️⃣ Métodos obligatorios (firma y comportamiento)
Implementa los siguientes métodos:
🔹 Crear Un metodo que reciba un usuario y lo agregue a la lista. Leer (por id)
Un metodo que reciba un id Recorra la lista
Devuelva el usuario correspondiente Si no existe, debe devolver null Leer (todos)
Un metodo que devuelva la lista completa de usuarios Importante
NO hagas System.out.println() dentro del service
El service no imprime, solo gestiona datos
Usa bucles (for o for-each) para recorrer la lista
 */
import java.util.ArrayList;
public class UsuarioService{
    ArrayList<Usuario>listaUsuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario){
            listaUsuarios.add(usuario);
        }

    public Usuario listarUsuarioId(int id){
        for(int i = 0; i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getId() == id){
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public ArrayList<Usuario> listarTodoslosUsuarios(){
            return listaUsuarios;
        }

        //Actualizar usuario existente

    public boolean actualizarUsuario(int id, String nombre, String email){
          for(int i = 0;i<listaUsuarios.size();i++){
              if(listaUsuarios.get(i).getId() == id){
                  listaUsuarios.get(i).setId(id);
                    listaUsuarios.get(i).setNombre(nombre);
                    listaUsuarios.get(i).setEmail(email);
              }
        }
          return  false;
        }
}







