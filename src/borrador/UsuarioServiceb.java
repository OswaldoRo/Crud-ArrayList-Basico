package borrador;

import java.util.ArrayList;
public class UsuarioServiceb{

    ArrayList<Usuariob>listaUsuariosb = new ArrayList<>();

    // Agregar usuarios al array // Create-Crear

    public void agregarUsuariosb(Usuariob usuariob){
        listaUsuariosb.add(usuariob);
    }

    // Leer o buscar por id a un Usuario // Read-Buscar

    public Usuariob buscarId(int id){
        for(int i = 0;i < listaUsuariosb.size();i++){
            if(listaUsuariosb.get(i).getId() == id){
                return listaUsuariosb.get(i);
            }
        }
        return null;
    }

    // Devuelve la lista completa de usuarios -Read-buscar lista completa

    public ArrayList<Usuariob> decolverLista(){
           return listaUsuariosb ;
        }

    // Actualizar Update

    public boolean actualizarUsuarios(Usuariob usuarioActualizado){
        for(int i = 0; i < listaUsuariosb.size();i++){
         if (listaUsuariosb.get(i).getId() == usuarioActualizado.getId() ){
             listaUsuariosb.set(i, usuarioActualizado);
             return true;
         }

        }
        return false;
    }

}









