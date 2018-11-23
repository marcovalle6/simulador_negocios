package controller;

import include.Perfil;
import model.modeloPerfil;

import java.util.ArrayList;

public class controladorPerfilUsuario {
    public boolean agregarPerfilUsuario(Perfil perfil){
        modeloPerfil perfil1 = new modeloPerfil();
        return perfil1.insertarPerfil(perfil);
    }

    public static void main(String[] args){
        controladorPerfilUsuario cc = new controladorPerfilUsuario();
        //Agregar un elemnto
        //System.out.println(cc.agregarPerfilUsuario(new Perfil(6, "Leonel", "Gonzalez", "Vidales", "LEGV12345", "leonelgv@gmail.com", "6726302", "Morelos", "Linda vista", "40660", "Altamirano", "Guerrero")));


        //Listar todos los elementos de la tabla
        ArrayList<Perfil> Perfiles = new ArrayList<Perfil>();
        Perfiles = cc.obtenerPerfiles();
        for (int a=0;a<Perfiles.size();a++){
            //System.out.println("idperfil: " + Perfiles.get(a).getIdperfil());
            System.out.println("nombre_usuario: " +Perfiles.get(a).getNombre_usuario());
            System.out.println("apellido_p_usuario: " +Perfiles.get(a).getApellido_p_usuario());
            System.out.println("apellido_m_usuario: " +Perfiles.get(a).getApellido_m_usuario());
            System.out.println("rfc_usuario: " +Perfiles.get(a).getRfc_usuario());
            System.out.println("email_usuario: " +Perfiles.get(a).getEmail_usuario());
            System.out.println("telefono_usuario: " +Perfiles.get(a).getTelefono_usuario());
            System.out.println("domicilio_usuario: " +Perfiles.get(a).getDomicilio_usuario());
            System.out.println("colonia_usuario: " +Perfiles.get(a).getColonia_usuario());
            System.out.println("codigo_postal_usuario: " +Perfiles.get(a).getCodigo_postal_usuario());
            System.out.println("ciudad_usuario: " +Perfiles.get(a).getCiudad_usuario());
            System.out.println("estado_usuario: " +Perfiles.get(a).getEstado_usuario());
            System.out.println();
        }


        //Listar un elemento de la tabla por su llave primaria
        ArrayList<Perfil> perfiles = new ArrayList<Perfil>();
        Perfiles = cc.obtenerPerfil(1);

        for (int b=0;b<Perfiles.size();b++) {
            System.out.println("idperfil: " + Perfiles.get(b).getIdperfil());
            System.out.println("nombre_usuario: " + Perfiles.get(b).getNombre_usuario());
            System.out.println("apellido_p_usuario: " + Perfiles.get(b).getApellido_p_usuario());
            System.out.println("apellido_m_usuario: " + Perfiles.get(b).getApellido_m_usuario());
            System.out.println("rfc_usuario: " + Perfiles.get(b).getRfc_usuario());
            System.out.println("email_usuario: " + Perfiles.get(b).getEmail_usuario());
            System.out.println("telefono_usuario: " + Perfiles.get(b).getTelefono_usuario());
            System.out.println("domicilio_usuario: " + Perfiles.get(b).getDomicilio_usuario());
            System.out.println("colonia_usuario: " + Perfiles.get(b).getColonia_usuario());
            System.out.println("codigo_postal_usuario: " + Perfiles.get(b).getCodigo_postal_usuario());
            System.out.println("ciudad_usuario: " + Perfiles.get(b).getCiudad_usuario());
            System.out.println("estado_usuario: " + Perfiles.get(b).getEstado_usuario());
            System.out.println();
        }

        //Modificar un elemento
        //System.out.println(cc.actualizarPerfil(new Perfil(6, "Leonel", "Gonzalez", "Vidales", "LEGV12345", "leonelgv@gmail.com", "6726302", "Morelos", "Linda vista", "40664", "Altamirano", "Guerrero")));

        //Eliminarar un elemento
       //System.out.println(cc.eliminarPerfil( 6));


    }

    public ArrayList<Perfil> obtenerPerfiles(){
        modeloPerfil Perfiles = new modeloPerfil();
        return Perfiles.obtenerPerfiles();
    }



    public ArrayList<Perfil> obtenerPerfil(int idperfil){
        modeloPerfil Perfil = new modeloPerfil();
        return Perfil.obtenerPerfil(idperfil);
    }

    public boolean actualizarPerfil(Perfil perfil){
        modeloPerfil Perfil1 = new modeloPerfil();
        return Perfil1.actualizarPerfil(perfil);
    }

    public boolean eliminarPerfil(int idperfil){
        modeloPerfil Perfil1 = new modeloPerfil();
        return Perfil1.borrarPerfil(idperfil);
    }


}
