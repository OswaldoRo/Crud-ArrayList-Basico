package borrador;

import java.util.ArrayList;
public class UsuarioServiceb{

    ArrayList<Usuariob>listaUsuariosb = new ArrayList<>();

    //Agregar usuarios al array

    public void agregarUsuariosb(Usuariob usuariob){
        listaUsuariosb.add(usuariob);
    }

    // Leer o buscar por id

    public Usuariob buscarId(int id){
        for(int i = 0;i < listaUsuariosb.size();i++){
            if(listaUsuariosb.get(i).getId() == id){
                return listaUsuariosb.get(i);
            }
        }
        return null;
    }

    // Devuelve la lista completa de usuarios











    public ArrayList<Usuariob> mostrarLista(){
        return listaUsuarios;
    }
}

