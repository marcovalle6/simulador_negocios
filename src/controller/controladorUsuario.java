package controller;

import include.Usuario;
import model.modeloUsuario;


import java.util.ArrayList;

public class controladorUsuario {
    public boolean agregarUsuario(Usuario usuario){
        modeloUsuario usuario1 = new modeloUsuario();
        return usuario1.insertarUsuario(usuario);
}


    public static void main(String[] args){
        controladorUsuario cc = new controladorUsuario();
        //Agregar un elemnto
       //System.out.println(cc.agregarUsuario(new Usuario(1, "Leonel", "leonelgv", "2018-11-21", 1 )));


        //Listar todos los elementos de la tabla
        ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
        Usuarios = cc.obtenerUsuarios();
        for (int a=0;a<Usuarios.size();a++){
            //System.out.println("idusuario: " + Usuarios.get(a).getIdusuario());
            System.out.println("usuario: " +Usuarios.get(a).getUsuario());
            System.out.println("password: " +Usuarios.get(a).getPassword());
            System.out.println("last_access: " +Usuarios.get(a).getLast_access());
            System.out.println("tipoUsuario_idtipoUsuario: " +Usuarios.get(a).getTipoUsuario_idtipoUsuario());

            System.out.println();
        }


        //Listar un elemento de la tabla por su llave primaria
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Usuarios = cc.obtenerUsuario(1);

        for (int b=0;b<Usuarios.size();b++) {
            System.out.println("idusuario: " + Usuarios.get(b).getIdusuario());
            System.out.println("usuario: " +Usuarios.get(b).getUsuario());
            System.out.println("password: " +Usuarios.get(b).getPassword());
            System.out.println("last_access: " +Usuarios.get(b).getLast_access());
            System.out.println("tipoUsuario_idtipoUsuario: " +Usuarios.get(b).getTipoUsuario_idtipoUsuario());

            System.out.println();
        }

        //Modificar un elemento
        //System.out.println(cc.actualizarUsuario(new Usuario(1, "Leonel", "leonelgv", "2018-11-19", 3)));

        //Eliminarar un elemento
        //System.out.println(cc.eliminarUsuario( 3));


    }

    public ArrayList<Usuario> obtenerUsuarios(){
        modeloUsuario Usuarios = new modeloUsuario();
        return Usuarios.obtenerUsuarios();
    }



    public ArrayList<Usuario> obtenerUsuario(int idusuario){
        modeloUsuario Usuario = new modeloUsuario();
        return Usuario.obtenerUsuario(idusuario);
    }

    public boolean actualizarUsuario(Usuario usuario){
        modeloUsuario Usuario1 = new modeloUsuario();
        return Usuario1.actualizarUsuario(usuario);
    }

    public boolean eliminarUsuario(int idusuario){
        modeloUsuario Usuario1 = new modeloUsuario();
        return Usuario1.borrarUsuario(idusuario);
    }


}
