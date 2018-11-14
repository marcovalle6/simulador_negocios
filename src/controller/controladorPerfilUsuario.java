package controller;

import include.Perfil;
import model.modeloPerfil;

public class controladorPerfilUsuario {
    public boolean agregarPerfilUsuario(Perfil perfil){
        modeloPerfil perfil1 = new modeloPerfil();
        return perfil1.insertarPerfil(perfil);
    }

    public static void main(String[] args){
        controladorPerfilUsuario cc = new controladorPerfilUsuario();
        System.out.println(cc.agregarPerfilUsuario(new Perfil("Marco", "Valle", "Toledo", "VTO123", "valle@gmail.com", "1234567890", "Zocalo", "Centro", "40660", "Altamirano", "Guerrero")));
    }


}
